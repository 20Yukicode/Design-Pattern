package moleFarm;

import moleFarm.common.product.*;
import moleFarm.IFarmWareHouse;
import moleFarm.common.product.crops.*;
import moleFarm.common.product.fertilizer.AdvancedFertilizer;
import moleFarm.common.product.fertilizer.MiddleFertilizer;
import moleFarm.common.product.fertilizer.PrimaryFertilizer;
import moleFarm.common.product.seed.*;
import moleFarm.common.product.tool.*;
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

    protected Shovel shovel=Shovel.newInstance();

    private MoleFarmWarehouse(){
        this.seedMap.put(new CabbageSeed(),5);
        this.seedMap.put(new EggplantSeed(),5);
        this.seedMap.put(new RiceSeed(),5);
        this.seedMap.put(new StrawberrySeed(),5);
        this.seedMap.put(new WatermelonSeed(),5);
        this.seedMap.put(new WheatSeed(),5);
        this.cropsMap.put(new Cabbage(),3);
        this.cropsMap.put(new Eggplant(),3);
        this.cropsMap.put(new Rice(),3);
        this.cropsMap.put(new Strawberry(),3);
        this.cropsMap.put(new Watermelon(),3);
        this.cropsMap.put(new Wheat(),3);
        this.fertilizerMap.put(new AdvancedFertilizer(),2);
        this.fertilizerMap.put(new MiddleFertilizer(),2);
        this.fertilizerMap.put(new PrimaryFertilizer(),2);
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

    public Shovel getShovel() {
        return shovel;
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
        System.out.println("白菜\uD83E\uDD66\t茄子\uD83C\uDF46\t水稻\uD83C\uDF3E\t草莓\uD83C\uDF53\t西瓜\uD83C\uDF49\t小麦\uD83C\uDF3F   ");
        System.out.println(cropsMap.get(new Cabbage())+"\t\t"+cropsMap.get(new Eggplant())+"\t\t"+cropsMap.get(new Rice())+"\t\t"+
                cropsMap.get(new Strawberry())+"\t\t"+cropsMap.get(new Watermelon())+"\t\t"+cropsMap.get(new Wheat())+"\t\t");
        System.out.println("白菜种子\t茄子种子\t水稻种子\t草莓种子\t西瓜种子\t小麦种子");
        System.out.println(seedMap.get(new CabbageSeed())+"\t\t"+seedMap.get(new EggplantSeed())+"\t\t"+seedMap.get(new RiceSeed())+"\t\t"+
                seedMap.get(new StrawberrySeed())+"\t\t"+seedMap.get(new WatermelonSeed())+"\t\t"+seedMap.get(new WheatSeed())+"\t\t");
        System.out.println("高级肥料\t中级肥料\t低级肥料");
        System.out.println(fertilizerMap.get(new AdvancedFertilizer())+"\t\t"+fertilizerMap.get(new MiddleFertilizer())+"\t\t"+
                fertilizerMap.get(new PrimaryFertilizer()));
    }

}
