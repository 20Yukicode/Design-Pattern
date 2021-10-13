package mole.farm.common;

import mole.farm.common.farmabstract.AbstractFarmTool;
import mole.farm.common.farmabstract.AbstractFertilizer;
import mole.farm.common.farmabstract.AbstractSeed;

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
