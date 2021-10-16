package moleFarm.common.product;

import moleFarm.common.product.useless.IMole;
import moleFarm.common.status.Color;
import moleFarm.common.status.Size;

public abstract class AbstractCrops implements IMole {
    /**
     * 名字
     */
    protected  String name;
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
}
