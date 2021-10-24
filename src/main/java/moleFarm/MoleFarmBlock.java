package moleFarm;

import moleFarm.common.product.AbstractCrops;
import moleFarm.common.product.AbstractSeed;
import moleFarm.common.status.FarmBlockStatus;
import moleFarm.common.status.Shape;

import java.util.List;

public class MoleFarmBlock implements IFarmBlock {
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

    public List<FarmBlockStatus> getStatusList() {
        return statusList;
    }

    public Shape getShape() {
        return shape;
    }

    public Double getArea() {
        return area;
    }

    public AbstractSeed getSeed() {
        return seed;
    }

    public AbstractCrops getCrops() {
        return crops;
    }
    /**
     * 松土
     */
    public void loosenSoil(){}
    /**
     * 除草
     * @return
     */
    public boolean weed(){
        return false;
    }
    /**
     * 浇水
     * @return
     */
    public boolean watering(){
        return false;
    }
    /**
     * 施肥
     * @return
     */
    public boolean applyFertilizer(){
        return false;
    }
    /**
     * 除虫
     * @return
     */
    public boolean disinsection(){
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
        System.out.println("作物："+seed.getName());
        System.out.println("状态：");
        for (FarmBlockStatus farmBlockStatus : statusList) {
            System.out.println(farmBlockStatus + " ");
        }
        //生长周期待定
    }
}
