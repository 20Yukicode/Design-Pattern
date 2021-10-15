package moleFarm.concrete.crops;

import moleFarm.common.farmabstract.AbstractCrops;
import moleFarm.common.farmenum.Color;
import moleFarm.common.farmenum.Size;

/**
 * 西瓜
 */
public class Watermelon extends AbstractCrops {
    /**
     * 名字
     */
    private final   String name = "西瓜";
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
