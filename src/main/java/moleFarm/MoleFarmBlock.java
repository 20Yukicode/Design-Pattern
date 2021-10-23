package moleFarm;

import moleFarm.common.product.AbstractCrops;
import moleFarm.common.product.AbstractSeed;
import moleFarm.common.status.FarmBlockStatus;
import moleFarm.common.status.Shape;

import java.util.List;

public class MoleFarmBlock implements IFarmBlock{
    /**
     * 形状
     */
    private final Shape shape=Shape.CIRCULAR;
    /**
     * 面积
     */
    private final Double area=1.0;
    /**
     * 种子
     */
    private AbstractSeed seed;
    /**
     * 作物
     */
    private AbstractCrops crops;
    /**
     * 农田块状态列表
     */
    private List<FarmBlockStatus> statusList;

    /**
     * 松土
     */
    void loosenSoil(){}
    /**
     * 除草
     * @return
     */
    boolean weed(){
        return false;
    }
    /**
     * 浇水
     * @return
     */
    boolean watering(){
        return false;
    }
    /**
     * 施肥
     * @return
     */
    boolean applyFertilizer(){
        return false;
    }
    /**
     * 除虫
     * @return
     */
    boolean disinsection(){
        return false;
    }

    @Override
    public void plantSeed(AbstractSeed seed) {

    }

    @Override
    public AbstractCrops harvestCrops() {
        return null;
    }

    /**
     * 获取农田块信息
     */
    public void getInfo(){
        System.out.println("作物："+crops.getName());
        System.out.println("状态：");
        for(int i=0;i<statusList.size();++i){
            System.out.println(statusList.get(i)+" ");
        }
        //生长周期待定
    }
}
