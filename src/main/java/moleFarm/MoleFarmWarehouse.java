package moleFarm;

import moleFarm.common.product.*;
import moleFarm.IFarmWareHouse;
import moleFarm.common.product.seed.CabbageSeed;
import moleFarm.common.product.tool.Hoe;
import moleFarm.common.product.tool.Pesticide;
import moleFarm.common.product.tool.Sickle;
import moleFarm.common.product.tool.WateringCan;
import moleFarm.common.status.SeedStatus;

import java.nio.file.SecureDirectoryStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

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
    private Map<AbstractCrops,Integer>cropsMap=new HashMap<>();

    protected Hoe hoe=Hoe.newInstance();

    protected Sickle sickle=Sickle.newInstance();

    protected WateringCan wateringCan=WateringCan.newInstance();

    protected Pesticide pesticide=Pesticide.newInstance();

    private MoleFarmWarehouse(){}

    private static volatile MoleFarmWarehouse moleFarmWarehouse=new MoleFarmWarehouse();

    public static synchronized MoleFarmWarehouse newInstance(){
        return moleFarmWarehouse;
    }

    public Hoe getHoe() {
        return hoe;
    }

    public Sickle getSickle() {
        return sickle;
    }

    public WateringCan getWateringCan() {
        return wateringCan;
    }

    public Pesticide getPesticide() {
        return pesticide;
    }

    public static MoleFarmWarehouse getMoleFarmWarehouse() {
        return moleFarmWarehouse;
    }

    public Map<AbstractSeed, Integer> getSeedMap() {
        return seedMap;
    }

    public Map<AbstractFertilizer, Integer> getFertilizerMap() {
        return fertilizerMap;
    }

    public Map<AbstractCrops, Integer> getCropsMap() {
        return cropsMap;
    }

    public void setFertilizerMap(AbstractFertilizer abstractFertilizer,Integer count) {
        fertilizerMap.forEach(
                (k,v)->{
                    if(Objects.equals(k.getName(), abstractFertilizer.getName())){
                        fertilizerMap.put(k,count);
                        return;
                    }
                }
        );
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
