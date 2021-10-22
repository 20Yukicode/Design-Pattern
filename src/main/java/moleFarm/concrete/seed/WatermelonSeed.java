package moleFarm.concrete.seed;

import moleFarm.common.product.AbstractSeed;
import moleFarm.common.status.Color;
import moleFarm.common.status.Size;

/**
 * 西瓜种子
 */
public class WatermelonSeed extends AbstractSeed implements Cloneable{
    /**
     * 名字
     */
    private   final String name = "西瓜";
    /**
     颜色
     */
    private final Color color = Color.BLACK;
    /**
     * 大小
     */
    private final Size size = Size.BIG;
    /**
     * 生长周期
     */
    private final String growthCycle = "150天";
    /**
     * 价格
     */
    private final Double price = 5.0;

    /**
     * 构造方法
     *
     * @param name
     * @param color
     * @param size
     * @param growthCycle
     * @param price
     */
    private WatermelonSeed(String name, Color color, Size size, String growthCycle, Double price) {
        super(name, color, size, growthCycle, price);
    }


    @Override
    protected Object clone() throws CloneNotSupportedException {
        WatermelonSeed watermelonSeed = new WatermelonSeed(this.name, this.color, this.size, this.growthCycle, this.price);
        return watermelonSeed;
    }
}
