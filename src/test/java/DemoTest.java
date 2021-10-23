import moleFarm.common.product.AbstractCrops;
import moleFarm.common.utils.JsonOp;
import moleFarm.common.utils.MyException;
import moleFarm.pattern.abstractFactory.conc.ConcreteFactory1;
import moleFarm.pattern.abstractFactory.conc.ConcreteFactory2;

public class DemoTest {
    public static void main(String[] args) throws Exception {
        String farmProductFactory = JsonOp.getMsgJson("FarmProductFactory");
        System.out.println(farmProductFactory);
        try {
            ConcreteFactory2 concreteFactory2 = ConcreteFactory2.newInstance();
            AbstractCrops cabbage = concreteFactory2.createCrops("Wheat");
            System.out.println(cabbage.getName());
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }
}
