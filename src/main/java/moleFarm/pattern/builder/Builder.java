package moleFarm.pattern.builder;

import moleFarm.FarmGrowth;
import moleFarm.MoleFarmBlock;
import moleFarm.MoleFarmWarehouse;
import moleFarm.common.product.AbstractFertilizer;
import moleFarm.common.product.AbstractSeed;

/**
 * 到时候在使用建造者模式的时候，分为一键种植（只是松土加种植），一键种植（加上浇水和施肥），
 * 一键收获
 */
public abstract class Builder {
    private MoleFarmWarehouse moleFarmWarehouse;

    private MoleFarmBlock farmBlock;

    protected FarmGrowth farmGrowth = new FarmGrowth(moleFarmWarehouse, farmBlock);


    public MoleFarmBlock getFarmBlock() {
        return farmBlock;
    }

    public abstract void buildPlant(AbstractSeed seed);

    public abstract void buildApplyFertilizer(AbstractFertilizer fertilizer);

}
