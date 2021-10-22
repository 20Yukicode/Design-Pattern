package moleFarm.common.product.tool;

import moleFarm.common.product.AbstractTool;

/**
 * 镰刀
 * 用于除草
 */
public class Sickle extends AbstractTool {
    private final String name = "镰刀";
    @Override
    public void ToolBehavior() {

    }
    public String getName() {
        return name;
    }
}
