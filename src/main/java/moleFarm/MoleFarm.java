package moleFarm;

import moleFarm.common.product.AbstractCrops;
import moleFarm.common.product.AbstractSeed;
import moleFarm.common.status.Shape;
import moleFarm.common.utils.MyException;
import moleFarm.pattern.iterator.conc.FarmIterator;

import java.util.ArrayList;
import java.util.List;

/**
 * 摩尔个人农场
 * implements IFarm
 */
public class MoleFarm implements IFarm {
    /**
     * 农田块数量
     */
    private Integer farmBlockCount = 9;
    /**
     * 形状
     */
    private Shape shape = Shape.CIRCULAR;
    /**
     * 面积
     */
    private Integer area = 1;
    /**
     * 农田块列表
     */
    private List<MoleFarmBlock> farmBlockList;

    private static volatile MoleFarm moleFarm = new MoleFarm();

    public static synchronized MoleFarm newInstance() {
        return moleFarm;
    }

    private MoleFarm() {
        farmBlockList = new ArrayList<>();
        for (int i = 0; i < farmBlockCount; ++i) {
            farmBlockList.add(new MoleFarmBlock());
        }
    }

    /**
     * 迭代器
     *
     * @return
     */
    public FarmIterator getIterator() {
        return (new FarmIterator(farmBlockList));
    }

    /**
     * 种下种子
     * 批量操作
     * @param seed
     * @throws MyException
     */
    @Override
    public void plantBatchSeeds(AbstractSeed seed) {
        //寻找空地，一键播种
        for (MoleFarmBlock item : farmBlockList) {
            if(item.getSeed()!=null){
                item.plantSeed(seed);
            }
        }
        System.out.println("所有空地均已播种成功");
//        if (seedList.size() > farmBlockList.size())
//            throw new MyException("作物数量太多，无法种植");
    }

    @Override
    public void plantSeeds(AbstractSeed seed) {
        
    }

    /**
     * 收获作物
     * 批量操作
     * @return
     */
    @Override
    public List<AbstractCrops> harvestCrops() {
        List<AbstractCrops> cropsList = null;
        for (MoleFarmBlock item : farmBlockList) {
            AbstractCrops crops = FarmGrowth.harvestCrops(item);
            if (crops != null) {
                cropsList.add(crops);
            }
        }
        return cropsList;
    }

    /**
     * 展示农场
     */
    public void showFarm() {
        System.out.println("农田状态如下：");
        for (int i = 0; i < farmBlockList.size(); i += 3) {
            System.out.print(farmBlockList.get(i).getSeed() == null ? "┏━┓" : "┎┰┒");
            System.out.print(farmBlockList.get(i + 1).getSeed() == null ? "┏━┓" : "┎┰┒");
            System.out.print(farmBlockList.get(i + 2).getSeed() == null ? "┏━┓" : "┎┰┒");
            System.out.println("");
            System.out.print(farmBlockList.get(i).getSeed() == null ? "┗━┛" : "┖┸┚");
            System.out.print(farmBlockList.get(i).getSeed() == null ? "┗━┛" : "┖┸┚");
            System.out.print(farmBlockList.get(i).getSeed() == null ? "┗━┛" : "┖┸┚");
            System.out.println(i == 0 ? "①~③" : i == 4 ? "④~⑥" : "⑦~⑨");
        }
    }
}
