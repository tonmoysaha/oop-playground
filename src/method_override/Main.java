package method_override;

public class Main {
  public static void main(String[] args) {
    /**
     * Private method can not be overridden.
     *
     * we allowed to declare higher method scope in child class for
     * parent class method scope when overridden.
     * not allowed to declare lower method scope then higher method scope
     *
     *
     */
    ExtenderOverride extenderOverride = new ExtenderOverride();
    System.out.println(extenderOverride.getPublic());
    System.out.println(extenderOverride.getProtected());
  }
}
