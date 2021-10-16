package moleFarm.concrete.factory;

import moleFarm.common.other.MyException;
import moleFarm.common.farmabstract.AbstractCrops;

/**
 * 作物的抽象工厂类，此处不再写具体工厂类，如CabbageFactory；因为抽象工厂类利用
 * 反射机制，可以根据name来生成对应的具体作物
 */
public class AbstractCropsFactory implements Factory{
    final static String PATH="moleFarm.concrete.crops.";
    final static String MSG="没有该作物销售噢";
    private static AbstractCropsFactory abstractCropsFactory;
    /**
     * 单例模式
     * @return
     */
    public static AbstractCropsFactory newInstance() {
        if(abstractCropsFactory ==null){
            abstractCropsFactory =new AbstractCropsFactory();
        }
        return abstractCropsFactory;
    }
    /**
     * 根据作物的名字生产对应的作物
     * @param name
     * @return
     * @throws MyException
     */
    public AbstractCrops create(String name) throws MyException {
        AbstractCrops abstractCrops = Factory.create(MSG, PATH+name);
        return abstractCrops;
    }
}
