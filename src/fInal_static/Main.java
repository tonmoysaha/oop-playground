package fInal_static;

public class Main {
  /**
   * Class can not be declared as static.
   * WE can call a static method in nonstatic method.
   * we can not call a non static method in static method (
   * public static void checkStatic() {
   * this.checkNormal();
   * System.out.println("checkStatic");
   * }
   * We can create object of final class but can not be extended.
   * Final variable can be initialized by only constructor and setter not supported
   */
  public static void main(String[] args) {
    ChildClass parentClass = new ChildClass("Final input from new");
    System.out.println(parentClass.finalVar);
    System.out.println(parentClass.finalVarNonInitialized);

    FinalClass finalClass = new FinalClass();
    finalClass.setName("final class variable opi");
    System.out.println(finalClass.getName());

    parentClass.checkNormal();
  }
}
