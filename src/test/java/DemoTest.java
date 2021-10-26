import com.alibaba.fastjson.JSONObject;
import moleFarm.MoleFarmWarehouse;
import moleFarm.common.product.AbstractCrops;
import moleFarm.common.product.AbstractFertilizer;
import moleFarm.common.utils.JsonOp;
import moleFarm.pattern.factory.conc.CropsFactory;

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
        String text = "草莓";
        JSONObject jsonObject = JsonOp.searchMapper();
        AbstractCrops crops = CropsFactory.newInstance().create((String) jsonObject.get(text));
        System.out.println(crops.getName());


        Set<String> he = new HashSet<>();
        List<String> arr = new ArrayList<>(Arrays.asList("123", "456", "123"));
        arr.removeIf((String s) -> s.equals("123"));
        System.out.println(arr);

    }

}
