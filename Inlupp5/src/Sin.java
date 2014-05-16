/** 
 * Represents a sin operation
 */
import java.util.Map;

public class Sin
extends Function
{
	public Sin(Sexpr operand) {
		super(operand);
	}

	public String getName() {
		return "sin";
	}

	public int priority() {
		return 40;
	}

	public Sexpr eval(Map<String, Sexpr>map) {
		return Symbolic.sin(operand.eval(map));
	}
	
	public Sexpr diff(Sexpr x) {
		return Symbolic.cos(operand);
	}
}