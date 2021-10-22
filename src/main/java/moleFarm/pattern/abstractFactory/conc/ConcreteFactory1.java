package moleFarm.pattern.abstractFactory.conc;

import moleFarm.pattern.abstractFactory.IFactory;
import moleFarm.pattern.factory.conc.CropsFactory;
import moleFarm.pattern.factory.conc.ToolFactory;
import moleFarm.pattern.factory.conc.FertilizerFactory;
import moleFarm.pattern.factory.conc.SeedFactory;
import moleFarm.common.product.AbstractCrops;
import moleFarm.common.product.AbstractTool;
import moleFarm.common.product.AbstractFertilizer;
import moleFarm.common.product.AbstractSeed;
import moleFarm.common.utils.MyException;

/**
 * 具体生产种子，肥料，农具的工厂
 * 生产白菜、草莓、水稻的作物及种子
 * 生产高级肥料
 * 生产水壶和镰刀
 * 此类生产产品去moleFarm.factory下的对应工厂调用方法
 */
public class ConcreteFactory1 implements IFactory {
    public static ConcreteFactory1 newInstance() throws MyException{
        return IFactory.newConcreteFactory("ConcreteFactory1");
    }
    @Override
    public AbstractCrops createCrops(String name) throws MyException {
        CropsFactory cropsFactory = CropsFactory.newInstance();
        return cropsFactory.create(name);
    }
    @Override
    public AbstractSeed createSeed(String name) throws MyException {

        SeedFactory seedFactory = SeedFactory.newInstance();
        return seedFactory.create(name);
    }

    @Override
    public AbstractFertilizer createFertilier(String name) throws MyException {
        FertilizerFactory fertilizerFactory = FertilizerFactory.newInstance();
        return fertilizerFactory.create(name);
    }

    @Override
    public AbstractTool createFarmTool(String name) throws MyException {
        ToolFactory toolFactory = ToolFactory.newInstance();
        return toolFactory.create(name);
    }
}
