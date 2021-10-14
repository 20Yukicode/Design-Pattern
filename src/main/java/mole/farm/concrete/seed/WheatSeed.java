package mole.farm.concrete.seed;

import mole.farm.common.farmabstract.AbstractSeed;
import mole.farm.common.farmenum.Color;
import mole.farm.common.farmenum.Size;

/**
 * 小麦种子
 */
public class WheatSeed extends AbstractSeed {
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
     * 生长周期
     */
    protected String growthCycle = "100天";
    /**
     * 价格
     */
    protected Double price = 3.0;
}
