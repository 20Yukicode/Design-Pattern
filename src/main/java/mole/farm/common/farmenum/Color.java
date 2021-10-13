package mole.farm.common.farmenum;

/**
 *颜色
 */
public enum Color {
    RED(0,"红色"),YELLOW(1,"黄色"),BLACK(2,"黑色"),BROWN(3,"棕色");
    int number;
    String color;
     Color(int number,String color){
        this.number=number;
        this.color=color;
    }
}
