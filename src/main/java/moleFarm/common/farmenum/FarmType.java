package moleFarm.common.farmenum;

/**
 *农田物品的种类
 */
public enum FarmType {
    CROPS("crops"), SEED("seed"), FARM_TOOL("farmTool");
    String text;
    FarmType(String text) {
        this.text = text;
    }
    public String getText() {
        return text;
    }
}
