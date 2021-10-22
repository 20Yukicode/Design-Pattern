package moleFarm.pattern.abstractFactory.conc;

import moleFarm.common.product.AbstractCrops;
import moleFarm.common.product.AbstractFertilizer;
import moleFarm.common.product.AbstractSeed;
import moleFarm.common.product.AbstractTool;
import moleFarm.common.utils.MyException;
import moleFarm.pattern.abstractFactory.IFactory;
import moleFarm.pattern.factory.conc.CropsFactory;
import moleFarm.pattern.factory.conc.FertilizerFactory;
import moleFarm.pattern.factory.conc.SeedFactory;
import moleFarm.pattern.factory.conc.ToolFactory;

import java.util.Arrays;
import java.util.List;

/**
 * 具体生产种子，肥料，农具的工厂
 * 生产茄子、西瓜、小麦的作物及种子
 * 生产中低级肥料
 * 生产锄头
 * 此类生产产品去moleFarm.pattern.factory.conc下的对应工厂调用方法
 */
public class ConcreteFactory2 implements IFactory {
    private final List<String> cropsList = Arrays.asList("Eggplant", "Watermelon", "Wheat");
    private final List<String> seedList = Arrays.asList("EggplantSeed", "WatermelonSeed", "WheatSeed");
    private final List<String> fertilizerList = Arrays.asList("MiddleFertilizer", "PrimaryFertilizer");
    private final List<String> toolList = Arrays.asList("Hoe");
    private final CropsFactory cropsFactory = CropsFactory.newInstance();
    private final SeedFactory seedFactory = SeedFactory.newInstance();
    private final FertilizerFactory fertilizerFactory = FertilizerFactory.newInstance();
    private final ToolFactory toolFactory = ToolFactory.newInstance();

    public static ConcreteFactory2 newInstance() throws MyException {
        return IFactory.newConcreteFactory("ConcreteFactory2");
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

