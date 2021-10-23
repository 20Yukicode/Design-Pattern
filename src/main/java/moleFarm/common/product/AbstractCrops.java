package moleFarm.common.product;

import moleFarm.common.status.Color;
import moleFarm.common.status.Size;
import moleFarm.pattern.adapter.Target;

public abstract class AbstractCrops implements Target,IMole{
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
}
