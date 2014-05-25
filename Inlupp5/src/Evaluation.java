/**
 * Represents the quotation operation
 */
import java.util.Map;

public class Evaluation
extends Operator
{
	public Evaluation(Sexpr operand) {
		super(operand);
	}

	public String getName() {
		return "&";
	}

	public Sexpr eval(Map<String, Sexpr> map) {
		return operand;
	}
	public Sexpr diff(Sexpr x) {
		return Symbolic.diff(operand,x);
	}
	
}