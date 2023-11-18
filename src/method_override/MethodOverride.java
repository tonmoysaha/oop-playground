package method_override;

public class MethodOverride {

  public String getPublic() {
    return "public";
  }

  private String getPrivate() {
    return "private";
  }

  protected String getProtected() {
    return "change Scope";
  }
}
