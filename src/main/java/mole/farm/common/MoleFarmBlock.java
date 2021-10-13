package mole.farm.common;

import mole.farm.common.farmabstract.AbstractSeed;
import mole.farm.common.farmenum.FarmBlockStatus;

import java.util.List;

public class MoleFarmBlock {
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
