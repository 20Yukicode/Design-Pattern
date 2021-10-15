package moleFarm.common;

import moleFarm.common.farmabstract.AbstractFarmTool;
import moleFarm.common.farmabstract.AbstractFertilizer;
import moleFarm.common.farmabstract.AbstractSeed;

import java.util.Map;

/**
 * 摩尔个人仓库
 * implements IFarmWareHouse
 */
public class MoleFarmWarehouse {
    /**
     * 种子存储
     */
    private Map<AbstractSeed,Integer>seedMap;
    /**
     * 肥料存储
     */
    private Map<AbstractFertilizer,Integer>fertilizerMap;
    /**
     * 工具存储
     */
    private Map<AbstractFarmTool,Integer>farmToolMap;
}
