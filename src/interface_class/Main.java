package interface_class;

public class Main {
  public static void main(String[] args) {
    /**
     * 1. Same abstract method in two interface can be override once.
     * 2.Same default method in two interface can be overridden for provide a common implementation
     * or call specific one via super
     * 3.Same static method in two interface allowed. But they can not be overridden.
     */
    //common method
    InterfaceOne interfaceOne = new ExtendInterface();
    interfaceOne.myName("interfaceOne.myName()");

    InterfaceTwo interfaceTwo = new ExtendInterface();
    interfaceTwo.myName("interfaceTwo.myName()");

    //static default
    InterfaceOne.printMyFutureStatusStatic();
    interfaceOne.printMyFutureStatusDefault();
    interfaceOne.overrideTest("interfaceOne.overrideTest()");
    interfaceOne.overrideTestFromSuper();

    InterfaceTwo.printMyFutureStatusStatic();
    interfaceTwo.overrideTest("interfaceTwo.overrideTest()");
    interfaceTwo.overrideTestFromSuper();
  }
}
