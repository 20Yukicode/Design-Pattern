package moleFarm.common.factory;

import moleFarm.common.other.MyException;
import moleFarm.common.product.useless.IMole;

import java.lang.reflect.InvocationTargetException;

public interface Factory {
   /**
    * 所有抽象工厂要继承这个接口，并且重写这个方法
    * @param name
    * @return
    * @throws MyException
    */
   IMole create(String name) throws MyException;
   static<T extends IMole> T create(String message, String name) throws MyException {
      T abstractobj = null;
      try {
         Class<T> aClass = (Class<T>) Class.forName(name);
         try {
            abstractobj =  aClass.getConstructor().newInstance();
         } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
            e.printStackTrace();
         }
      } catch (ClassNotFoundException e) {
         throw new MyException(message);
      }
      return abstractobj;
   }
}
