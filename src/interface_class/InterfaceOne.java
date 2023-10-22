package interface_class;

public interface InterfaceOne {
  static void printMyFutureStatusStatic() {
    System.out.println("I am rich by static InterfaceOne");
  }

  void myName(String i);

  default void printMyFutureStatusDefault() {
    System.out.println("I am rich by default InterfaceOne");
  }

  default void overrideTest(String method) {
    System.out.println("overrideTest");
  }

  default void overrideTestFromSuper() {
    System.out.println("interfaceOne.overrideTestFromSuper()");
  }
}
