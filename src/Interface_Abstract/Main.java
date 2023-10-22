package Interface_Abstract;

public class Main {
  public static void main(String[] args) {
    /**
     * Same method in abstract class, interface allowed.
     * Then there will one override if we extend abstract class and implement interface
     */
    AbsTractClass absTractClass = new InstaAbsClass();
    System.out.println(absTractClass.count(1));

    One one = new InstaAbsClass();
    System.out.println(one.count(2));

    Two two = new InstaAbsClass();
    System.out.println(two.count(3));

    absTractClass.print();
    one.print();
    two.print();

    /**
     * if same method with body in interface and abstract
     * class then all output are same from abstract class
     * fromAbstract
     * fromAbstract
     * fromAbstract
     */
    absTractClass.from();
    one.from();
    two.from();
  }
}
