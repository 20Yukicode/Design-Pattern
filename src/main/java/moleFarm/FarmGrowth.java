package moleFarm;

import moleFarm.common.exception.product.conc.CropsNotFoundException;
import moleFarm.common.exception.product.conc.FertilizerNotFoundException;
import moleFarm.common.exception.product.conc.SeedNotFoundException;
import moleFarm.common.product.AbstractCrops;
import moleFarm.common.product.AbstractFertilizer;
import moleFarm.common.product.AbstractSeed;
import moleFarm.common.status.FarmBlockStatus;
import moleFarm.common.status.SeedStatus;
import moleFarm.common.utils.JsonOp;
import moleFarm.pattern.factory.conc.CropsFactory;
import moleFarm.pattern.factory.conc.FertilizerFactory;
import moleFarm.pattern.factory.conc.SeedFactory;

import java.util.Collections;
import java.util.List;
import java.util.Map;

public class FarmGrowth {
    /**
     * 此处农场是单例模式
     */
    private static final SeedFactory seedFactory = SeedFactory.newInstance();
    private static final FertilizerFactory fertilizerFactory = FertilizerFactory.newInstance();
    private static final CropsFactory cropsFactory = CropsFactory.newInstance();
    private static MoleFarmWarehouse moleFarmWarehouse = MoleFarmWarehouse.newInstance();
    private static final Map<String, String> map = JsonOp.searchMapper();

    public FarmGrowth() {
    }

    /**
     * 播种
     *
     * @param seed
     */
    public static void plantSeed(AbstractSeed seed, MoleFarmBlock farmBlock) {
        if (seed == null) {
            System.out.println("您手上没有种子，无法种植");
        } else {
            System.out.println("正在播种" + seed.getName() + "...");
            farmBlock.setSeed(seed);
            //设置生长周期
            farmBlock.setSeedStatus(0);
            List<AbstractSeed> seeds = Collections.singletonList(seed);
            //这个是调用仓库的代码，可能还要重写
            moleFarmWarehouse.provideItemToMole(seeds);
        }
    }

    /**
     * 播种
     * 重载
     *
     * @param name
     */
    public static void plantSeed(String name, MoleFarmBlock farmBlock) throws SeedNotFoundException {
        AbstractSeed seed = seedFactory.create(map.get(name));
        plantSeed(seed, farmBlock);
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
    public static void loosenSoil(MoleFarmBlock farmBlock) {
        moleFarmWarehouse.getHoe().ToolBehavior();
    }

    /**
     * 浇水
     */
    public static void watering(MoleFarmBlock farmBlock) {
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
    public static void applyFertilizer(AbstractFertilizer fertilizer, MoleFarmBlock farmBlock) {
        if (fertilizer == null) {
            System.out.println("请输入正确的肥料名称噢");
        } else if (farmBlock.getSeed() != null && farmBlock.getSeedStatus() != null && farmBlock.getSeedStatus() < 6) {
            System.out.println("正在用" + fertilizer.getName() + "施肥");
            Integer remainNum = moleFarmWarehouse.getFertilizerMap().get(fertilizer);
            remainNum -= 1;
            //设置新的数量
            moleFarmWarehouse.getFertilizerMap().put(fertilizer, remainNum);

            int status = farmBlock.getSeedStatus();
            Integer integer = fertilizer.fertilizerBehavior(status);
            //设置新的状态
            farmBlock.setSeedStatus(integer);
        }
    }

    /**
     * 施肥(重载)
     *
     * @param name
     */
    public static void applyFertilizer(String name, MoleFarmBlock farmBlock) throws FertilizerNotFoundException {
        AbstractFertilizer fertilizer;
        fertilizer = fertilizerFactory.create(map.get(name));
        applyFertilizer(fertilizer, farmBlock);
    }

    /**
     * 除草
     */
    public static void weed(MoleFarmBlock farmBlock) {
        if (farmBlock.getStatusList().removeIf(s -> s.equals(FarmBlockStatus.WEEDS))) {
            moleFarmWarehouse.getSickle().ToolBehavior();
        } else {
            System.out.println("没有杂草，无需除草");
        }
    }

    /**
     * 除虫
     */
    public static void disinsection(MoleFarmBlock farmBlock) {
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
            try {
                return cropsFactory.create(name.replace("Seed", ""));
            } catch (CropsNotFoundException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public static void setMoleFarmWarehouse(MoleFarmWarehouse moleFarmWarehouse) {
        FarmGrowth.moleFarmWarehouse = moleFarmWarehouse;
    }
}
