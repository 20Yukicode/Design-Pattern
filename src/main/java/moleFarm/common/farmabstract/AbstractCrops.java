package moleFarm.common.farmabstract;

import moleFarm.common.farmabstract.useless.IMole;
import moleFarm.common.farmenum.Color;
import moleFarm.common.farmenum.Size;

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
