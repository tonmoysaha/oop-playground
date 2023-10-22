package well;

interface Person {
  default String getName() {
    return "Humane";
  }
}
