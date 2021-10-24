package moleFarm.pattern.builder.conc;

import moleFarm.common.status.FarmBlockStatus;
import moleFarm.pattern.builder.Builder;

public class ConcreteBuilder1 extends Builder {
    @Override
    public void buildPlantSeed() {
        if(!farmBlock.getStatusList().contains(FarmBlockStatus.MOIST)){
            System.out.println("正在用"+wateringCan.getName()+"浇水");
        }
    }

    @Override
    public void buildLoosenSoil() {

    }

    @Override
    public void buildWatering() {

    }

    @Override
    public void buildApplyFertilizer() {

    }

    @Override
    public void buildWeed() {

    }

    @Override
    public void buildDisinsection() {

    }
}
