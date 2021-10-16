package moleFarm.concrete.factory;

import moleFarm.common.other.MyException;
import moleFarm.common.farmabstract.AbstractSeed;

public class AbstractSeedFactory implements Factory{
    final static String PATH="moleFarm.concrete.seed.";
    final static String MSG="没有该种子销售噢";
    private  static AbstractSeedFactory abstractSeedFactory;
    private AbstractSeedFactory(){};
    /**
     * 单例模式
     * @return
     */
    public static AbstractSeedFactory newInstance() {
        if(abstractSeedFactory ==null) {
            abstractSeedFactory = new AbstractSeedFactory();
        }
        return abstractSeedFactory;
    }
    /**
     * 根据种子的名字生产对应的种子
     * @param name
     * @return
     * @throws MyException
     */
    public AbstractSeed create(String name) throws MyException {
        AbstractSeed abstractSeed =
                Factory.create(PATH, MSG+name);
        return abstractSeed;
    }
}

