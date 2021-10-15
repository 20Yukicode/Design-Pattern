package moleFarm.concrete.factory;

import moleFarm.common.exception.MyException;
import moleFarm.common.farmabstract.AbstractSeed;

public class SeedFactory implements Factory{
    final static String path="moleFarm.concrete.seed.";
    final static String msg="没有该种子销售噢";
    SeedFactory seedFactory;
    @Override
    public Factory newInstance() {
        if(seedFactory==null) {
            seedFactory = new SeedFactory();
        }
        return seedFactory;
    }
    /**
     * 根据种子的名字生产对应的种子
     * @param name
     * @return
     * @throws MyException
     */
    public static AbstractSeed createSeed(String name) throws MyException {
        AbstractSeed abstractSeed =
                Factory.create(msg, path+name);
        return abstractSeed;
    }
}

