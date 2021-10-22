package moleFarm.common.product.tool;

import moleFarm.common.product.AbstractTool;

/**
 * 锄头
 * 用于种植
 */
public class hoe extends AbstractTool {
    private final String name = "锄头";
    @Override
    public void ToolBehavior() {

    }
    public String getName() {
        return name;
    }
}
