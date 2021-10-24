package moleFarm;

import moleFarm.MoleFarmBlock;
import moleFarm.MoleFarmWarehouse;
import moleFarm.common.product.AbstractCrops;
import moleFarm.common.product.AbstractFertilizer;
import moleFarm.common.product.AbstractSeed;
import moleFarm.common.status.FarmBlockStatus;
import moleFarm.common.utils.MyException;
import moleFarm.pattern.factory.conc.CropsFactory;

import java.util.Arrays;
import java.util.List;

public class FarmGrowth {
    private MoleFarmWarehouse moleFarmWarehouse;

    private MoleFarmBlock farmBlock;

    public FarmGrowth(MoleFarmWarehouse moleFarmWarehouse, MoleFarmBlock farmBlock){
        this.moleFarmWarehouse=moleFarmWarehouse;
        this.farmBlock=farmBlock;
    }
    /**
     * 播种
     * @param seed
     */
    public void PlantSeed(AbstractSeed seed) {
        System.out.println("正在播种"+seed.getName()+"...");
        farmBlock.setSeed(seed);
        List<AbstractSeed> Seeds = Arrays.asList(seed);
        //这个是调用仓库的代码，可能还要重写
        moleFarmWarehouse.provideItemToMole(Seeds);
    }

    /**
     * 松土
     */
    public void LoosenSoil() {
        moleFarmWarehouse.getHoe().ToolBehavior();
    }

    /**
     * 浇水
     */
    public void Watering() {
        if(farmBlock.getStatusList().removeIf(s -> s.equals(FarmBlockStatus.DROUGHT))) {
            moleFarmWarehouse.getWateringCan().ToolBehavior();
        }
        else {
            System.out.println("该农田块处于湿润状态，无需浇水");
        }
    }

    /**
     * 施肥
     * @param fertilizer
     */
    public void ApplyFertilizer(AbstractFertilizer fertilizer) {
        if(farmBlock.getSeed()!=null&&farmBlock.getSeedStatus()!=null&&farmBlock.getSeedStatus()<6){
            System.out.println("正在用"+fertilizer.getName()+"施肥");
            Integer remainNum = moleFarmWarehouse.getFertilizerMap().get(fertilizer);
            remainNum-=1;
            //设置新的数量
            moleFarmWarehouse.getFertilizerMap().put(fertilizer,remainNum);

            int status= farmBlock.getSeedStatus();
            Integer integer = fertilizer.fertilizerBehavior(status);
            //设置新的状态
            farmBlock.setSeedStatus(integer);
        }
        else if(farmBlock.getSeedStatus()>=6){
            System.out.println("作物已经成熟,请立即收获");
        }
        else{
            System.out.println("此处没有种子种植,播种后再施肥效果更佳噢");
        }
    }

    /**
     * 除草
     */
    public void Weed() {
        if(farmBlock.getStatusList().removeIf(s -> s.equals(FarmBlockStatus.DROUGHT))) {
            moleFarmWarehouse.getSickle().ToolBehavior();
        }
        else {
            System.out.println("没有杂草，无需除草");
        }
    }

    /**
     * 除虫
     */
    public void Disinsection() {
        if(farmBlock.getStatusList().removeIf(s->s.equals(FarmBlockStatus.INSECT_DISASTER))){
            moleFarmWarehouse.getPesticide().ToolBehavior();
        }
        else{
            System.out.println("农场一片祥和,没有遭遇虫灾");
        }
    }

    /**
     * 收获作物
     * @return
     */
    public AbstractCrops harvestCrops() {
        if(farmBlock.getSeed()!=null&&farmBlock.getSeedStatus()>=6){
            String name= farmBlock.getSeed().getName();
            CropsFactory cropsFactory = CropsFactory.newInstance();
            try {
                return cropsFactory.create(name.replace("Seed",""));
            } catch (MyException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
