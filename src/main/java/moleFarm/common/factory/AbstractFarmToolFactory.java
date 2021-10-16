package moleFarm.common.factory;

import moleFarm.common.product.AbstractFarmTool;
import moleFarm.common.other.MyException;

public class AbstractFarmToolFactory implements Factory {
    final static String PATH = "moleFarm.concrete.tool.";
    final static String MSG = "没有该工具销售噢";
    private static volatile AbstractFarmToolFactory abstractFarmToolFactory;
    private AbstractFarmToolFactory(){}
    public synchronized static AbstractFarmToolFactory newInstance() {
        if (abstractFarmToolFactory == null) {
            abstractFarmToolFactory = new AbstractFarmToolFactory();
        }
        return abstractFarmToolFactory;
    }
    @Override
    public AbstractFarmTool create(String name) throws MyException {
        return Factory.create(MSG,PATH+name);
    }
}
