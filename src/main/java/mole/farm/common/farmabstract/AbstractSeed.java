package mole.farm.common.farmabstract;

import mole.farm.common.farmabstract.useless.IMole;
import mole.farm.common.farmenum.Color;
import mole.farm.common.farmenum.Size;

import java.util.List;

/**
 * 抽象农场种子
 */
public abstract class AbstractSeed implements IMole {
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
     * 生长周期
     */
    protected String growthCycle;
    /**
     * 价格
     */
    protected Double price;
}
