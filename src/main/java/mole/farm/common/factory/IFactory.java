package mole.farm.common.factory;

import mole.farm.common.farmabstract.AbstractCrops;
import mole.farm.common.farmabstract.AbstractFarmTool;
import mole.farm.common.farmabstract.AbstractFertilizer;
import mole.farm.common.farmabstract.AbstractSeed;

import java.lang.reflect.InvocationTargetException;

/**
 * 抽象农场工厂
 */
public interface IFactory {
    /**
     * 生产作物
     * @return
     */
    AbstractCrops createCrops();
    /**
     * 产生种子
     * @return
     */
    AbstractSeed createSeed();
    /**
     * 产生肥料
     * @return
     */
    AbstractFertilizer createFertilier();
    /**
     * 生产工具
     * @return
     */
    AbstractFarmTool createFarmTool();
    /**
     *根据工厂名字生成对应具体工厂
     * @param factoryName
     * @return
     * @throws ClassNotFoundException
     */
    static IFactory newFactoryByName(String factoryName) throws ClassNotFoundException {
        Class<IFactory> aClass = (Class<IFactory>) Class.forName(factoryName);
        IFactory iFactory =null;
        try {
           iFactory = aClass.getConstructor().newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        return iFactory;
    }
}
