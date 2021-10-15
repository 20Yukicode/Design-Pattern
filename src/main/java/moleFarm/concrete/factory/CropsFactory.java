package moleFarm.concrete.factory;

import moleFarm.common.exception.MyException;
import moleFarm.common.farmabstract.AbstractCrops;

public class CropsFactory implements Factory{
    final static String path="moleFarm.concrete.crops.";
    final static String msg="没有该作物销售噢";
    CropsFactory cropsFactory;
    /**
     * 单例模式
     * @return
     */
    @Override
    public Factory newInstance() {
        if(cropsFactory==null){
            cropsFactory=new CropsFactory();
        }
        return cropsFactory;
    }
    /**
     * 根据作物的名字生产对应的种子
     * @param name
     * @return
     * @throws MyException
     */
    public static AbstractCrops createCrops(String name) throws MyException {
        AbstractCrops abstractCrops = Factory.create(msg, path+name);
        return abstractCrops;
    }
}
