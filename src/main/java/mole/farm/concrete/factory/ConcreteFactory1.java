package mole.farm.concrete.factory;

import mole.farm.common.factory.IFactory;
import mole.farm.common.farmabstract.AbstractCrops;
import mole.farm.common.farmabstract.AbstractFarmTool;
import mole.farm.common.farmabstract.AbstractFertilizer;
import mole.farm.common.farmabstract.AbstractSeed;

/**
 * 具体生产种子，肥料，农具的工厂
 */
public class ConcreteFactory1 implements IFactory {
    @Override
    public AbstractCrops newCrops() {
        return null;
    }
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
