package mole.farm.common.farmabstract;

import mole.farm.common.farmabstract.useless.IMole;

/**
 * 抽象农场肥料
 */
public abstract class AbstractFertilizer implements IMole {
    /**
     * 名字
     */
    protected String name;
    /**
     * 产地
     */
    protected String originPlace;
}
