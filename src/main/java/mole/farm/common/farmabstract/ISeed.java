package mole.farm.common.farmabstract;

import mole.farm.common.farmabstract.useless.IFarm;

import java.util.List;

/**
 * 定义种子行为
 */
public interface ISeed extends IFarm {
    /**
     * 播种种子
     * @param seedList
     */
    void sowSeeds(List<AbstractSeed>seedList);
}
