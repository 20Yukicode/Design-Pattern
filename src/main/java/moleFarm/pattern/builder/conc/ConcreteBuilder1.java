package moleFarm.pattern.builder.conc;

import moleFarm.FarmGrowth;
import moleFarm.common.product.AbstractSeed;
import moleFarm.common.product.fertilizer.AdvancedFertilizer;
import moleFarm.pattern.builder.Builder;

/**
 * 具体建造着1
 */
public class ConcreteBuilder1 extends Builder {
    @Override
    public void buildPlant(AbstractSeed seed) {
        FarmGrowth.LoosenSoil(farmBlock);
        FarmGrowth.PlantSeed(seed, farmBlock);
        FarmGrowth.Watering(farmBlock);
        FarmGrowth.Weed(farmBlock);
        FarmGrowth.ApplyFertilizer(new AdvancedFertilizer(), farmBlock);
    }
}
