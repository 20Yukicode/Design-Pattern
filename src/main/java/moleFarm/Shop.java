package moleFarm;

import moleFarm.common.product.AbstractFertilizer;
import moleFarm.common.product.AbstractSeed;
import moleFarm.common.product.IProduct;
import moleFarm.common.utils.MyException;
import moleFarm.pattern.adapter.MoleAdapter;
import moleFarm.pattern.adapter.Target;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
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

    public<T extends IProduct> boolean buyObject(T object, int num, String methodName) throws MyException {
        Double price = object.getPrice() * num;
        //需要有一个摩尔角色类，判断剩余摩尔豆是否大于等于交换金额，是则返回true，并扣除相应大小的摩尔豆
        //调用适配器
        Target mole = new MoleAdapter();
        Double money = mole.getMoleDou();
        if (money < price)
            return false;
        mole.setMoleDou(money - price);
        try {
            Method method = MoleFarmWarehouse.class.getDeclaredMethod(methodName);
            Map<T, Integer> objectMap = (Map<T, Integer>) method.invoke(moleFarmWarehouse);
            Integer orinum = objectMap.putIfAbsent(object, num);
            //若仓库中原本有库存，则将其与新增进货量累加
            if (orinum != null)
                objectMap.put(object, num + orinum);
            return true;
            //返回仓库中该种子的原有数量，若map中无该类种子，则插入并返回null
        } catch (IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
            throw new MyException("购买出错......");
        }
    }

    public boolean BuySeeds(AbstractSeed seed, int num) throws MyException {
        return buyObject(seed, num, "getSeedMap");
    }

    public boolean BuyFertilizer(AbstractFertilizer fertilizer, int num) throws MyException {
        return buyObject(fertilizer, num, "getFertilizerMap");
    }
}
