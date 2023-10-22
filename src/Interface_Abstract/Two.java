package Interface_Abstract;

public interface Two {
  Integer count(int i);

  default void print() {
    System.out.println("Two");
  }

  default void from() {
    System.out.println("fromTwo");
  }
}
