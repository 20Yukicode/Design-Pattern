package moleFarm;

import moleFarm.common.product.AbstractCrops;
import moleFarm.common.product.AbstractSeed;
import moleFarm.common.status.FarmBlockStatus;
import moleFarm.common.status.SeedStatus;
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
     * 种子状态
     * 这里调用 SeedStatus.getSeedStatusByNum(int number)
     * 获取农田状态
     */
    private Integer seedStatus;
    /**
     * 农田块状态列表
     */
    private List<FarmBlockStatus> statusList;

    public Shape getShape() {
        return shape;
    }

    public Double getArea() {
        return area;
    }
    public AbstractSeed getSeed() {
       return seed;
    }

    public void setSeed(AbstractSeed seed) {
        this.seed = seed;
    }

    public Integer getSeedStatus() {
        return seedStatus;
    }

    public void setSeedStatus(Integer seedStatus) {
        this.seedStatus = seedStatus;
    }

    public List<FarmBlockStatus> getStatusList() {
        return statusList;
    }

    public void setStatusList(List<FarmBlockStatus> statusList) {
        this.statusList = statusList;
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
