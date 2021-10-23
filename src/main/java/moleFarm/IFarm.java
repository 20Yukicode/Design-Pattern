package moleFarm;

import moleFarm.common.product.AbstractCrops;
import moleFarm.common.product.AbstractSeed;
import moleFarm.common.utils.MyException;

import java.util.List;

/**
 * 定义农场行为
 */
public interface IFarm{
    /**
     * 种植种子
     * @param seedList
     */
    void plantSeeds(List<AbstractSeed>seedList) throws MyException;
    /**
     * 收获作物
     */
    List<AbstractCrops> harvestCrops();
}
