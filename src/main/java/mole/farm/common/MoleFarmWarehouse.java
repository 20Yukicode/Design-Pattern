package mole.farm.common;

import mole.farm.common.farmabstract.AbstractFarmTool;
import mole.farm.common.farmabstract.AbstractFertilizer;
import mole.farm.common.farmabstract.AbstractSeed;

import java.util.Map;

/**
 * 摩尔个人仓库
 */
public class MoleFarmWarehouse {
    Map<AbstractSeed,Integer>seedMap;
    Map<AbstractFertilizer,Integer>fertilizerMap;
    Map<AbstractFarmTool,Integer>farmToolMap;
}
