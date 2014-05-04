public class EvaluationException extends RuntimeException {
   
  public EvaluationException(String msg) {
    super(msg);
	System.out.print("**** Evaluation Error: ");
  }
  
}
