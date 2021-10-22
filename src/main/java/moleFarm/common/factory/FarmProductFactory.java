package moleFarm.common.factory;

import moleFarm.common.status.ProductType;
import moleFarm.other.JsonOp;
import moleFarm.other.MyException;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

public  class FarmProductFactory {
    final static String message="对应的产品尚未加入摩尔庄园,敬请期待......";
    /**
     *
     * @param name
     * @param <T>
     * @return
     * @throws MyException
     */
    public static<T> T createFarmProduct(String name) throws MyException {
        List<String> crops = JsonOp.searchJson(ProductType.CROPS);
        List<String> farmTool = JsonOp.searchJson(ProductType.FARM_TOOL);
        List<String> seed = JsonOp.searchJson(ProductType.SEED);
        List<String> fertilizer = JsonOp.searchJson(ProductType.FERTILIZER);
        if (crops.contains(name)) {
            return (T) AbstractCropsFactory.newInstance().create(name);
        } else if (farmTool.contains(name)) {
            return (T) AbstractFarmToolFactory.newInstance().create(name);
        } else if (seed.contains(name)) {
            return (T) AbstractSeedFactory.newInstance().create(name);
        } else if (fertilizer.contains(name)) {
            return (T) AbstractFertilizerFactory.newInstance().create(name);
        } else {
            throw new MyException(message);
        }
    }

    /**
     * 尽量不要用此方法，反射不是初衷，关键要使用工厂模式
     * 其他人在调接口的时候，可能只想传入name(虽然上面的方法有点多此一举就是了)
     * @param tClass
     * @param <T>
     * @return
     * @throws MyException
     */
    public static <T> T createFarmProduct(Class<T>tClass) throws MyException{
        T product=null;
        try {
            product=tClass.getConstructor().newInstance();
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
            throw new MyException(message);
        }
        return product;
    }

}
