package moleFarm.pattern.builder;

import moleFarm.MoleFarmBlock;
import moleFarm.common.product.AbstractFertilizer;
import moleFarm.common.product.AbstractSeed;

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

    public void test(AbstractSeed seed, AbstractFertilizer fertilizer) {
        builder.buildPlant(seed,fertilizer);
    }
}
