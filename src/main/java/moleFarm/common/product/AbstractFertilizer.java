package moleFarm.common.product;

import moleFarm.common.status.FarmBlockStatus;
import moleFarm.common.status.Level;
import moleFarm.common.status.SeedStatus;
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
     * 等级
     */
    protected Level level;
    /**
     * 价格
     */
    protected Double price;

    public abstract Double getPrice() ;
    public abstract String getName();

    public abstract Integer fertilizerBehavior(int status);

}
