package moleFarm.pattern.factory.conc;

import moleFarm.pattern.factory.Factory;
import moleFarm.common.product.AbstractFertilizer;
import moleFarm.common.utils.MyException;

/**
 * 肥料的抽象工厂类，此处不再写具体的，如PrimaryFertilizerFactory
 */
public class FertilizerFactory implements Factory {
    final static String PATH = "moleFarm.common.product.fertilizer.";
    final static String MSG = "没有该肥料销售噢";
    private static volatile FertilizerFactory fertilizerFactory;
    private FertilizerFactory(){}
    public synchronized static FertilizerFactory newInstance() {
        if (fertilizerFactory == null) {
            fertilizerFactory = new FertilizerFactory();
        }
        return fertilizerFactory;
    }
    @Override
    public AbstractFertilizer create(String name) throws MyException {
        return Factory.createProduct(MSG, PATH + name);
    }
}
