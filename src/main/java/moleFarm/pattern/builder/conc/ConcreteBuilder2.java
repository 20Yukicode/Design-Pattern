package moleFarm.pattern.builder.conc;

import moleFarm.common.product.AbstractCrops;
import moleFarm.common.product.AbstractFertilizer;
import moleFarm.common.product.AbstractSeed;
import moleFarm.pattern.builder.Builder;

public class ConcreteBuilder2 extends Builder {
    @Override
    public void buildPlant(AbstractSeed seed,AbstractFertilizer fertilizer) {
        farmGrowth.PlantSeed(seed);
        farmGrowth.ApplyFertilizer(null);
    }

    @Override
    public AbstractCrops buildHarvestCrops() {
        return null;
    }


}
