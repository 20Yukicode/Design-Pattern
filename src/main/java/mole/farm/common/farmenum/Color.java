package mole.farm.common.farmenum;

/**
 *颜色
 */
public enum Color {
    RED("红色"),YELLOW("黄色"),BLACK("黑色"),BROWN("棕色");
    String color;
     Color(String color){
        this.color=color;
    }
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
