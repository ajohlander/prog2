public class SyntaxException extends RuntimeException {
   
  public SyntaxException(String msg) {
    super(msg);
	System.out.print("**** Syntax Error: ");
  }
  
}
