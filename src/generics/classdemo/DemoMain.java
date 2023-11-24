package generics.classdemo;
public class DemoMain {
  public static void main(String[] args) throws IllegalAccessException, InstantiationException {
    GeneriClass aClass = new GeneriClass();
    ParentDto pa = aClass.getObject(ParentDto.class, "tonmoy", "saha");
    System.out.println(pa);

    ChildDto object = aClass.getObject(ChildDto.class, "tonmoy", "saha");

  }
}

