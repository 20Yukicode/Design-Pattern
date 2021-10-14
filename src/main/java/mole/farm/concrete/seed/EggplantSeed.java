package mole.farm.concrete.seed;

import mole.farm.common.farmabstract.AbstractSeed;
import mole.farm.common.farmenum.Color;
import mole.farm.common.farmenum.Size;

/**
 * 茄子种子
 */
public class EggplantSeed extends AbstractSeed {
    /**
     * 名字
     */
    protected  String name = "茄子";
    /**
     颜色
     */
    protected Color color = Color.BROWN;
    /**
     * 大小
     */
    protected Size size = Size.MEDIUM;
    /**
     * 生长周期
     */
    protected String growthCycle = "100天";
    /**
     * 价格
     */
    protected Double price = 5.0;
}
