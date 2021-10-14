package mole.farm.concrete.crops;

import mole.farm.common.farmabstract.AbstractCrops;
import mole.farm.common.farmenum.Color;
import mole.farm.common.farmenum.Size;

/**
 * 小麦
 */
public class Wheat extends AbstractCrops {
    /**
     * 名字
     */
    protected  String name = "小麦";
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
    protected Double price = 5.0;
}
