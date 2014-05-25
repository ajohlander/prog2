import java.util.Map;

public class Differentiation

  extends Binary
  {
  
  
  public Differentiation(Sexpr left, Sexpr right) {
    super(left, right);
	if(left.isQuot())
		  System.out.println("Whoo!");
	  
  }
  
  public String getName() {
    return "'";
  }
  
  public int priority() {
    return 100;
  }
  
  public Sexpr eval(Map<String,Sexpr> map) {
	  return Symbolic.diff(left, right); 
  }
}