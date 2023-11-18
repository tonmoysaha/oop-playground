package method_overload;

public class MethodOverload {

  public String get() {
    return "get1";
  }

  public String get(int i) {
    return "get1" + i;
  }

  public String get(int i, String test) {
    return "get1" + i + test;
  }
}
