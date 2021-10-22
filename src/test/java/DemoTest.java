import moleFarm.common.product.AbstractCrops;
import moleFarm.common.utils.JsonOp;
import moleFarm.common.utils.MyException;
import moleFarm.pattern.abstractFactory.conc.ConcreteFactory1;

public class DemoTest {
    public static void main(String[] args) throws Exception {
        System.out.println(JsonOp.getMsgJson("FarmProductFactory"));
        try {
            ConcreteFactory1 concreteFactory1 = ConcreteFactory1.newInstance();
           AbstractCrops cabbage = concreteFactory1.createCrops("Cabbage");

        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }
}
