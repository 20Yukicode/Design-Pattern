package moleFarm;

import moleFarm.common.product.AbstractCrops;
import moleFarm.common.product.AbstractSeed;
import moleFarm.common.status.Shape;
import moleFarm.common.utils.MyException;
import moleFarm.pattern.iterator.conc.FarmIterator;
import moleFarm.pattern.iterator.Iterator;

import java.util.List;

/**
 * 摩尔个人农场
 * implements IFarm
 */
public class MoleFarm implements IFarm {
    /**
     * 农田块数量
     */
    private Integer farmBlockCount;
    /**
     * 形状
     */
    private Shape shape= Shape.CIRCULAR;
    /**
     * 面积
     */
    private Integer area=1;
    /**
     * 农田块列表
     */
    private List<MoleFarmBlock> farmBlockList=null;
    /**
     * 迭代器
     *
     * @return
     */
    public Iterator getIterator() {
        return (new FarmIterator(farmBlockList));
    }

    /**
     * 种下种子
     * @param seedList
     * @throws MyException
     */
    @Override
    public void plantSeeds(List<AbstractSeed> seedList) throws MyException {
        if (seedList.size() > farmBlockList.size())
            throw new MyException("作物数量太多，无法种植");
        for (int i = 0; i < seedList.size(); i++) {
            farmBlockList.get(i).plantSeed(seedList.get(i));
        }
    }

    /**
     * 收获作物
     * @return
     */
    @Override
    public List<AbstractCrops> harvestCrops() {
        List<AbstractCrops> cropsList=null;
        for(MoleFarmBlock item:farmBlockList){
            AbstractCrops crops = item.harvestCrops();
            if(crops!=null){
                cropsList.add(crops);
            }
        }
        return cropsList;
    }
}
