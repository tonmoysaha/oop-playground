package generics.classdemo;
public class DemoMain {
  public static void main(String[] args) throws IllegalAccessException, InstantiationException {
    GeneriClass aClass = new GeneriClass();
    ParentDto pa = aClass.getObject(ParentDto.class, "tonmoy", "saha");
    System.out.println(pa);

    ChildClass object = aClass.getObject(ChildClass.class, "tonmoy", "saha");

  }
}

