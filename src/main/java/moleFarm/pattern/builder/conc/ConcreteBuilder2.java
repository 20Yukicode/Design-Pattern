package moleFarm.pattern.builder.conc;

import moleFarm.FarmGrowth;
import moleFarm.common.product.AbstractFertilizer;
import moleFarm.common.product.AbstractSeed;
import moleFarm.pattern.builder.Builder;

public class ConcreteBuilder2 extends Builder {

    @Override
    public void buildPlant(AbstractSeed seed, AbstractFertilizer fertilizer) {
        FarmGrowth.PlantSeed(seed, farmBlock);
        FarmGrowth.ApplyFertilizer(fertilizer, farmBlock);
    }
    
}
