package mole.farm.common.factory;

import mole.farm.common.farmabstract.AbstractFarmTool;
import mole.farm.common.farmabstract.AbstractFertilizer;
import mole.farm.common.farmabstract.AbstractSeed;

/**
 * 抽象农场工厂
 */
public interface IFarmFactory {
    AbstractSeed newSeed();
    AbstractFertilizer newFertilier();
    AbstractFarmTool newFarmTool();
}
