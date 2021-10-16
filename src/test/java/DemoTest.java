import moleFarm.common.other.MyException;
import moleFarm.common.factory.FarmProductFactory;
import moleFarm.concrete.seed.RiceSeed;

public class DemoTest {
    public static void main(String[] args) {
        RiceSeed cabbage = null;
        try {
            cabbage = FarmProductFactory.createFarmProduct("RiceSeed1");
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
        //System.out.println(cabbage.getColor());
    }
}
