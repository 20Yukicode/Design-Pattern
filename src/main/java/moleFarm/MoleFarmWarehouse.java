package moleFarm;

import moleFarm.common.product.*;
import moleFarm.IFarmWareHouse;
import moleFarm.common.product.crops.*;
import moleFarm.common.product.fertilizer.AdvancedFertilizer;
import moleFarm.common.product.fertilizer.MiddleFertilizer;
import moleFarm.common.product.fertilizer.PrimaryFertilizer;
import moleFarm.common.product.seed.*;
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
     * 作物存储
     */
    private Map<AbstractCrops,Integer>cropsMap=new HashMap<>();

    protected Hoe hoe=Hoe.newInstance();

    protected Sickle sickle=Sickle.newInstance();

    protected WateringCan wateringCan=WateringCan.newInstance();

    protected Pesticide pesticide=Pesticide.newInstance();

    private MoleFarmWarehouse(){
        this.seedMap.put(new CabbageSeed(),0);
        this.seedMap.put(new EggplantSeed(),0);
        this.seedMap.put(new RiceSeed(),0);
        this.seedMap.put(new StrawberrySeed(),0);
        this.seedMap.put(new WatermelonSeed(),0);
        this.seedMap.put(new WheatSeed(),0);
        this.cropsMap.put(new Cabbage(),0);
        this.cropsMap.put(new Eggplant(),0);
        this.cropsMap.put(new Rice(),0);
        this.cropsMap.put(new Strawberry(),0);
        this.cropsMap.put(new Watermelon(),0);
        this.cropsMap.put(new Wheat(),0);
        this.fertilizerMap.put(new AdvancedFertilizer(),0);
        this.fertilizerMap.put(new MiddleFertilizer(),0);
        this.fertilizerMap.put(new PrimaryFertilizer(),0);
    }

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


    @Override
    public boolean importSeedFromShop(List<AbstractSeed> seedList) {
        return false;
    }

    @Override
    public boolean exportCropsToShop(List<AbstractCrops> cropsList) {
        return false;
    }

    @Override
    public <T extends IProduct> boolean provideItemToMole(List<T> objectList) {
        return false;
    }

    @Override
    public boolean storeToRepository(List<AbstractCrops> cropsList) {
        return false;
    }

    public void showRepertory(){
        System.out.println("仓库库存如下：\n");
        System.out.println("白菜\uD83E\uDD66  茄子\uD83C\uDF46  水稻\uD83C\uDF3E  草莓\uD83C\uDF53  西瓜\uD83C\uDF49  小麦\uD83C\uDF3F \n  ");
        System.out.println(cropsMap.get(new Cabbage()));
    }
}
