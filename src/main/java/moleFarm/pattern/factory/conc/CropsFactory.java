package moleFarm.pattern.factory.conc;

import moleFarm.common.utils.JsonOp;
import moleFarm.pattern.factory.Factory;
import moleFarm.common.product.AbstractCrops;
import moleFarm.common.utils.MyException;

/**
 *
 * 作物的抽象工厂类，此处不再写具体工厂类，如CabbageFactory；
 */
public class CropsFactory implements Factory {
    final static String PATH = JsonOp.getPathJson("CropsFactory");
    final static String MSG = JsonOp.getMsgJson("CropsFactory");
    private static volatile CropsFactory cropsFactory;
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