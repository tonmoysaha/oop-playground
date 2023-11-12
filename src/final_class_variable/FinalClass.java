package final_class_variable;

public final class FinalClass {
  private String name;

  private final String finalVariable;

  public FinalClass(String finalVariable) {
    this.finalVariable = finalVariable;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getFinalVariable() {
    return finalVariable;
  }

  public final String finalMethod() {
    return "finalMethod";
  }
}
