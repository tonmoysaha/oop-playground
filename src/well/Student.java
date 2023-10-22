package well;

abstract class Student implements Person {
  public void printGreetingMessage() {
    System.out.println("Hello " + getName());
  }

  public void printClass() {
    System.out.println("Person");
  }
}