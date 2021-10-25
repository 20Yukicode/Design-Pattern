package moleFarm.pattern.builder.conc;

import moleFarm.FarmGrowth;
import moleFarm.common.product.AbstractSeed;
import moleFarm.common.product.fertilizer.MiddleFertilizer;
import moleFarm.pattern.builder.Builder;

public class ConcreteBuilder2 extends Builder {
    @Override
    public void buildPlant(AbstractSeed seed) {
        FarmGrowth.PlantSeed(seed, farmBlock);
        FarmGrowth.ApplyFertilizer(new MiddleFertilizer(), farmBlock);
    }

}
