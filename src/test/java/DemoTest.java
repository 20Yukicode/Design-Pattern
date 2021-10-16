import moleFarm.common.other.MyException;
import moleFarm.common.factory.FarmProductFactory;
import moleFarm.concrete.crops.Cabbage;
import moleFarm.concrete.crops.Wheat;
import moleFarm.concrete.seed.RiceSeed;

public class DemoTest {
    public static void main(String[] args) {
        try {
            RiceSeed riceSeed = FarmProductFactory.createFarmProduct("RiceSeed");
            System.out.println(riceSeed.getName());
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }
}
