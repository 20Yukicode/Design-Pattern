package moleFarm.concrete.factory;

import moleFarm.common.exception.MyException;
import moleFarm.common.farmabstract.useless.IMole;

import java.lang.reflect.InvocationTargetException;

public interface Factory {
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
