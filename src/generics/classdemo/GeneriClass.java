package generics.classdemo;

import java.lang.reflect.Field;

public class GeneriClass {

  public static <T extends ParentDto> T getObject(Class<? extends ParentDto> clazz,
                                                  String firstName, String lastName)
      throws IllegalAccessException, InstantiationException {
    T instance = (T) clazz.newInstance();
    instance.setFirstname(firstName);
    instance.setLastname(lastName);
    return instance;
  }

  private static <T> void setDtoValues(T dto, Object... values) throws IllegalAccessException {
    Class<?> clazz = dto.getClass();
    Field[] fields = clazz.getDeclaredFields();

    if (fields.length != values.length) {
      throw new IllegalArgumentException("Number of values does not match the number of fields in the DTO");
    }

    for (int i = 0; i < fields.length; i++) {
      fields[i].setAccessible(true);
      fields[i].set(dto, values[i]);
    }
  }
}
