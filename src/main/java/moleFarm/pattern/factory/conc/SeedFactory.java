package moleFarm.pattern.factory.conc;

import moleFarm.common.utils.JsonOp;
import moleFarm.pattern.factory.Factory;
import moleFarm.common.product.AbstractSeed;
import moleFarm.common.utils.MyException;

/**
 * 种子抽象工厂类，此处不再写具体的，如CabbageSeedFactory
 */
public class SeedFactory implements Factory {
    final static String PATH = JsonOp.getPathJson("SeedFactory");
    final static String MSG = JsonOp.getMsgJson("SeedFactory");
    private static volatile SeedFactory seedFactory;
    private SeedFactory() {}
    /**
     * 单例模式
     *
     * @return
     */
    public synchronized static SeedFactory newInstance() {
        if (seedFactory == null) {
            seedFactory = new SeedFactory();
        }
        return seedFactory;
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

