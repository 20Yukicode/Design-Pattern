package mole.farm.common;

import mole.farm.common.farmabstract.AbstractCrops;
import mole.farm.common.farmabstract.AbstractSeed;
import mole.farm.common.farmabstract.useless.IFarm;

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
    boolean importSeed(List<AbstractSeed> seedList);
    /**
     * 出口作物到商店
     * @param cropsList
     * @return
     */
    boolean exportCrops(List<AbstractCrops> cropsList);
    /**
     * 给摩尔提供需要的东西
     * @param objectList
     * 这里肯定要修改，比较怪异
     * @return
     */
    boolean provideItem(List<IFarm> objectList);
}
