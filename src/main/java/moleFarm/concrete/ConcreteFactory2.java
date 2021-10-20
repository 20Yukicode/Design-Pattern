package moleFarm.concrete;

import moleFarm.common.factory.AbstractCropsFactory;
import moleFarm.common.factory.AbstractFarmToolFactory;
import moleFarm.common.factory.AbstractFertilizerFactory;
import moleFarm.common.factory.AbstractSeedFactory;
import moleFarm.common.other.MyException;
import moleFarm.common.product.AbstractCrops;
import moleFarm.common.product.AbstractFarmTool;
import moleFarm.common.product.AbstractFertilizer;
import moleFarm.common.product.AbstractSeed;
import moleFarm.common.IFactory;

/**
 * 具体生产种子，肥料，农具的工厂
 * 生产茄子、西瓜、小麦的作物及种子
 * 生产中低级肥料
 * 生产锄头
 * 此类生产产品去moleFarm.factory下的对应工厂调用方法
 */
public class ConcreteFactory2 implements IFactory {

    @Override
    public AbstractCrops createCrops(String name) throws MyException {
        AbstractCropsFactory abstractCropsFactory = AbstractCropsFactory.newInstance();
        return abstractCropsFactory.create(name);
    }
    @Override
    public AbstractSeed createSeed(String name) throws MyException {

        AbstractSeedFactory abstractSeedFactory = AbstractSeedFactory.newInstance();
        return abstractSeedFactory.create(name);
    }

    @Override
    public AbstractFertilizer createFertilier(String name) throws MyException {
        AbstractFertilizerFactory abstractFertilizerFactory = AbstractFertilizerFactory.newInstance();
        return abstractFertilizerFactory.create(name);
    }

    @Override
    public AbstractFarmTool createFarmTool(String name) throws MyException {
        AbstractFarmToolFactory abstractFarmToolFactory = AbstractFarmToolFactory.newInstance();
        return abstractFarmToolFactory.create(name);
    }
}

