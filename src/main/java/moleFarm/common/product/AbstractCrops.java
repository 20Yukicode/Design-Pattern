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
