package inner_class;

public class DemoCarClass {

 private String name;


  public DemoCarClass(String name) {
    this.name = name;
  }

  public class Details {
    private String brand;
    private String model;
    private int year;

    // Constructor
    public Details(String brand, String model, int year) {
      this.brand = brand;
      this.model = model;
      this.year = year;
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
