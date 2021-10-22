package moleFarm.common.product.tool;

import moleFarm.common.product.AbstractFarmTool;

/**
 * 镰刀
 * 用于除草
 */
public class sickle extends AbstractFarmTool {
    private final String name = "镰刀";
    @Override
    public void ToolBehavior() {

    }
    public String getName() {
        return name;
    }
}
