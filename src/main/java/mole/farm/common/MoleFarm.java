package mole.farm.common;

import mole.farm.common.farmabstract.AbstractSeed;
import mole.farm.common.farmenum.FarmStatus;

import java.util.List;

/**
 * 摩尔个人农场
 */
//implements Ifarm
public class MoleFarm {
    /**
     * 形状
     */
    private String shape;
    /**
     * 面积
     */
    private Integer area;
    /**
     * 状态
     */
    private List<FarmStatus> farmStatus;
    /**
     *农田存放的种子
     */
    private List<AbstractSeed> seedList;



}
