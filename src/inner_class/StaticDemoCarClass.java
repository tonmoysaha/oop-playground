package inner_class;

public class StaticDemoCarClass {

 private String name;


  public  StaticDemoCarClass(String name) {
    this.name = name;
  }

  public static class Details {
    private String brand;
    private String model;
    private int year;

    // Constructor
    public Details(String brand, String model, int year) {
      this.brand = brand;
      this.model = model;
      this.year = year;
    }

    public static int getYear() {
      return 30;
    }

    @Override
    public String toString() {
      return "Details{" +
          "brand='" + brand + '\'' +
          ", model='" + model + '\'' +
          ", year=" + year +
          '}';
    }
  }

  @Override
  public String toString() {
    return "DemoCarClass{" +
        "name='" + name + '\'' +
        '}';
  }
}
