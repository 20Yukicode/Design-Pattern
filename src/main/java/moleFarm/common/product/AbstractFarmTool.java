package moleFarm.common.product;

import moleFarm.common.product.useless.IMole;

/**
 * 抽象农场工具
 */
public abstract class AbstractFarmTool implements IMole {
    /**
     * 名字
     */
    protected String name;

    public String getName() {
        return name;
    }

    /**
     * 工具的处理行为
     */
    public abstract void ToolBehavior();
}
