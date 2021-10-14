package mole.farm.concrete.crops;

import mole.farm.common.farmabstract.AbstractCrops;
import mole.farm.common.farmenum.Color;
import mole.farm.common.farmenum.Size;

/**
 * 白菜
 */
public class Cabbage extends AbstractCrops {
    /**
     * 名字
     */
    private String name = "白菜";
    /**
     颜色
     */
    private Color color = Color.GREEN;
    /**
     * 大小
     */
    private Size size = Size.MEDIUM;
    /**
     * 价格
     */
   private Double price = 10.0;

    public String getName() {
        return name;
    }

    public Color getColor() {
        return color;
    }

    public Size getSize() {
        return size;
    }

    public Double getPrice() {
        return price;
    }
}
