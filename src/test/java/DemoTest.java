import moleFarm.common.other.MyException;
import moleFarm.concrete.factory.FarmObjectFactory;
import moleFarm.concrete.seed.RiceSeed;

public class DemoTest {
    public static void main(String[] args) {
        RiceSeed cabbage = null;
        try {
            cabbage = FarmObjectFactory.createFarmProduct("RiceSeed1");
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
        //System.out.println(cabbage.getColor());
    }
}
