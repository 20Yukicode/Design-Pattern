package moleFarm.common.myjson;

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
