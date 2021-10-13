package mole.farm.common.farmenum;

/**
 * 大小
 */
public enum Size {
    BIG(2,"大"),MEDIUM(1,"中"),SMALL(0,"小");
    int number;
    String size;
    Size(int number,String size){
        this.number=number;
        this.size=size;
    }
}
