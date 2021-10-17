package moleFarm.common.factory;

import moleFarm.common.product.AbstractFertilizer;
import moleFarm.common.other.MyException;

/**
 * 肥料的抽象工厂类，此处不再写具体的，如PrimaryFertilizerFactory
 */
public class AbstractFertilizerFactory implements Factory{
    final static String PATH = "moleFarm.concrete.fertilizer.";
    final static String MSG = "没有该肥料销售噢";
    private static volatile AbstractFertilizerFactory abstractFertilizerFactory;
    private AbstractFertilizerFactory(){}
    public synchronized static AbstractFertilizerFactory newInstance() {
        if (abstractFertilizerFactory == null) {
            abstractFertilizerFactory = new AbstractFertilizerFactory();
        }
        return abstractFertilizerFactory;
    }
    @Override
    public AbstractFertilizer create(String name) throws MyException {
        return Factory.create(MSG,PATH+name);
    }

}
