package moleFarm.pattern.builder.conc;

import moleFarm.common.product.AbstractFertilizer;
import moleFarm.common.product.AbstractSeed;
import moleFarm.pattern.builder.Builder;

public class ConcreteBuilder2 extends Builder {
    @Override
    public void buildPlant(AbstractSeed seed) {
        farmGrowth.PlantSeed(seed);
    }

    @Override
    public void buildApplyFertilizer(AbstractFertilizer fertilizer) {

    }

}
