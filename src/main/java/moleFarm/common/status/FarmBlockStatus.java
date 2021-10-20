package moleFarm.common.status;

/**
 * 农田块的状态
 */
public enum FarmBlockStatus {
    WEEDS("杂草"),
    INSECT_DISASTER("虫灾"),
    DROUGHT_TOLERANCE("耐旱"),
    WITHERED("枯萎");
    String text;
    FarmBlockStatus(String text){
        this.text=text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
