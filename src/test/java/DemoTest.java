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

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class DemoTest {
    static MoleFarmWarehouse moleFarmWarehouse=MoleFarmWarehouse.newInstance();
    static Map<AbstractFertilizer, Integer>map=new HashMap<>();
    public static void setFertilizerMap(AbstractFertilizer abstractFertilizer,Integer count) {
       map.forEach(
                (k,v)->{
                    if(Objects.equals(k.getName(), abstractFertilizer.getName())){
                        map.put(k,count);
                        return;
                    }
                }
        );
    }

    public static void main(String[] args) throws Exception {
        map.put(new MiddleFertilizer(),10);
        map.put(new AdvancedFertilizer(),100);
        System.out.println(map.get(new MiddleFertilizer()));

        setFertilizerMap(new MiddleFertilizer(),30);
        System.out.println(map);
        AbstractSeed abstractSeed=new CabbageSeed();
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
