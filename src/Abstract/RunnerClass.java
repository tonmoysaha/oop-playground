package Abstract;

public class RunnerClass {
  public static void main(String[] args) {
    createInstanceOfAbstract();
    createInstanceOfAbstractTwo();
  }

  /**
   * An anonymous inner class is a class that is defined without a name,
   * and is instantiated directly within another class or method. Anonymous inner classes
   * are often used to implement callbacks or listeners, or to provide concrete implementations
   * of abstract classes.In the code you provided, the anonymous inner class extends the abstract
   * class AbsTractClass. It overrides the two abstract methods in AbsTractClass,
   * equals() and count(). This means that the anonymous inner class provides a concrete
   * implementation of AbsTractClass.
   */
  private static void createInstanceOfAbstractTwo() {
    AbsTractClassTwo absTractClassTwo = new AbsTractClassTwo() {
      @Override
      public String equalsTwo() {
        return super.equalsTwo();
      }
    };
    System.out.println(absTractClassTwo.equalsTwo());
  }

  /**
   * An anonymous inner class is a class that is defined without a name,
   * and is instantiated directly within another class or method. Anonymous inner classes
   * are often used to implement callbacks or listeners, or to provide concrete implementations
   * of abstract classes.In the code you provided, the anonymous inner class extends the abstract
   * class AbsTractClass. It overrides the two abstract methods in AbsTractClass,
   * equals() and count(). This means that the anonymous inner class provides a concrete
   * implementation of AbsTractClass.
   */
  private static void createInstanceOfAbstract() {
    AbsTractClass absTractClass = new AbsTractClass() {
      @Override
      public String equals() {
        return "i am from main";
      }

      @Override
      public Integer count() {
        return 4;
      }
    };
    System.out.println(absTractClass.equals());
    System.out.println(absTractClass.count());
  }
}
