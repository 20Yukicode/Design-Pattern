package moleFarm.common;

import moleFarm.common.product.AbstractSeed;
import moleFarm.common.status.FarmBlockStatus;
import moleFarm.common.status.Shape;

import java.util.List;

public class MoleFarmBlock {
    /**
     * 形状
     */
    private final Shape shape=Shape.CIRCULAR;
    /**
     * 面积
     */
    private final Double area=1.0;
    /**
     * 种子种类
     */
    private AbstractSeed seed;
    /**
     * 农田块状态列表
     */
    private List<FarmBlockStatus> statusList;
}
