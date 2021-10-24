package moleFarm.common.product.tool;

import moleFarm.common.product.AbstractTool;

public class Pesticide extends AbstractTool {
    private final String name = "农药";

    private Double price;
    @Override

    public void ToolBehavior() {
        System.out.println("正在用"+name+"除虫...");
    }
}
