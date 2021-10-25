import moleFarm.MoleFarmWarehouse;
import moleFarm.common.product.AbstractFertilizer;

import java.util.*;

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
        List<String> arr = new ArrayList<>(Arrays.asList("123", "456", "123"));
        arr.removeIf((String s) -> s.equals("123"));
        System.out.println(arr);

    }

}
