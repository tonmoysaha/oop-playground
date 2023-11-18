package sealed_class;

public class Main {
  /**
   * A seacled class can extend another sealed class if its in permit.
   * sub class of sealed class should be declare as final.
   * which makes it secure for other extensibility without permit or
   * we can declare as non-sealed which can be extensible without permits.
   *
   * For extending a sealed class child must be declare in permits
   */
  public static void main(String[] args) {
    ExtendSraledSubClass extendSraledSubClass = new ExtendSraledSubClass();
    System.out.println(extendSraledSubClass.finalizeData());

    DataWar dataWar = new DataWar();
    System.out.println(dataWar.dataWar());
    System.out.println(dataWar.finalizeData());
  }
}
