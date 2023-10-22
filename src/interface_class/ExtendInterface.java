package interface_class;

public class ExtendInterface implements InterfaceOne, InterfaceTwo {
  @Override
  public void myName(String i) {
    System.out.println(i);
  }

  @Override
  public void overrideTest(String m) {
    System.out.println(m);
  }

  @Override
  public void overrideTestFromSuper() {
    InterfaceOne.super.overrideTestFromSuper();
  }

}
