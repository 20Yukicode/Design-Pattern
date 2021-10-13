package mole.farm.concrete.factory;

import mole.farm.common.factory.IFactory;
import mole.farm.common.farmabstract.AbstractFarmTool;
import mole.farm.common.farmabstract.AbstractFertilizer;
import mole.farm.common.farmabstract.AbstractSeed;

public class ConcreteFactory2 implements IFactory {
    @Override
    public AbstractSeed newSeed() {
        return null;
    }

    @Override
    public AbstractFertilizer newFertilier() {
        return null;
    }

    @Override
    public AbstractFarmTool newFarmTool() {
        return null;
    }
}
