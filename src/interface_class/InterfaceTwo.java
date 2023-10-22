package interface_class;

public interface InterfaceTwo {
  static void printMyFutureStatusStatic() {
    System.out.println("6. I am rich by InterfaceTwo");
  }

  void myName(String i);

  default void overrideTest(String m) {
    System.out.println("overrideTest");
  }

  default void overrideTestFromSuper() {
    System.out.println("interfaceTwo.overrideTestFromSuper()");
  }
}
