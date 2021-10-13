package mole.farm.common.farmabstract;

import mole.farm.common.farmabstract.useless.IMole;

/**
 * 抽象农场工具
 */
public abstract class AbstractFarmTool implements IMole {
    protected String name;
    /**
     * 工具的处理行为
     */
    public abstract void ToolBehavior();
}
