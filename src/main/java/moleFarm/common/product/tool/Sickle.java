package moleFarm.common.product.tool;

import moleFarm.common.product.AbstractTool;

/**
 * 镰刀
 * 用于除草
 */
public class Sickle extends AbstractTool {
    private final String name = "镰刀";

    private Double price;
    @Override
    public void ToolBehavior() {

    }
    public String getName() {
        return name;
    }

    @Override
    public Double getPrice() {
        return price;
    }
}
