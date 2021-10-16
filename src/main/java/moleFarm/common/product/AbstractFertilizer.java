package moleFarm.common.product;

import moleFarm.common.product.useless.IMole;
import moleFarm.common.status.Level;

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
