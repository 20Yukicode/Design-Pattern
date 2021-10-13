package mole.farm.concrete.factory.farm;

import mole.farm.common.farmabstract.AbstractFarmTool;
import mole.farm.common.farmabstract.AbstractFertilizer;
import mole.farm.common.farmabstract.AbstractSeed;
import mole.farm.common.factory.IFarmFactory;

public class ConcreteFarmFactory implements IFarmFactory {
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
