package moleFarm.common.factory;

import moleFarm.common.product.useless.IMole;
import moleFarm.other.MyException;

import java.lang.reflect.InvocationTargetException;

public interface Factory {
   /**
    * 所有抽象工厂要继承这个接口，并且重写这个方法
    * @param name
    * @return
    * @throws MyException
    */
   Object create(String name) throws MyException;
   static<T extends IMole> T createProduct(String message, String name) throws MyException {
      T abstractObj = null;
      try {
         Class<T> aClass = (Class<T>) Class.forName(name);
         try {
            abstractObj =  aClass.getConstructor().newInstance();
         } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
            e.printStackTrace();
         }
      } catch (ClassNotFoundException e) {
         throw new MyException(message);
      }
      return abstractObj;
   }

   /**
    * 此方法不要使用！！！！
    * @param message
    * @param tClass
    * @param <T>
    * @return
    * @throws MyException
    */
   static <T> T createProduct(String message,Class<T>tClass) throws MyException{
      T abstractObj=null;
      try {
         abstractObj = tClass.getConstructor().newInstance();
      } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
         throw new MyException(message);
      }
      return abstractObj;
   }
}
