package inner_class;

public class Main {

  public static void main(String[] args) {
    /**
     * Inner classes can be used to logically group classes that are only used in one place.
     * This can help improve the organization and readability of your code.
     *
     * This can be beneficial when a class is only used in the context of another class and
     * doesn't make sense on its own.
     */
    DemoCarClass demoCarClass = new DemoCarClass("lklk;");
    DemoCarClass.Details details =  demoCarClass.new Details("lasd ", ",,,,", 9);
    System.out.println(details);

    DemoCarClass2 demoCarClass2 = new DemoCarClass2("inner bind;");
    System.out.println(demoCarClass2);


    StaticDemoCarClass staticDemoCarClass = new StaticDemoCarClass("inner bind;");
    StaticDemoCarClass.Details details1 = new StaticDemoCarClass.Details("lasd ", ",,,,", 9);
    System.out.println(staticDemoCarClass);
    System.out.println(details1);
    System.out.println(StaticDemoCarClass.Details.getYear());

  }
}
