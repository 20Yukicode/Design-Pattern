package moleFarm.pattern.builder;

import moleFarm.MoleFarmBlock;
import moleFarm.common.product.AbstractFertilizer;
import moleFarm.common.product.AbstractSeed;

public class Director {
    private Builder builder;

    private MoleFarmBlock farmBlock;

    Director(Builder builder, MoleFarmBlock farmBlock) {
        this.builder = builder;
        this.farmBlock = farmBlock;
    }

    public void setFarmBlock(MoleFarmBlock farmBlock) {
        this.farmBlock = farmBlock;
    }

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    public MoleFarmBlock getMoleFarmBlock(AbstractSeed seed, AbstractFertilizer fertilizer) {
        //要先初始化农田块
        builder.setFarmBlock(farmBlock);
        builder.buildPlant(seed, fertilizer);
        return builder.getFarmBlock();
    }
}
