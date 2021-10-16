package moleFarm.concrete.factory;

import moleFarm.common.farmabstract.AbstractFarmTool;
import moleFarm.common.farmenum.ProductType;
import moleFarm.common.other.JsonOp;
import moleFarm.common.other.MyException;
import moleFarm.concrete.crops.Cabbage;
import moleFarm.concrete.seed.RiceSeed;

import java.util.List;

public  class  FarmObjectFactory {
    static <T> T createFarmProduct(String name) {
        List<String> crops = JsonOp.searchJson(ProductType.CROPS);
        List<String> farmTool = JsonOp.searchJson(ProductType.FARM_TOOL);
        List<String> seed = JsonOp.searchJson(ProductType.SEED);
        List<String> fertilizer = JsonOp.searchJson(ProductType.FERTILIZER);
        try {
            if (crops.contains(name)) {
                return (T) AbstractCropsFactory.newInstance().create(name);
            } else if (farmTool.contains(name)) {
                return (T) AbstractFarmToolFactory.newInstance().create(name);
            } else if (seed.contains(name)) {
                return (T) AbstractSeedFactory.newInstance().create(name);
            } else if(fertilizer.contains(name)){
                return (T) AbstractFertilizerFactory.newInstance().create(name);
            }else{
                return null;
            }
        }
        catch (MyException e){
            System.out.println(e.getMessage());
        }
        return null;
    }

    public static void main(String[] args) {
        RiceSeed cabbage = FarmObjectFactory.createFarmProduct("RiceSeed");
        System.out.println(cabbage.getColor());
    }
}
