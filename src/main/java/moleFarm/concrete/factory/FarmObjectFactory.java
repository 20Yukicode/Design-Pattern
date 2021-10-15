package moleFarm.concrete.factory;

import moleFarm.myjson.FarmType;
import moleFarm.myjson.JsonOp;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

public  abstract class  FarmObjectFactory {
    final static String finalPath = "moleFarm.concrete.";
    static <T> T createFarmObject(FarmType farmType, String name) throws ClassNotFoundException {
        T farmAbstractObj = newObject(farmType.getText(), name);
        List<String> list = JsonOp.searchJson(farmType);
        return farmAbstractObj;
    }
    /**
     * 根据类的名字生成对应的
     *
     * @param name
     * @param <T>
     * @return
     * @throws ClassNotFoundException
     */
    static <T> T newObject(String text, String name) throws ClassNotFoundException {
        String path = finalPath + text + "." + name;
        T abstractObject = null;
        try {
            Class<T> aClass = (Class<T>) Class.forName(path);
            abstractObject = aClass.getConstructor().newInstance();
        } catch (InstantiationException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            e.printStackTrace();
        }
        return abstractObject;
    }

}
