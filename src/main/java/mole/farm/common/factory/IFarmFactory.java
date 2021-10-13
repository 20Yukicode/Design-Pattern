package mole.farm.common.factory;

import mole.farm.common.farmabstract.AbstractFarmTool;
import mole.farm.common.farmabstract.AbstractFertilizer;
import mole.farm.common.farmabstract.AbstractSeed;
import mole.farm.common.farmabstract.IFarm;

import java.lang.reflect.InvocationTargetException;

/**
 * 抽象农场工厂
 */
public interface IFarmFactory {
    /**
     * 产生种子
     * @return
     */
    AbstractSeed newSeed();

    /**
     * 产生肥料
     * @return
     */
    AbstractFertilizer newFertilier();

    /**
     * 生产工具
     * @return
     */
    AbstractFarmTool newFarmTool();

    /**
     *根据工厂名字生成对应具体工厂
     * @param factoryName
     * @return
     * @throws ClassNotFoundException
     */
    default IFarmFactory newFarmFactoryByName(String factoryName) throws ClassNotFoundException {
        Class<IFarmFactory> aClass = (Class<IFarmFactory>) Class.forName(factoryName);
        IFarmFactory iFarmFactory=null;
        try {
           iFarmFactory = aClass.getConstructor().newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        return iFarmFactory;
    }
}
