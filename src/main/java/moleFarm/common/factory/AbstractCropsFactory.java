package moleFarm.common.factory;

import moleFarm.common.product.AbstractCrops;
import moleFarm.common.product.useless.IMole;
import moleFarm.concrete.crops.Cabbage;
import moleFarm.other.MyException;

/**
 *
 * 作物的抽象工厂类，此处不再写具体工厂类，如CabbageFactory；
 */
public class AbstractCropsFactory implements Factory {
    final static String PATH = "moleFarm.concrete.crops.";
    final static String MSG = "没有该作物销售噢";
    private static volatile AbstractCropsFactory abstractCropsFactory;
    /**
     * 单例模式
     *
     * @return
     */
    public synchronized static AbstractCropsFactory newInstance() {
        if (abstractCropsFactory == null) {
            abstractCropsFactory = new AbstractCropsFactory();
        }
        return abstractCropsFactory;
    }
    /**
     * 根据作物的名字生产对应的作物
     *
     * @param name
     * @return
     * @throws MyException
     */
    @Override
    public AbstractCrops create(String name) throws MyException {
        return Factory.createProduct(MSG, PATH + name);
    }
}
