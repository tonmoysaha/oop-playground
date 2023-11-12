package final_class_variable;

public class Main {
  public static void main(String[] args) {
/**
 * We can create object of final class but can not be extended.
 * Final variable can be initialized by only constructor and setter not supported
 * Final method can not be overridden.
 */
    FinalClass finalClass = new FinalClass("finalClass");
    finalClass.setName("final class variable opi");
    System.out.println(finalClass.getName());
    System.out.println(finalClass.getFinalVariable());
    System.out.println(finalClass.finalMethod());

    ExtendFinalMethod extendFinalMethod = new ExtendFinalMethod();
    System.out.println(extendFinalMethod.finaal);
  }
}
