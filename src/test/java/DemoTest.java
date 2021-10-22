import moleFarm.common.product.AbstractCrops;
import moleFarm.common.utils.MyException;
import moleFarm.pattern.abstractFactory.conc.ConcreteFactory1;
import moleFarm.pattern.factory.conc.CropsFactory;

public class DemoTest {
    public static void main(String[] args) throws Exception {
        try {
            ConcreteFactory1 concreteFactory1 = ConcreteFactory1.newInstance();
           AbstractCrops cabbage = concreteFactory1.createCrops("Cabbage");

        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }
}
