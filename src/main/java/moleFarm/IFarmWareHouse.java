package moleFarm;

import moleFarm.common.product.AbstractCrops;
import moleFarm.common.product.AbstractSeed;
import moleFarm.common.product.IProduct;

import java.util.List;

/**
 * 要调用商店的接口，进行
 */
public interface IFarmWareHouse {
    /**
     * 从商店进口种子
     *
     * @param seedList
     * @return
     */
    boolean importSeedFromShop(AbstractSeed seedList, int num);

    /**
     * 出口作物到商店
     *
     * @param cropsList
     * @return
     */
    boolean exportCropsToShop(AbstractCrops cropsList, int num);

    /**
     * 给摩尔提供需要的东西
     *
     * @param objectList 这里肯定要修改，比较怪异
     * @return
     */
    <T extends IProduct> boolean provideItemToMole(List<T> objectList);

    /**
     * 存作物到仓库
     *
     * @param cropsList
     * @return
     */
    boolean storeToRepository(List<AbstractCrops> cropsList);
}
