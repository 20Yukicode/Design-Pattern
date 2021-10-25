package moleFarm;

import moleFarm.common.product.AbstractCrops;
import moleFarm.common.product.AbstractFertilizer;
import moleFarm.common.product.AbstractSeed;
import moleFarm.common.status.FarmBlockStatus;
import moleFarm.common.status.SeedStatus;
import moleFarm.common.utils.MyException;
import moleFarm.pattern.factory.conc.CropsFactory;

import java.util.Collections;
import java.util.List;

public class FarmGrowth {
    /**
     * 此处农场是单例模式
     */
    private static MoleFarmWarehouse moleFarmWarehouse = MoleFarmWarehouse.newInstance();

    public FarmGrowth() {
    }

    /**
     * 播种
     *
     * @param seed
     */
    public static void PlantSeed(AbstractSeed seed, MoleFarmBlock farmBlock) {
        if (farmBlock.getSeed() != null) {
            System.out.println("该土地上已有种子，无法继续种植");
        } else if (seed == null) {
            System.out.println("您手上没有种子，无法种植");
        } else {
            System.out.println("正在播种" + seed.getName() + "...");
            farmBlock.setSeed(seed);
            List<AbstractSeed> Seeds = Collections.singletonList(seed);
            //这个是调用仓库的代码，可能还要重写
            moleFarmWarehouse.provideItemToMole(Seeds);
        }
    }

    /**
     * 铲除作物
     */
    public static void eradicateCrops(MoleFarmBlock farmBlock) {
        if (farmBlock.getSeed() != null) {
            moleFarmWarehouse.shovel.ToolBehavior();
            farmBlock.setSeed(null);
        } else {
            System.out.println("该土地上没有作物,不能铲除");
        }
    }

    /**
     * 松土
     */
    public static void LoosenSoil(MoleFarmBlock farmBlock) {
        if (farmBlock.getStatusList().removeIf(s -> s.equals(FarmBlockStatus.LAND_HARD))) {
            moleFarmWarehouse.getHoe().ToolBehavior();
        } else {
            System.out.println("该农田块已经松过土，无需再松土");
        }
    }

    /**
     * 浇水
     */
    public static void Watering(MoleFarmBlock farmBlock) {
        if (farmBlock.getStatusList().removeIf(s -> s.equals(FarmBlockStatus.DROUGHT))) {
            moleFarmWarehouse.getWateringCan().ToolBehavior();
        } else {
            System.out.println("该农田块处于湿润状态，无需浇水");
        }
    }

    /**
     * 施肥
     *
     * @param fertilizer
     */
    public static void ApplyFertilizer(AbstractFertilizer fertilizer, MoleFarmBlock farmBlock) {
        if (farmBlock.getSeed() != null && farmBlock.getSeedStatus() != null && farmBlock.getSeedStatus() < 6 && fertilizer != null) {
            System.out.println("正在用" + fertilizer.getName() + "施肥");
            Integer remainNum = moleFarmWarehouse.getFertilizerMap().get(fertilizer);
            remainNum -= 1;
            //设置新的数量
            moleFarmWarehouse.getFertilizerMap().put(fertilizer, remainNum);

            int status = farmBlock.getSeedStatus();
            Integer integer = fertilizer.fertilizerBehavior(status);
            //设置新的状态
            farmBlock.setSeedStatus(integer);
        } else if (farmBlock.getSeedStatus() >= 6) {
            System.out.println("作物已经成熟,请立即收获");
        } else {
            System.out.println("此处没有种子种植,播种后再施肥效果更佳噢");
        }
    }

    /**
     * 除草
     */
    public static void Weed(MoleFarmBlock farmBlock) {
        if (farmBlock.getStatusList().removeIf(s -> s.equals(FarmBlockStatus.WEEDS))) {
            moleFarmWarehouse.getSickle().ToolBehavior();
        } else {
            System.out.println("没有杂草，无需除草");
        }
    }

    /**
     * 除虫
     */
    public static void Disinsection(MoleFarmBlock farmBlock) {
        if (farmBlock.getStatusList().removeIf(s -> s.equals(FarmBlockStatus.INSECT_DISASTER))) {
            moleFarmWarehouse.getPesticide().ToolBehavior();
        } else {
            System.out.println("农场一片祥和,没有遭遇虫灾");
        }
    }

    /**
     * 收获作物
     *
     * @return
     */
    public static AbstractCrops harvestCrops(MoleFarmBlock farmBlock) {
        if (farmBlock.getSeed() == null) {
            System.out.println("该土地上没有种植作物");
        } else if (farmBlock.getSeedStatus() < 6) {
            System.out.println("作物" + farmBlock.getSeed().getName() + "正处于" +
                    SeedStatus.getSeedStatusByNum(farmBlock.getSeedStatus()).getText() + "期,请过一段时间后再来收获"
            );
        } else {
            farmBlock.setSeed(null);
            String name = farmBlock.getSeed().getName();
            CropsFactory cropsFactory = CropsFactory.newInstance();
            try {
                return cropsFactory.create(name.replace("Seed", ""));
            } catch (MyException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public static void setMoleFarmWarehouse(MoleFarmWarehouse moleFarmWarehouse) {
        FarmGrowth.moleFarmWarehouse = moleFarmWarehouse;
    }
}
