package mole.farm.common.farmabstract;

import mole.farm.common.farmabstract.useless.IMole;
import sun.security.ec.ECDSAOperations;

import java.util.List;

/**
 * 要调用商店的接口，进行
 */
public interface IFarmWareHouse {
    /**
     * 从商店进口种子
     * @param seedList
     */
    void importSeed(List<AbstractSeed> seedList);
    /**
     * 出口作物到商店
     * @param cropsList
     */
    void exportCrops(List<AbstractCrops> cropsList);
    /**
     * 给摩尔提供需要的东西
     * @param objectList
     */
    void provideItem(List<IMole> objectList);
}
