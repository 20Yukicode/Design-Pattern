package mole.farm.concrete.seed;

import mole.farm.common.farmabstract.AbstractSeed;
import mole.farm.common.farmenum.Color;
import mole.farm.common.farmenum.Size;

/**
 * 白菜种子
 */
public class CabbageSeed extends AbstractSeed implements Cloneable{
    private CabbageSeed(){}
    private CabbageSeed(Double price){
        this.price=price;
    }
    /**
     * 名字
     */
    private final String name = "白菜";
    /**
     颜色
     */
    private final Color color = Color.BLACK;
    /**
     * 大小
     */
    private final Size size = Size.MEDIUM;
    /**
     * 生长周期
     */
    private final String growthCycle = "90天";
    /**
     * 价格
     */
    private Double price = 3.0;

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Color getColor() {
        return color;
    }

    public Size getSize() {
        return size;
    }

    public String getGrowthCycle() {
        return growthCycle;
    }

    public Double getPrice() {
        return price;
    }

    /**
     * 原型模式，重写clone方法
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    public Object clone() throws CloneNotSupportedException {
        CabbageSeed cabbageSeed = new CabbageSeed(this.price);
        return cabbageSeed;
    }
}
