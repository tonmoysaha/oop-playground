package fInal_static;

public class ChildClass extends ParentClass {

  public ChildClass(String finalVarNonInitialized) {
    super(finalVarNonInitialized);
  }

  public static void checkStatic() {
    System.out.println("checkStatic");
  }

  public void checkNormal() {
    checkStatic();
    System.out.println("checkNormal");
  }
}
