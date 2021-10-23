package moleFarm.common.product;

import moleFarm.common.status.Level;
import moleFarm.pattern.adapter.Target;

/**
 * 抽象农场肥料
 */
public abstract class AbstractFertilizer implements IProduct {
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
    /**
     * 价格
     */
    protected Double price;
}
