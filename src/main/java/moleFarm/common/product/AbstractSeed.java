package moleFarm.common.product;

import moleFarm.common.product.useless.IMole;
import moleFarm.common.status.Color;
import moleFarm.common.status.Size;

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
