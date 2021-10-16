package moleFarm.concrete.crops;

import moleFarm.common.product.AbstractCrops;
import moleFarm.common.status.Color;
import moleFarm.common.status.Size;

/**
 * 白菜
 */
public class Cabbage extends AbstractCrops {
    /**
     * 名字
     */
    private final String name = "白菜";
    /**
     颜色
     */
    private final Color color = Color.GREEN;
    /**
     * 大小
     */
    private final Size size = Size.MEDIUM;
    /**
     * 价格
     */
   private final Double price = 10.0;

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
