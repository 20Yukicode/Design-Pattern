import moleFarm.common.factory.AbstractCropsFactory;
import moleFarm.common.factory.FarmProductFactory;
import moleFarm.common.product.AbstractCrops;
import moleFarm.concrete.ConcreteFactory1;
import moleFarm.concrete.crops.Cabbage;
import moleFarm.other.MyException;

public class DemoTest {
    public static void main(String[] args) throws Exception {
        Cabbage cabbage = FarmProductFactory.createFarmProduct("Cabbage");
        System.out.println(cabbage.getName());
        AbstractCrops crops = AbstractCropsFactory.newInstance().create("Cabbage");

        try {
            ConcreteFactory1 concreteFactory1 = ConcreteFactory1.newInstance();
            concreteFactory1.createCrops("Cabbage")

        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }
}
