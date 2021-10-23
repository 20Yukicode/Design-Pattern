package moleFarm.common.product;

import moleFarm.common.status.Color;
import moleFarm.common.status.Size;

public abstract class AbstractCrops implements IProduct {
    /**
     * 名字
     */
    protected String name;
    /**
     颜色
     */
    protected Color color;
    /**
     * 大小
     */
    protected Size size;
    /**
     * 价格
     */
    protected Double price;

    public AbstractCrops(){}

    public AbstractCrops(String name, Color color, Size size, Double price) {
        this.name = name;
        this.color = color;
        this.size = size;
        this.price = price;
    }
    public abstract String getName();
    public abstract Color getColor() ;

    public abstract Size getSize();
    public abstract Double getPrice();
}
