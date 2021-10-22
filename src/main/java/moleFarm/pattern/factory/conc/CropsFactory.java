package moleFarm.pattern.factory.conc;

import moleFarm.pattern.factory.Factory;
import moleFarm.common.product.AbstractCrops;
import moleFarm.common.utils.MyException;

/**
 *
 * 作物的抽象工厂类，此处不再写具体工厂类，如CabbageFactory；
 */
public class CropsFactory implements Factory {
    final static String PATH = "moleFarm.common.product.crops.";
    final static String MSG = "没有该作物销售噢";
    private static volatile CropsFactory cropsFactory;
    /**
     * 单例模式
     *
     * @return
     */
    public synchronized static CropsFactory newInstance() {
        if (cropsFactory == null) {
            cropsFactory = new CropsFactory();
        }
        return cropsFactory;
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
