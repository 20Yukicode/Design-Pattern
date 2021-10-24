package moleFarm.pattern.builder;

import moleFarm.MoleFarmBlock;
import moleFarm.common.product.AbstractFertilizer;
import moleFarm.common.product.AbstractSeed;

public class Director {
    Builder builder;
    Director(Builder builder){
        this.builder=builder;
    }

    public Builder getBuilder() {
        return builder;
    }

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    public MoleFarmBlock farmGrowth(AbstractSeed seed, AbstractFertilizer fertilizer){
        builder.buildLoosenSoil();
        builder.buildPlantSeed(seed);
        builder.buildWatering();
        builder.buildApplyFertilizer(fertilizer);
        return builder.getFarmBlock();
    }
}
