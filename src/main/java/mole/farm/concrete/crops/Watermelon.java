package mole.farm.concrete.crops;

import mole.farm.common.farmabstract.AbstractCrops;
import mole.farm.common.farmenum.Color;
import mole.farm.common.farmenum.Size;

/**
 * 西瓜
 */
public class Watermelon extends AbstractCrops {
    /**
     * 名字
     */
    protected  String name = "西瓜";
    /**
     颜色
     */
    protected Color color = Color.GREEN;
    /**
     * 大小
     */
    protected Size size = Size.MEDIUM;
    /**
     * 价格
     */
    protected Double price = 20.0;
}
