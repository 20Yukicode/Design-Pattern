package mole.farm.concrete.crops;

import mole.farm.common.farmabstract.AbstractCrops;
import mole.farm.common.farmenum.Color;
import mole.farm.common.farmenum.Size;

/**
 * 草莓
 */
public class Strawberry extends AbstractCrops {
    /**
     * 名字
     */
    protected  String name = "草莓";
    /**
     颜色
     */
    protected Color color = Color.RED;
    /**
     * 大小
     */
    protected Size size = Size.MEDIUM;
    /**
     * 价格
     */
    protected Double price = 30.0;
}
