package moleFarm;

import moleFarm.common.product.*;
import moleFarm.IFarmWareHouse;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 摩尔个人仓库
 * implements IFarmWareHouse
 */
public class MoleFarmWarehouse implements IFarmWareHouse {
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

    public Map<AbstractSeed, Integer> getSeedMap() {
        return seedMap;
    }

    public Map<AbstractFertilizer, Integer> getFertilizerMap() {
        return fertilizerMap;
    }

    @Override
    public boolean importSeedFromShop(List<AbstractSeed> seedList) {
        return false;
    }

    @Override
    public boolean exportCropsToShop(List<AbstractCrops> cropsList) {
        return false;
    }

    @Override
    public boolean provideItemToMole(List<IProduct> objectList) {
        return false;
    }

    @Override
    public boolean storeToRepository(List<AbstractCrops> cropsList) {
        return false;
    }
}
