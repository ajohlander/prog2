/**
 * Methods for symbolic arithmetic.
 */
public class Symbolic {

	/**
	 * Perform a symbolic/numeric addition
	 * Note: The method should be elaborated to handle
	 * handle several special cases (e.g addititon of zero)
	 */
	public static Sexpr add(Sexpr left, Sexpr right) {
		if (left.isConstant() && right.isConstant())
			return new Constant(left.getValue() + right.getValue());
		else
			return new Addition(left, right);
	}

	public static Sexpr sub(Sexpr left, Sexpr right){

		if (left.getName()==right.getName()){
			return new Constant(0);
		}
		else if (left.isConstant() && right.isConstant()){
			return new Constant(left.getValue() - right.getValue());
		}else
			return new Subtraction(left, right);
	}

	/**
	 * Perform a symbolic/numeric multiplication
	 * Note: The method should be elaborated to handle several
	 * special cases (e.g multiplication with zero or one)
	 */
	public static Sexpr mul(Sexpr left, Sexpr right) {
		if(left.isConstant(0) || right.isConstant(0))
			return new Constant(0);
		else if (left.isConstant(1))
			return right;
		else if (right.isConstant(1))
			return left;
		else if (left.isConstant() && right.isConstant())
			return new Constant(left.getValue() * right.getValue());
		else
			return new Multiplication(left, right);
	}
	
	public static Sexpr div(Sexpr left, Sexpr right){
		if (left.isConstant() && right.isConstant())
			return new Constant(left.getValue() / right.getValue());
		else
			return new Division(left, right);
		}

	public static Sexpr sin(Sexpr x){
		if(x.isConstant())
			return new Constant(Math.sin(x.getValue()));
		else return new Sin(x);
		}
	
	public static Sexpr cos(Sexpr x){
		if(x.isConstant())
			return new Constant(Math.cos(x.getValue()));
		else return new Cos(x);
		}
	
	public static Sexpr exp(Sexpr x){
		if(x.isConstant())
			return new Constant(Math.exp(x.getValue()));
		else return new Exp(x);
		}
	
	
	public static Sexpr diff(Sexpr left, Sexpr right){
		/* if (left.isConstant()){
	    	System.out.println("hello");
	        return new Constant(0);
	    }else if(left == right){
	    	return new Constant(1);
		 */


		/*
		if(left.isConstant()){
			System.out.println("hello");
			return new Constant(left.diff(right).getValue());
		}else if(left.isVariable()){
			System.out.println("mondaykid");
			return new Variable(left.diff(right).getName());
		}else if(left.isMult()){
			return new Multiplication(left.diff(right),new Constant(1));
		}else{*/

		System.out.println("mondaykid");
		return left.diff(right);
		//new Differentiation(left, right);
	}


	/**
	 * Perform a symbolic/numeric negation
	 */  
	public static Sexpr negate(Sexpr operand) {
		if (operand.isConstant())
			return new Constant(-operand.getValue());
		else
			return new Negation(operand);
	}

}