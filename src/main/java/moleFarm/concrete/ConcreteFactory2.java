package moleFarm.concrete;

import moleFarm.common.factory.IFactory;
import moleFarm.common.farmabstract.AbstractCrops;
import moleFarm.common.farmabstract.AbstractFarmTool;
import moleFarm.common.farmabstract.AbstractFertilizer;
import moleFarm.common.farmabstract.AbstractSeed;

public class ConcreteFactory2 implements IFactory {

    @Override
    public AbstractCrops createCrops() {
       return null;
    }
    @Override
    public AbstractSeed createSeed() {
        return null;
    }

    @Override
    public AbstractFertilizer createFertilier() {
        return null;
    }

    @Override
    public AbstractFarmTool createFarmTool() {
        return null;
    }
}

