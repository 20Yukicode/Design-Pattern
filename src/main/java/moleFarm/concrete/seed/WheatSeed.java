package moleFarm.concrete.seed;

import moleFarm.common.farmabstract.AbstractSeed;
import moleFarm.common.farmenum.Color;
import moleFarm.common.farmenum.Size;

/**
 * 小麦种子
 */
public class WheatSeed extends AbstractSeed {
    /**
     * 名字
     */
    private final String name = "小麦";
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
    private final String growthCycle = "100天";
    /**
     * 价格
     */
    private final Double price = 3.0;

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
