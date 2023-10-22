package fInal_static;

public class ParentClass {
  public static String staticVar;
  public final String finalVar = "Final Initialized";
  public final String finalVarNonInitialized;

  public ParentClass(String finalVarNonInitialized) {
    this.finalVarNonInitialized = finalVarNonInitialized;
  }

  public static String getStaticVar() {
    return staticVar;
  }

  public static void setStaticVar(String staticVar) {
    ParentClass.staticVar = staticVar;
  }

  public String getFinalVar() {
    return finalVar;
  }

  public String getFinalVarNonInitialized() {
    return finalVarNonInitialized;
  }

}
