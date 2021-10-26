package moleFarm;

import moleFarm.common.exception.MyException;
import moleFarm.common.product.AbstractCrops;
import moleFarm.common.product.AbstractFertilizer;
import moleFarm.common.product.AbstractSeed;
import moleFarm.common.product.IProduct;
import moleFarm.pattern.adapter.Mole;
import moleFarm.pattern.adapter.Target;
import moleFarm.pattern.adapter.conc.MoleAdapter;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

/**
 * 商店类
 * 仓库从商店买入种子、肥料
 * 仓库卖出作物到商店
 */
public class Shop {

    private MoleFarmWarehouse moleFarmWarehouse = MoleFarmWarehouse.newInstance();

    //关联商店与仓库
    private Shop() {
    }

    public static Shop newInstance() {
        return new Shop();
    }

    public boolean buySeeds(AbstractSeed seed, int num) throws MyException {
        return moleFarmWarehouse.buySeeds(seed,num);
    }

    public boolean buyFertilizer(AbstractFertilizer fertilizer, int num) throws MyException {
        return moleFarmWarehouse.buyFertilizer(fertilizer,num);
    }

    public boolean sellCrops(AbstractCrops crops, int num) {
        return moleFarmWarehouse.sellCrops(crops,num);
    }
}
