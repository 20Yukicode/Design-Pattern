package mole.farm.common.farmabstract;

import mole.farm.common.farmabstract.useless.IMole;
import mole.farm.common.farmenum.Color;
import mole.farm.common.farmenum.Size;

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
