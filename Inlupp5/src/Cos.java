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

	public int priority() {
		return 40;
	}

	public Sexpr eval(Map<String, Sexpr>map) {
		return Symbolic.cos(operand.eval(map));
	}
	
	public Sexpr diff(Sexpr x) {
		return Symbolic.mul(new Constant(-1),Symbolic.sin(operand));
	}
}