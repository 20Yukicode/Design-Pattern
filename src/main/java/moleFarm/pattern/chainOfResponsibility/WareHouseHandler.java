package moleFarm.pattern.chainOfResponsibility;

import moleFarm.MoleFarm;
import moleFarm.MoleFarmBlock;
import moleFarm.MoleFarmWarehouse;
import moleFarm.common.product.AbstractFertilizer;
import moleFarm.common.product.AbstractSeed;
import moleFarm.common.product.IProduct;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

public class WareHouseHandler extends Handler{
    @Override
    public <T extends IProduct> boolean provideSeeds(List<T> list) {
        for(T item:list){
            int num = item instanceof AbstractSeed?farmWarehouse.getSeedMap().get(item):farmWarehouse.getFertilizerMap().get(item);
            if(num==0){
                System.out.println("抱歉，仓库的"+item.getName()+"数量不足，正在为您向仓库进货......");
                return getNext().provideSeeds(list);
            }
            //仓库存量减1
            else {
                if(item instanceof AbstractSeed){
                    farmWarehouse.getSeedMap().put((AbstractSeed)item,num-1);
                }
                else farmWarehouse.getFertilizerMap().put((AbstractFertilizer) item,num-1);
            }
        }
        return true;
    }
}
