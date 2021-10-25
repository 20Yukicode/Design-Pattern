import moleFarm.MoleFarmWarehouse;
import moleFarm.common.product.AbstractCrops;
import moleFarm.common.product.AbstractFertilizer;
import moleFarm.common.product.AbstractSeed;
import moleFarm.common.product.fertilizer.AdvancedFertilizer;
import moleFarm.common.product.fertilizer.MiddleFertilizer;
import moleFarm.common.product.seed.CabbageSeed;
import moleFarm.common.status.SeedStatus;
import moleFarm.common.utils.JsonOp;
import moleFarm.common.utils.MyException;
import moleFarm.pattern.abstractFactory.conc.ConcreteFactory2;
import moleFarm.pattern.factory.conc.CropsFactory;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DemoTest {
    static MoleFarmWarehouse moleFarmWarehouse = MoleFarmWarehouse.newInstance();
    static Map<AbstractFertilizer, Integer> map = new HashMap<>();

    public static void contains(String... name) {
        for (String s : name) {
            System.out.println(name);
        }
    }

    public static void main(String[] args) throws Exception {
        Set<String> he = new HashSet<>();
        System.out.println(he.remove("456"));
        String name = "EggplantSeed";
        CropsFactory cropsFactory = CropsFactory.newInstance();
        System.out.println(cropsFactory.create(name.replace("Seed", "")).getName());

        System.out.println(name.replace("Seed", ""));
        System.out.println("");
        System.out.println(new CabbageSeed() instanceof Object);
        map.put(new MiddleFertilizer(), 10);
        map.put(new AdvancedFertilizer(), 100);
        System.out.println(map.put(new MiddleFertilizer(), 150));
        System.out.println(map);
        AbstractSeed abstractSeed = new CabbageSeed();
        System.out.println(abstractSeed.getClass());
        System.out.println(SeedStatus.getSeedStatusByNum(3));
        String farmProductFactory = JsonOp.getMsgJson("FarmProductFactory");
        System.out.println(farmProductFactory);
        try {
            ConcreteFactory2 concreteFactory2 = ConcreteFactory2.newInstance();
            AbstractCrops cabbage = concreteFactory2.createCrops("Wheat");
            System.out.println(cabbage.getName());
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }
}
