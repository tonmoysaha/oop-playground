package generics.classdemo;

import java.lang.reflect.Field;

public class GeneriClass {

  public static <T extends ParentDto> T getObject(Class<? extends ParentDto> clazz,
                                                  String firstName, String lastName)
      throws IllegalAccessException, InstantiationException {
    T instance = (T) clazz.newInstance();
    instance.setFirstname(firstName);
    instance.setLastname(firstName);
    return instance;
  }
}
