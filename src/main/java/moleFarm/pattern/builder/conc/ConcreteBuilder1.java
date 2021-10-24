package moleFarm.pattern.builder.conc;

import moleFarm.common.product.AbstractCrops;
import moleFarm.common.product.AbstractFertilizer;
import moleFarm.common.product.AbstractSeed;
import moleFarm.pattern.builder.Builder;

public class ConcreteBuilder1 extends Builder {
    @Override
    public void buildPlant(AbstractSeed seed,AbstractFertilizer fertilizer) {
        farmGrowth.LoosenSoil();
        farmGrowth.PlantSeed(seed);
        farmGrowth.Watering();
        farmGrowth.ApplyFertilizer(fertilizer);
    }

    @Override
    public AbstractCrops buildHarvestCrops() {
        return null;
    }

}
