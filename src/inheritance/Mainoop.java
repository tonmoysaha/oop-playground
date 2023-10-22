package inheritance;

public class Mainoop {
  public static void main(String[] args) {
    /**
     * parent reference can hold child object.
     * but child reference can not hold parent object.(Child child = new Parent())
     *
     */
    Parent parent = new Child();
    System.out.println(parent.getName());
    System.out.println(parent.getName8());


  }
}
