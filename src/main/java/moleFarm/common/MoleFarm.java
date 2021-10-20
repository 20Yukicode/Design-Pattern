package moleFarm.common;

import moleFarm.common.product.AbstractSeed;
import moleFarm.common.status.FarmBlockStatus;
import moleFarm.concrete.Iterator.FarmIterator;

import java.util.List;

/**
 * 摩尔个人农场
 * implements IFarm
 */
public class MoleFarm {
    /**
     * 农田块数量
     */
    private Integer farmBlockCount;
    /**
     * 形状
     */
    private String shape;
    /**
     * 面积
     */
    private Integer area;
    /**
     * 农田块列表
     */
    private List<MoleFarmBlock> farmBlockList;
    /**
     *农田存放的种子
     */
    private List<AbstractSeed> seedList;

    /**
     * 迭代器
     * @return
     */
    public Iterator getIterator(){
        return (new FarmIterator(farmBlockList));
    }

}
