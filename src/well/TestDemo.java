package well;

class TestDemo {
  public static void main(String[] args) {
    // comment -> ok/error
    Person fakeCompSciStudent = new CompSciStudent();
    Student compSciStudent = new CompSciStudent();
    Student businessStudent = new BusinessStudent();

//    CompSciStudent finalYearStudent = new Student();
    // comment the output
//    finalYearStudent.printGreetingMessage();

    System.out.println(fakeCompSciStudent.getName());

//    compSciStudent.printGreetingMessage();
//
//    businessStudent.printGreetingMessage();
//
//    compSciStudent.printClass();
//
//    businessStudent.printClass();

//    businessStudent.printClass("BusinessStudent");

  }
}



















