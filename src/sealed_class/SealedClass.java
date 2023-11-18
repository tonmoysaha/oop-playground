package sealed_class;

public sealed  class SealedClass permits AcessSealed, SealedClass2 {

  protected String finalizeData() {
    return "i am sealed Class";
  }
}
