import moleFarm.common.other.MyException;
import moleFarm.common.factory.FarmProductFactory;
import moleFarm.concrete.crops.Cabbage;
import moleFarm.concrete.crops.Wheat;
import moleFarm.concrete.seed.RiceSeed;
import moleFarm.concrete.seed.StrawberrySeed;

public class DemoTest {
    public static void main(String[] args) {
        try {
            StrawberrySeed farmProduct1 = FarmProductFactory.createFarmProduct(StrawberrySeed.class);
            System.out.println(farmProduct1.getName());
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }
}
