package moleFarm.pattern.builder;

import moleFarm.MoleFarmBlock;
import moleFarm.common.product.AbstractCrops;
import moleFarm.common.product.AbstractFertilizer;
import moleFarm.common.product.AbstractSeed;

/**
 * 到时候在使用建造者模式的时候，分为一键种植（只是松土加种植），一键种植（加上浇水和施肥），
 * 一键收获
 */
public abstract class Builder {

    protected MoleFarmBlock farmBlock;

    public abstract void buildPlant(AbstractSeed seed, AbstractFertilizer fertilizer);

    public abstract AbstractCrops buildHarvestCrops();

    public void setFarmBlock(MoleFarmBlock farmBlock) {
        this.farmBlock = farmBlock;
    }

    public MoleFarmBlock getFarmBlock() {
        return farmBlock;
    }
}
