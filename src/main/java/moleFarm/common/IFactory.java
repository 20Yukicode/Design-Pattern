package moleFarm.common;

import moleFarm.common.other.MyException;
import moleFarm.common.product.AbstractCrops;
import moleFarm.common.product.AbstractFarmTool;
import moleFarm.common.product.AbstractFertilizer;
import moleFarm.common.product.AbstractSeed;

import java.lang.reflect.InvocationTargetException;

/**
 * 抽象农场工厂
 */
public interface IFactory {
    String path = "moleFarm.concrete.";

    /**
     * 生产作物
     *
     * @return
     */
    AbstractCrops createCrops(String name) throws MyException;

    /**
     * 产生种子
     *
     * @return
     */
    AbstractSeed createSeed(String name) throws MyException;

    /**
     * 产生肥料
     *
     * @return
     */
    AbstractFertilizer createFertilier(String name) throws MyException;

    /**
     * 生产工具
     *
     * @return
     */
    AbstractFarmTool createFarmTool(String name) throws MyException;

    /**
     * 根据工厂名字生成对应具体工厂，这里具体工厂一定要和concreteFactory放在一个包下面
     * @param factoryName
     * @param <T>
     * @return
     */
    static <T extends IFactory> T newConcreteFactory(String factoryName) throws MyException {
        T iFactory = null;
        try {
            Class<T> aClass = (Class<T>) Class.forName(path + factoryName);
            try {
                iFactory = aClass.getConstructor().newInstance();
            } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
                e.printStackTrace();
            }
        } catch (ClassNotFoundException e) {
            throw new MyException("对应的工厂尚未加入摩尔庄园，敬请期待......");
        }
        return iFactory;
    }
}
