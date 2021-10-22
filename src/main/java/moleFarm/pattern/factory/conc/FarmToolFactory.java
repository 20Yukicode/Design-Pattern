package moleFarm.pattern.factory.conc;

import moleFarm.pattern.factory.Factory;
import moleFarm.common.product.AbstractFarmTool;
import moleFarm.common.utils.MyException;

/**
 * 工具的抽象工厂类，此处不再写具体的，如ConcreteFarmToolFactory
 */
public class FarmToolFactory implements Factory {
    final static String PATH = "moleFarm.common.product.tool.";
    final static String MSG = "没有该工具销售噢";
    private static volatile FarmToolFactory farmToolFactory;
    private FarmToolFactory(){}
    public synchronized static FarmToolFactory newInstance() {
        if (farmToolFactory == null) {
            farmToolFactory = new FarmToolFactory();
        }
        return farmToolFactory;
    }
    @Override
    public AbstractFarmTool create(String name) throws MyException {
        return Factory.createProduct(MSG,PATH+name);
    }
}
