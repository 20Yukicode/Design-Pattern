package moleFarm.concrete.seed;

import moleFarm.common.farmabstract.AbstractSeed;
import moleFarm.common.farmenum.Color;
import moleFarm.common.farmenum.Size;

/**
 * 白菜种子
 */
public class CabbageSeed extends AbstractSeed implements Cloneable{
    public CabbageSeed(String name, Color color, Size size, String growthCycle, Double price) {
        this.name = name;
        this.color = color;
        this.size = size;
        this.growthCycle = growthCycle;
        this.price = price;
    }
    public CabbageSeed(){};
    /**
     * 名字
     */
    private String name = "白菜";
    /**
     颜色
     */
    private  Color color = Color.BLACK;
    /**
     * 大小
     */
    private Size size = Size.MEDIUM;
    /**
     * 生长周期
     */
    private  String growthCycle = "90天";
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
     */
    @Override
    public Object clone() {
        CabbageSeed cabbageSeed = new CabbageSeed(this.name, this.color, this.size, this.growthCycle, this.price);
        return cabbageSeed;
    }
}