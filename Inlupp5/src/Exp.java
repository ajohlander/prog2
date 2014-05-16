/** 
 * Represents a sin operation
 */
import java.util.Map;

public class Exp
extends Function
{
	public Exp(Sexpr operand) {
		super(operand);
	}

	public String getName() {
		return "exp";
	}

	public int priority() {
		return 40;
	}

	public Sexpr eval(Map<String, Sexpr>map) {
		return Symbolic.exp(operand.eval(map));
	}
	
	public Sexpr diff(Sexpr x) {
		return Symbolic.mul(Symbolic.diff(operand,x),Symbolic.exp(operand));
	}
}