package mole.farm.concrete.seed;

import mole.farm.common.farmabstract.AbstractSeed;
import mole.farm.common.farmenum.Color;
import mole.farm.common.farmenum.Size;

/**
 * 水稻种子
 */
public class RiceSeed extends AbstractSeed {
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
     * 生长周期
     */
    protected String growthCycle = "80天";
    /**
     * 价格
     */
    protected Double price = 2.0;
}
