package mole.farm.common;

import mole.farm.common.farmabstract.AbstractSeed;
import mole.farm.common.farmabstract.useless.IMole;
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
     * 打理农田
     *
     */
    void TakeCareForm();

    /**
     * 调用获取天气接口，判断是否能加水
     * @return
     */
    boolean getWeather();
}
