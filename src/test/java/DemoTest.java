import moleFarm.pattern.factory.conc.CropsFactory;
import moleFarm.common.product.AbstractCrops;
import moleFarm.pattern.abstractFactory.conc.ConcreteFactory1;
import moleFarm.common.utils.MyException;

public class DemoTest {
    public static void main(String[] args) throws Exception {
        AbstractCrops crops = CropsFactory.newInstance().create("Eggplant");

        try {
            ConcreteFactory1 concreteFactory1 = ConcreteFactory1.newInstance();
            AbstractCrops cabbage = concreteFactory1.createCrops("Cabbage");

        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }
}
