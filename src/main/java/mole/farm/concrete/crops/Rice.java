package mole.farm.concrete.crops;

import mole.farm.common.farmabstract.AbstractCrops;
import mole.farm.common.farmenum.Color;
import mole.farm.common.farmenum.Size;

/**
 * 水稻
 */
public class Rice extends AbstractCrops {
    /**
     * 名字
     */
    protected  String name = "水稻";
    /**
     颜色
     */
    protected Color color = Color.BROWN;
    /**
     * 大小
     */
    protected Size size = Size.SMALL;
    /**
     * 价格
     */
    protected Double price = 4.0;
}
