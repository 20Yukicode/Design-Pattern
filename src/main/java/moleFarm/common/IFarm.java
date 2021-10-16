package moleFarm.common;

import moleFarm.common.product.AbstractSeed;
import moleFarm.common.product.useless.IMole;

import java.util.List;
/**
 * 定义农场行为
 */
public interface IFarm extends IMole {
    /**
     * 种植种子
     * @param seedList
     */
    void plantSeed(List<AbstractSeed>seedList);
    /**
     * 收获作物
     */
    void harvestCrops();
    /**
     * 除草
     * @return
     */
    boolean weed();
    /**
     * 浇水
     * @return
     */
    boolean watering();
    /**
     * 施肥
     * @return
     */
    boolean applyFertilizer();
    /**
     * 除虫
     * @return
     */
    boolean disinsection();
    /**
     * 调用获取天气接口，判断是否能加水
     * @return
     */
    boolean getWeather();

}
