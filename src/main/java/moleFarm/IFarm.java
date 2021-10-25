package moleFarm;

import moleFarm.common.product.AbstractCrops;
import moleFarm.common.product.AbstractSeed;
import moleFarm.common.utils.MyException;

import java.util.List;

/**
 * 定义农场行为
 */
public interface IFarm {
    /**
     * 一键种植种子
     *
     * @param seed
     */
    void plantBatchSeeds(AbstractSeed seed) throws MyException;

    /**
     * 种植种子
     *
     * @param seed
     */
    void plantSeeds(AbstractSeed seed);

    /**
     * 收获作物
     */
    List<AbstractCrops> harvestCrops();
}
