package moleFarm.pattern.factory.conc;

import moleFarm.pattern.factory.Factory;
import moleFarm.common.product.AbstractTool;
import moleFarm.common.utils.MyException;

/**
 * 工具的抽象工厂类，此处不再写具体的，如ConcreteFarmToolFactory
 */
public class ToolFactory implements Factory {
    final static String PATH = "moleFarm.common.product.tool.";
    final static String MSG = "没有该工具销售噢";
    private static volatile ToolFactory toolFactory;
    private ToolFactory(){}
    public synchronized static ToolFactory newInstance() {
        if (toolFactory == null) {
            toolFactory = new ToolFactory();
        }
        return toolFactory;
    }
    @Override
    public AbstractTool create(String name) throws MyException {
        return Factory.createProduct(MSG,PATH+name);
    }
}
