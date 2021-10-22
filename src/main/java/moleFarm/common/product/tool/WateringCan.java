package moleFarm.common.product.tool;

import moleFarm.common.product.AbstractTool;

/**
 * 浇水壶
 * 用于浇水
 */
public class WateringCan extends AbstractTool {

    private final String name = "浇水壶";
    @Override
    public void ToolBehavior() {

    }
    public String getName() {
        return name;
    }
}
