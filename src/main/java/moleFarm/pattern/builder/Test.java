package moleFarm.pattern.builder;

import moleFarm.MoleFarmBlock;
import moleFarm.common.product.fertilizer.AdvancedFertilizer;
import moleFarm.common.product.seed.CabbageSeed;
import moleFarm.pattern.builder.conc.ConcreteBuilder1;

public class Test {
    public static void main(String[] args) {
        MoleFarmBlock block = new MoleFarmBlock();
        Builder builder1 = new ConcreteBuilder1();
        //System.out.println(builder1.getFarmBlock());
        Director director = new Director(builder1, block);
        //因为是测试，随便传一个种子和一个肥料回去
        MoleFarmBlock moleFarmBlock = director.getMoleFarmBlock(new CabbageSeed(), new AdvancedFertilizer());
        //接着输出土地块的状态即可
        //moleFarmBlock.getStatusList().forEach(System.out::println);
    }
}
