package mole.farm.common;

import mole.farm.common.farmabstract.AbstractFarmTool;
import mole.farm.common.farmabstract.AbstractFertilizer;
import mole.farm.common.farmabstract.AbstractSeed;

import java.util.Map;

/**
 * 摩尔个人仓库
 */
public class MoleFarmWarehouse {
    private Map<AbstractSeed,Integer>seedMap;
    private Map<AbstractFertilizer,Integer>fertilizerMap;
    private Map<AbstractFarmTool,Integer>farmToolMap;
}
