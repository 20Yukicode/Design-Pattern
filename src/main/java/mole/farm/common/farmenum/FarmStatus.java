package mole.farm.common.farmenum;

public enum FarmStatus {
    WEEDS("杂草"),
    INSECT_DISASTER("虫灾"),
    DROUGHT_TOLERANCE("耐旱"),
    GROWTH_STATUS("生长阶段");
    String text;
    FarmStatus(String text){
        this.text=text;
    }
}
