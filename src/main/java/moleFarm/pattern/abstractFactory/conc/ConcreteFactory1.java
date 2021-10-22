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

import java.util.Arrays;
import java.util.List;

/**
 * 具体生产种子，肥料，农具的工厂
 * 生产白菜、草莓、水稻的作物及种子
 * 生产高级肥料
 * 生产水壶和镰刀
 * 此类生产产品去moleFarm.pattern.factory.conc下的对应工厂调用方法
 */
public class ConcreteFactory1 implements IFactory {
    private final List<String> cropsList = Arrays.asList("Cabbage", "Strawberry", "Rice");
    private final List<String> seedList = Arrays.asList("CabbageSeed", "StrawberrySeed", "RiceSeed");
    private final List<String> fertilizerList =Arrays.asList("AdvancedFertilizer");
    private final List<String> toolList = Arrays.asList("WateringCan","Sick");
    private final CropsFactory cropsFactory = CropsFactory.newInstance();
    private final SeedFactory seedFactory = SeedFactory.newInstance();
    private final FertilizerFactory fertilizerFactory = FertilizerFactory.newInstance();
    private final ToolFactory toolFactory = ToolFactory.newInstance();
    public static ConcreteFactory1 newInstance() throws MyException {
        return IFactory.newConcreteFactory("ConcreteFactory1");
    }
    @Override
    public AbstractCrops createCrops(String name) throws MyException {
        if (cropsList.contains(name))
            return cropsFactory.create(name);
        else
            throw new MyException("此工厂不生产该作物");
    }

    @Override
    public AbstractSeed createSeed(String name) throws MyException {
        if (seedList.contains(name))
            return seedFactory.create(name);
        else
            throw new MyException("此工厂不生产该种子");
    }

    @Override
    public AbstractFertilizer createFertilier(String name) throws MyException {
        if (fertilizerList.contains(name))
            return fertilizerFactory.create(name);
        else
            throw new MyException("此工厂不生产该肥料");
    }

    @Override
    public AbstractTool createTool(String name) throws MyException {
        if (toolList.contains(name))
            return toolFactory.create(name);
        else
            throw new MyException("此工厂不生产该工具");
    }
}
