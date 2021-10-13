package mole.farm.common;

import mole.farm.common.farmabstract.AbstractCrops;
import mole.farm.common.farmabstract.AbstractSeed;
import mole.farm.common.farmabstract.useless.IMole;

import java.util.List;

/**
 * 要调用商店的接口，进行
 */
public interface IFarmWareHouse {
    /**
     * 从商店进口种子
     * @param seedList
     * @return
     */
    boolean importSeedFromShop(List<AbstractSeed> seedList);
    /**
     * 出口作物到商店
     * @param cropsList
     * @return
     */
    boolean exportCropsToShop(List<AbstractCrops> cropsList);
    /**
     * 给摩尔提供需要的东西
     * @param objectList
     * 这里肯定要修改，比较怪异
     * @return
     */
    boolean provideItemToMole(List<IMole> objectList);
    /**
     * 存作物到仓库
     * @param cropsList
     * @return
     */
    boolean storeToRepository(List<AbstractCrops> cropsList);
}
