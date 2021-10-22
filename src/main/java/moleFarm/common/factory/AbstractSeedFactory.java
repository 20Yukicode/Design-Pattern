package moleFarm.common.factory;

import moleFarm.common.product.AbstractSeed;
import moleFarm.other.MyException;

/**
 * 种子抽象工厂类，此处不再写具体的，如CabbageSeedFactory
 */
public class AbstractSeedFactory implements Factory {
    final static String PATH = "moleFarm.concrete.seed.";
    final static String MSG = "没有该种子销售噢";
    private static volatile AbstractSeedFactory abstractSeedFactory;
    private AbstractSeedFactory() {}
    /**
     * 单例模式
     *
     * @return
     */
    public synchronized static AbstractSeedFactory newInstance() {
        if (abstractSeedFactory == null) {
            abstractSeedFactory = new AbstractSeedFactory();
        }
        return abstractSeedFactory;
    }
    /**
     * 根据种子的名字生产对应的种子
     *
     * @param name
     * @return
     * @throws MyException
     */
    public AbstractSeed create(String name) throws MyException {
        return Factory.createProduct(MSG, PATH+name);
    }
}

