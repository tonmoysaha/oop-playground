package method_override;

public class ExtenderOverride extends MethodOverride{

  @Override
  public String getProtected() {
    return "Child changed to public";
  }
}
