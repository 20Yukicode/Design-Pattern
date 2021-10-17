import moleFarm.common.factory.FarmProductFactory;
import moleFarm.common.other.MyException;
import moleFarm.concrete.seed.StrawberrySeed;

public class DemoTest {
    public static void main(String[] args) {
        try {
            StrawberrySeed farmProduct1 = FarmProductFactory.createFarmProduct("StrawberrySeed");
            System.out.println(farmProduct1.getName());
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }
}
