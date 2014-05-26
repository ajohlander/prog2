/**
 * Represents a variable
 */
import java.util.Map;

public class Variable
extends Atom
{
	private String name;

	public Variable(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public Sexpr eval(Map<String,Sexpr>map) {
		if (map.containsKey(name)) {
			return map.get(name);
		} else {
			throw new EvaluationException("Undefined varible: " + name);
		}
	}

	public Sexpr diff(Sexpr x){
		//System.out.println("Returning diff of Variable");
		//System.out.println("this.name: "+ this.name + "\t x.getName(): "+ x.getName());
		if( this.name.equals(x.getName()) ){
			return new Constant(1);
		}else if (x.isConstant()){
			return x;
		}else
			return new Constant(0);
	}
	
	public boolean isVariable(){
		return true;
	}
}
