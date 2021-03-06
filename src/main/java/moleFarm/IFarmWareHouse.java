package moleFarm;

import moleFarm.common.product.AbstractCrops;
import moleFarm.common.product.AbstractFertilizer;
import moleFarm.common.product.AbstractSeed;
import moleFarm.common.product.IProduct;

import java.util.List;

/**
 * 要调用商店的接口，进行
 */
public interface IFarmWareHouse {
    /**
     * 从商店买种子
     *
     * @param seed
     * @param num
     * @return
     */
    boolean buySeeds(AbstractSeed seed, int num);

    /**
     * 从商店买肥料
     *
     * @param fertilizer
     * @param num
     * @return
     */
    boolean buyFertilizer(AbstractFertilizer fertilizer, int num);

    /**
     * 出口作物到商店
     *
     * @param crops
     * @param num
     * @return
     */
    boolean sellCrops(AbstractCrops crops, int num);

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
