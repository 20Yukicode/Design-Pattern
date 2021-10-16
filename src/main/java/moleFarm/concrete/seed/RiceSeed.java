package moleFarm.concrete.seed;

import moleFarm.common.product.AbstractSeed;
import moleFarm.common.status.Color;
import moleFarm.common.status.Size;

/**
 * 水稻种子
 */
public class RiceSeed extends AbstractSeed {
    /**
     * 名字
     */
    private final String name = "水稻";
    /**
     颜色
     */
    private final Color color = Color.BROWN;
    /**
     * 大小
     */
    private final Size size = Size.SMALL;
    /**
     * 生长周期
     */
    private final String growthCycle = "80天";
    /**
     * 价格
     */
    private final Double price = 2.0;

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
}
