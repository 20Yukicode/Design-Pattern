package moleFarm.pattern.builder.conc;

import moleFarm.common.product.AbstractFertilizer;
import moleFarm.common.product.AbstractSeed;
import moleFarm.pattern.builder.Builder;

public class ConcreteBuilder1 extends Builder {
    @Override
    public void buildPlant(AbstractSeed seed) {
        farmGrowth.LoosenSoil();
        farmGrowth.PlantSeed(seed);
        farmGrowth.Watering();
    }

    @Override
    public void buildApplyFertilizer(AbstractFertilizer fertilizer) {
        farmGrowth.LoosenSoil();
        farmGrowth.ApplyFertilizer(fertilizer);
    }
}
