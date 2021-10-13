package mole.farm.concrete.factory;

import mole.farm.common.factory.IFactory;
import mole.farm.common.farmabstract.AbstractCrops;
import mole.farm.common.farmabstract.AbstractFarmTool;
import mole.farm.common.farmabstract.AbstractFertilizer;
import mole.farm.common.farmabstract.AbstractSeed;

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
