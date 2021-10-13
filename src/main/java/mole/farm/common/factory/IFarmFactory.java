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
    AbstractSeed newSeed();
    AbstractFertilizer newFertilier();
    AbstractFarmTool newFarmTool();
    default IFarmFactory newFarmFactoryByName(String name) throws ClassNotFoundException {
        Class<IFarmFactory> aClass = (Class<IFarmFactory>) Class.forName(name);
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
