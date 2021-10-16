package moleFarm.common;

import moleFarm.common.product.AbstractFarmTool;
import moleFarm.common.product.AbstractFertilizer;
import moleFarm.common.product.AbstractSeed;

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
