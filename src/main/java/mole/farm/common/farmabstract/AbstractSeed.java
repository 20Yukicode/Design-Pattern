package mole.farm.common.farmabstract;

import mole.farm.common.farmenum.Color;
import mole.farm.common.farmenum.Size;

/**
 * 抽象农场种子
 */
public abstract class AbstractSeed implements ISeed {
    /**
    颜色
     */
    private Color color;
    /**
     * 大小
     */
    private Size size;
    /**
     * 生长周期
     */
    private String growthCycle;

}
