import moleFarm.common.factory.AbstractCropsFactory;
import moleFarm.common.product.AbstractCrops;
import moleFarm.concrete.ConcreteFactory1;
import moleFarm.concrete.crops.Eggplant;
import moleFarm.other.MyException;

public class DemoTest {
    public static void main(String[] args) throws Exception {
        AbstractCrops crops = AbstractCropsFactory.newInstance().create("Eggplant");

        try {
            ConcreteFactory1 concreteFactory1 = ConcreteFactory1.newInstance();
            AbstractCrops cabbage = concreteFactory1.createCrops("Cabbage");

        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }
}
