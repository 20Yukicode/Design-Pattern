package moleFarm.common.product;

import moleFarm.pattern.adapter.Target;

/**
 * 抽象农场工具
 */
public abstract class AbstractTool implements Target,IMole {
    /**
     * 名字
     */
    protected String name;
    /**
     * 工具的处理行为
     */
    public abstract void ToolBehavior();


}
