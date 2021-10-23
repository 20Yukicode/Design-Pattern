package moleFarm.pattern.builder;

import moleFarm.MoleFarmBlock;

public class Director {
    Builder builder;
    Director(Builder builder){
        this.builder=builder;
    }

    public Builder getBuilder() {
        return builder;
    }

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    public MoleFarmBlock farmGrowth(){
        builder.buildLoosenSoil();
        builder.buildPlantSeed();
        builder.buildWatering();
        return builder.getFarmBlock();
    }
}
