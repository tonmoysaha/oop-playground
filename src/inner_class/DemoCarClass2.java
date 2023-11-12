package inner_class;

public class DemoCarClass2 {

 private String name;
 private Details details;


  public DemoCarClass2(String name) {
    this.name = name;
    this.details = new Details("inner bind", "sasa", 8);
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
    return "DemoCarClass2{" +
        "name='" + name + '\'' +
        ", details=" + details +
        '}';
  }
}
