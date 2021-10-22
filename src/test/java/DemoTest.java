import moleFarm.common.product.AbstractCrops;
import moleFarm.concrete.ConcreteFactory1;
import moleFarm.other.MyException;

public class DemoTest {
    public static void main(String[] args) {
        try {
            ConcreteFactory1 concreteFactory1 = ConcreteFactory1.newInstance();
            AbstractCrops cabbage = concreteFactory1.createCrops("Cabbage");
            System.out.println(cabbage.getName());
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }

    }
}
