package Interface_Abstract;

public interface One {
  Integer count(int i);

  default void print() {
    System.out.println("One");
  }

  default void from() {
    System.out.println("fromOne");
  }
}
