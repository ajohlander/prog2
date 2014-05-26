/** 
 * Represents a sin operation
 */
import java.util.Map;

public class Cos
extends Function
{
	public Cos(Sexpr operand) {
		super(operand);
	}

	public String getName() {
		return "cos";
	}

	public Sexpr eval(Map<String, Sexpr>map) {
		return Symbolic.cos(operand.eval(map));
	}
	
	public Sexpr diff(Sexpr x) {
		return Symbolic.mul(Symbolic.mul(new Constant(-1),Symbolic.sin(operand)),Symbolic.diff(operand,x));
	}
}