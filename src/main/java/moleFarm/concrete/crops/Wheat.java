package moleFarm.concrete.crops;

import moleFarm.common.product.AbstractCrops;
import moleFarm.common.status.Color;
import moleFarm.common.status.Size;

/**
 * 小麦
 */
public class Wheat extends AbstractCrops {
    /**
     * 名字
     */
    private  final String name = "小麦";
    /**
     颜色
     */
    private final Color color = Color.BROWN;
    /**
     * 大小
     */
    private final Size size = Size.SMALL;
    /**
     * 价格
     */
    private final Double price = 5.0;

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
