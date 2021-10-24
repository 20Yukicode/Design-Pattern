package moleFarm.pattern.builder.conc;

import moleFarm.common.status.FarmBlockStatus;
import moleFarm.pattern.builder.Builder;

public class ConcreteBuilder1 extends Builder {
    @Override
    public void buildPlantSeed() {

    }

    @Override
    public void buildLoosenSoil() {
        System.out.println("正在用"+hoe.getName()+"松土");
    }

    @Override
    public void buildWatering() {
        if(!farmBlock.getStatusList().contains(FarmBlockStatus.MOIST)){
            wateringCan.ToolBehavior();
        }
        else{
            System.out.println("该农田块处于湿润状态，无需浇水");
        }
    }

    @Override
    public void buildApplyFertilizer() {

    }

    @Override
    public void buildWeed() {
        if(!farmBlock.getStatusList().contains(FarmBlockStatus.WEEDS)){

        }else{
            System.out.println("没有杂草，无需除草");
        }
    }

    @Override
    public void buildDisinsection() {

    }
}
