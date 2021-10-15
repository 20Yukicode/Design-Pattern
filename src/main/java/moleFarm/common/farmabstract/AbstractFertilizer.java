package moleFarm.common.farmabstract;

import moleFarm.common.farmabstract.useless.IMole;
import moleFarm.common.farmenum.Level;

/**
 * 抽象农场肥料
 */
public abstract class AbstractFertilizer implements IMole {
    /**
     * 名字
     */
    protected String name;
    /**
     * 产地（这个其实可以忽略)
     */
    protected String originPlace;
    /**
     * 等级
     */
    protected Level level;
}
