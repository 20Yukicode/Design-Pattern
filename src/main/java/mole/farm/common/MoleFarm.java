package mole.farm.common;

import mole.farm.common.farmabstract.IFarm;
import mole.farm.common.farmenum.FarmStatus;

import java.util.List;

/**
 * 摩尔个人农场
 */
public class MoleFarm implements IFarm {
    /**
     * 面积
     */
    private Integer area;
    /**
     * 状态
     */
    private List<FarmStatus> farmStatus;
    /**
     *
     */
}
