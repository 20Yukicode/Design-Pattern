package mole.farm.concrete.seed;

import mole.farm.common.farmabstract.AbstractSeed;
import mole.farm.common.farmenum.Color;
import mole.farm.common.farmenum.Size;

/**
 * 草莓种子
 */
public class StrawberrySeed extends AbstractSeed {
    /**
     * 名字
     */
    protected  String name = "草莓";
    /**
     颜色
     */
    protected Color color = Color.BLACK;
    /**
     * 大小
     */
    protected Size size = Size.BIG;
    /**
     * 生长周期
     */
    protected String growthCycle = "90天";
    /**
     * 价格
     */
    protected Double price = 6.0;
}
