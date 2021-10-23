package moleFarm;

import moleFarm.common.product.AbstractFertilizer;
import moleFarm.common.product.AbstractSeed;
import moleFarm.common.product.seed.CabbageSeed;

import java.util.Map;

/**
 * 商店类
 * 仓库从商店买入种子、肥料
 * 仓库卖出作物到商店
 */
public class Shop {
    private MoleFarmWarehouse moleFarmWarehouse;
    //关联商店与仓库
    public Shop(MoleFarmWarehouse Warehouse){
        this.moleFarmWarehouse = Warehouse;
    }
    public boolean BuySeeds(AbstractSeed seed, int num){
        Double price = seed.getPrice()*num;
        //需要有一个摩尔角色类，判断剩余摩尔豆是否大于等于交换金额，是则返回true，并扣除相应大小的摩尔豆
        //result = mole.dou>=price?true:false;
        Map<AbstractSeed, Integer> seedMap = moleFarmWarehouse.getSeedMap();
        //返回仓库中该种子的原有数量，若map中无该类种子，则插入并返回null
        Integer orinum = seedMap.putIfAbsent(seed,num);
        //若仓库中原本有库存，则将其与新增进货量累加
        if(orinum!=null)seedMap.put(seed,num+orinum);
        return true;
    }
    public boolean BuyFertilizer(AbstractFertilizer fertilizer, int num){
        Double price = fertilizer.getPrice()*num;
        //需要有一个摩尔角色类，判断剩余摩尔豆是否大于等于交换金额，是则返回true，并扣除相应大小的摩尔豆
        //result = mole.dou>=price?true:false;
        Map<AbstractFertilizer, Integer> fertilizerMap = moleFarmWarehouse.getFertilizerMap();
        //返回仓库中该种子的原有数量，若map中无该类种子，则插入并返回null
        Integer orinum = fertilizerMap.putIfAbsent(fertilizer,num);
        //若仓库中原本有库存，则将其与新增进货量累加
        if(orinum!=null)fertilizerMap.put(fertilizer,num+orinum);
        return true;
    }
}
