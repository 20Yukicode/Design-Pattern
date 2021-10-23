package moleFarm;

import moleFarm.common.product.AbstractCrops;
import moleFarm.common.product.AbstractSeed;

/**
 * 这个类是由MoleFarmBlock实现的
 * 到时候需要删除IFarm里面的函数
 * 但是plantSeed需要保留，调用的是IFarmBlock的plantSeed
 */
public interface IFarmBlock {
    /**
     * 种植
     */
    void plantSeed(AbstractSeed seed);
    /**
     * 收获作物
     */
    AbstractCrops harvestCrops();
}
