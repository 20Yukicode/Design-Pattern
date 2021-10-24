package moleFarm.pattern.builder;

import moleFarm.FarmProcess;
import moleFarm.MoleFarmBlock;
import moleFarm.MoleFarmWarehouse;
import moleFarm.common.product.AbstractCrops;
import moleFarm.common.product.AbstractFertilizer;
import moleFarm.common.product.AbstractSeed;
import moleFarm.common.product.tool.Hoe;
import moleFarm.common.product.tool.Pesticide;
import moleFarm.common.product.tool.Sickle;
import moleFarm.common.product.tool.WateringCan;

/**
 * 到时候在使用建造者模式的时候，分为一键种植（只是松土加种植），一键种植（加上浇水和施肥），
 * 一键收获
 */
public abstract class Builder {
    protected MoleFarmWarehouse moleFarmWarehouse=MoleFarmWarehouse.newInstance();

    protected MoleFarmBlock farmBlock=new MoleFarmBlock();

    /**
     * 获取成员变量farm
     * @return
     */
    public MoleFarmBlock getFarmBlock() {
        return farmBlock;
    }
    /**
     * 种植
     */
    public abstract void buildPlantSeed(AbstractSeed seed);
    /**
     * 松土
     */
    public abstract void buildLoosenSoil();
    /**
     * 浇水
     */
    public abstract void buildWatering();
    /**
     * 施肥
     */
    public abstract void buildApplyFertilizer(AbstractFertilizer fertilizer);
    /**
     * 除草
     */
    public abstract void buildWeed();
    /**
     * 除虫
     */
    public abstract void buildDisinsection();

    /**
     * 收获作物
     * @return
     */
    public abstract AbstractCrops harvestCrops();
}
