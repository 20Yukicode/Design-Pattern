package moleFarm.concrete.crops;

import moleFarm.common.product.AbstractCrops;
import moleFarm.common.status.Color;
import moleFarm.common.status.Size;

/**
 * 小麦🌿
 */
public class Wheat extends AbstractCrops implements Cloneable{
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

    /**
     * 构造方法
     *
     * @param name
     * @param color
     * @param size
     * @param price
     */
    private Wheat(String name, Color color, Size size, Double price) {
        super(name, color, size, price);
    }


    @Override
    protected Object clone() throws CloneNotSupportedException {
        Wheat wheat = new Wheat(this.name, this.color, this.size, this.price);
        return wheat;
    }
}
