package moleFarm.pattern.builder.conc;

import moleFarm.FarmGrowth;
import moleFarm.common.product.AbstractFertilizer;
import moleFarm.common.product.AbstractSeed;
import moleFarm.pattern.builder.Builder;

public class ConcreteBuilder1 extends Builder {

    @Override
    public void buildPlant(AbstractSeed seed, AbstractFertilizer fertilizer) {
        FarmGrowth.LoosenSoil(farmBlock);
        FarmGrowth.PlantSeed(seed, farmBlock);
        FarmGrowth.Watering(farmBlock);
        FarmGrowth.Weed(farmBlock);
        FarmGrowth.ApplyFertilizer(fertilizer, farmBlock);
    }
}
