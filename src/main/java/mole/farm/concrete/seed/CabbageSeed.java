package mole.farm.concrete.seed;

import mole.farm.common.farmabstract.AbstractSeed;
import mole.farm.common.farmenum.Color;
import mole.farm.common.farmenum.Size;

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

    /**
     * 名字
     */
    protected  String name = "白菜";
    /**
     颜色
     */
    protected Color color = Color.BLACK;
    /**
     * 大小
     */
    protected Size size = Size.MEDIUM;
    /**
     * 生长周期
     */
    protected String growthCycle = "90天";
    /**
     * 价格
     */
    protected Double price = 3.0;

    /**
     * 原型模式，重写clone方法
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    public Object clone() throws CloneNotSupportedException {
        CabbageSeed cabbageSeed = new CabbageSeed(this.name,this.color,this.size,this.growthCycle,this.price);
        return cabbageSeed;
    }
}
