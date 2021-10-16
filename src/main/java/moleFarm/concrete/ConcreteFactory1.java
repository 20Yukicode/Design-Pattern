package moleFarm.concrete;

import moleFarm.common.product.AbstractCrops;
import moleFarm.common.product.AbstractFarmTool;
import moleFarm.common.product.AbstractFertilizer;
import moleFarm.common.product.AbstractSeed;

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
