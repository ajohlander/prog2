/**
 * Represents the quotation operation
 */
import java.util.Map;

public class Quotation 
extends Operator
{
	public Quotation(Sexpr operand) {
		super(operand);
	}

	public String getName() {
		return "\"";
	}

	public Sexpr eval(Map<String, Sexpr> map) {
		return operand;
	}
	public Sexpr diff(Sexpr x) {
		System.out.println("this is the diff of a quotation!");
		return Symbolic.diff(operand,x);
	}
	
	public boolean isQuot(){
		return true;
	}
}