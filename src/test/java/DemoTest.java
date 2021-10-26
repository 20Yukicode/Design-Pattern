import moleFarm.Home;
import moleFarm.MoleFarmWarehouse;
import moleFarm.common.product.AbstractFertilizer;
import moleFarm.common.product.IProduct;
import moleFarm.common.utils.JsonOp;
import moleFarm.pattern.factory.FarmProductFactory;

import java.util.HashMap;
import java.util.Map;

public class DemoTest {
    static MoleFarmWarehouse moleFarmWarehouse = Home.farmWarehouse;
    static Map<AbstractFertilizer, Integer> map = new HashMap<>();

    public static void contains(String... name) {
        for (String s : name) {
            System.out.println(name);
        }
    }

    public static void main(String[] args) throws Exception {
        Double a = 100.0;
        for (int i = 0; i < 6; i++) {
            a -= 20;
            System.out.println(a);
        }
        String text = "高级肥料";
        Map<String, String> stringStringMap = JsonOp.searchMapper();
        String s = stringStringMap.get(text);
        System.out.println(s);
        IProduct crops = FarmProductFactory.createFarmProduct(s);
        System.out.println(crops);
        System.out.println(crops.getName());
    }

}
