package moleFarm.pattern.builder.conc;

import moleFarm.common.product.AbstractCrops;
import moleFarm.common.product.AbstractFertilizer;
import moleFarm.common.product.AbstractSeed;
import moleFarm.common.status.FarmBlockStatus;
import moleFarm.pattern.builder.Builder;

import java.util.Arrays;
import java.util.List;

public class ConcreteBuilder1 extends Builder {
    @Override
    public void buildPlantSeed(AbstractSeed seed) {
        System.out.println("正在播种"+seed.getName()+"...");
        List<AbstractSeed> Seeds = Arrays.asList(seed);
        moleFarmWarehouse.provideItemToMole(Seeds);
    }
    @Override
    public void buildLoosenSoil() {
        moleFarmWarehouse.getHoe().ToolBehavior();
    }

    @Override
    public void buildWatering() {
        if(farmBlock.getStatusList().removeIf(s -> s.equals(FarmBlockStatus.DROUGHT))) {
            moleFarmWarehouse.getWateringCan().ToolBehavior();
        }
        else {
            System.out.println("该农田块处于湿润状态，无需浇水");
        }
    }

    @Override
    public void buildApplyFertilizer(AbstractFertilizer fertilizer) {
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

    @Override
    public void buildWeed() {
        if(farmBlock.getStatusList().removeIf(s -> s.equals(FarmBlockStatus.DROUGHT))) {
            moleFarmWarehouse.getSickle().ToolBehavior();
        }
        else {
            System.out.println("没有杂草，无需除草");
        }
    }

    @Override
    public void buildDisinsection() {
        if(farmBlock.getStatusList().removeIf(s->s.equals(FarmBlockStatus.INSECT_DISASTER))){
            moleFarmWarehouse.getPesticide().ToolBehavior();
        }
        else{
            System.out.println("农场一片祥和,没有遭遇虫灾");
        }
    }

    @Override
    public AbstractCrops harvestCrops() {
        return null;
    }
}
