package mole.farm.concrete.crops;

import mole.farm.common.farmabstract.AbstractCrops;
import mole.farm.common.farmenum.Color;
import mole.farm.common.farmenum.Size;

/**
 * 茄子
 */
public class Eggplant extends AbstractCrops {
    /**
     * 名字
     */
    private final String name = "茄子";
    /**
     颜色
     */
    private final Color color = Color.PURPLE;
    /**
     * 大小
     */
    private final Size size = Size.MEDIUM;
    /**
     * 价格
     */
    private final Double price = 20.0;

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
