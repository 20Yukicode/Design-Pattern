package moleFarm;

import moleFarm.common.product.AbstractCrops;
import moleFarm.common.product.AbstractSeed;
import moleFarm.common.status.FarmBlockStatus;
import moleFarm.common.status.SeedStatus;
import moleFarm.common.status.Shape;

import java.util.ArrayList;
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
    private List<FarmBlockStatus> statusList=new ArrayList<>();

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
        String seedInfo = seed==null?"抱歉，该农田块上暂未种植作物" : ("作物"+seed.getName());
        String statusInfo = "状态：";
        String growthInfo = "生长周期：";
        if(statusList==null||statusList.size()==0)statusInfo="状态：正常";
        else{
            for(FarmBlockStatus i : statusList){
                statusInfo+=i.getText()+"\t";
            }
        }
        if(seed!=null&&seedStatus!=null)growthInfo+= SeedStatus.getSeedStatusByNum(seedStatus).getText()+"期" ;
        System.out.println(seedInfo);
        System.out.println(statusInfo);
        System.out.println(growthInfo);
    }
}
