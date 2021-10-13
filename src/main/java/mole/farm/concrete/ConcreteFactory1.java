package mole.farm.concrete;

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
