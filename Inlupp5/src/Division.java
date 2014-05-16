/** 
 * Represents a division operation
 */
import java.util.Map;

public class Division
extends Binary
{
	public Division(Sexpr left, Sexpr right) {
		super(left, right);
	}

	public String getName() {
		return "/";
	}

	public int priority() {
		return 30;
	}

	public Sexpr eval(Map<String, Sexpr>map) {
		return Symbolic.div(left.eval(map), right.eval(map));
	}
	
	public Sexpr diff(Sexpr x) {
		System.out.println("Returning diff of division");
		return Symbolic.div(Symbolic.sub(Symbolic.mul(Symbolic.diff(left,x),right),Symbolic.mul(left, Symbolic.diff(right,x))), Symbolic.mul(right,right));
	}
}