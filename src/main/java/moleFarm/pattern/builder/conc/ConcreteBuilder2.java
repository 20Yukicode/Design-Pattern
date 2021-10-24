package moleFarm.pattern.builder.conc;

import moleFarm.common.product.AbstractCrops;
import moleFarm.common.product.AbstractFertilizer;
import moleFarm.common.product.AbstractSeed;
import moleFarm.pattern.builder.Builder;

public  class ConcreteBuilder2 extends Builder {
    @Override
    public void buildPlantSeed(AbstractSeed seed) {

    }

    @Override
    public void buildLoosenSoil() {

    }

    @Override
    public void buildWatering() {

    }

    @Override
    public void buildApplyFertilizer(AbstractFertilizer fertilizer) {

    }

    @Override
    public void buildWeed() {

    }

    @Override
    public void buildDisinsection() {

    }

    @Override
    public AbstractCrops harvestCrops() {
        return null;
    }
}
