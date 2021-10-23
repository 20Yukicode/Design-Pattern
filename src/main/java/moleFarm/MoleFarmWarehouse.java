package moleFarm;

import moleFarm.common.product.AbstractTool;
import moleFarm.common.product.AbstractFertilizer;
import moleFarm.common.product.AbstractSeed;

import java.util.HashMap;
import java.util.Map;

/**
 * 摩尔个人仓库
 * implements IFarmWareHouse
 */
public class MoleFarmWarehouse {

    public Map<AbstractSeed, Integer> getSeedMap() {
        return seedMap;
    }

    public Map<AbstractFertilizer, Integer> getFertilizerMap() {
        return fertilizerMap;
    }

    /**
     * 种子存储
     */
    private Map<AbstractSeed,Integer>seedMap=new HashMap<>();
    /**
     * 肥料存储
     */
    private Map<AbstractFertilizer,Integer>fertilizerMap=new HashMap<>();
    /**
     * 工具存储
     */
    private Map<AbstractTool,Integer>farmToolMap=new HashMap<>();
}
