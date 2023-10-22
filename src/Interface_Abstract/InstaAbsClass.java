package Interface_Abstract;

public class InstaAbsClass extends AbsTractClass implements One, Two {
  @Override
  public Integer count(int i) {
    return i;
  }

  @Override
  public void print() {
    System.out.println("parent: AbsTractClass, One, Two");
  }
}
