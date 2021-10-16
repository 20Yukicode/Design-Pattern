package moleFarm.common.factory;

import moleFarm.common.status.ProductType;
import moleFarm.common.other.JsonOp;
import moleFarm.common.other.MyException;

import java.util.List;

public  class  FarmObjectFactory {
    final static String message="对应的产品尚未加入摩尔庄园,敬请期待......";
    /**
     *
     * @param name
     * @param <T>
     * @return
     * @throws MyException
     */
    public static <T> T createFarmProduct(String name) throws MyException {
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
}
