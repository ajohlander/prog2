/**
 * Base class for all binary operators
 */
public abstract class Binary 
extends Sexpr
{
	protected Sexpr left;
	protected Sexpr right;

	public Binary(Sexpr left, Sexpr right) {
		this.left = left;
		this.right = right;
	}

	/* 
	 * The toString-method should be refined so that parentheses are used only when needed
	 */
	public String toString() {
		/*System.out.println("priority()" + priority());
		System.out.println("left.priority()" + left.priority());
		System.out.println("right.priority()" + right.priority());
		*/
		
		
		if(left.priority()==right.priority()){
			if(left.priority()<priority())
				return "(" + left + ")" + getName() + "(" + right + ")"; 
			else //if (left.priority()>priority())
				return left + getName() + right;
			
		}else if (left.priority()<right.priority()){
			if (priority()<=left.priority())
				return left + getName() + right;
			else
				return "(" + left + ")" + getName() + right;
		}else if (left.priority()>=right.priority()){
			if (priority()<right.priority())
				return left + getName() + right;
			else
				return left + getName() + "(" + right + ")";
		}
		else
			return left + getName() + right;
	}
}
		
		
		
		
		
		
		
		

		/*if(left.priority()==100 && right.priority()==100)
			return left + getName() + right;
		else if(left.priority() == right.priority())
			return "(" + left + ")" + getName() + "(" + right + ")"; 
		else if (left.priority()==100)
			return left + getName() + right;
		else if (right.priority()==100)
			return "(" + left + ")" + getName() + right;
		else if(left.priority()<priority())
			return "(" + left + ")" + getName() + right;
		else if(left.priority()>priority()+5)
			return left + getName() + "(" + right + ")";

		else
			return "(" + left + ")" + getName() + "(" + right + ")"; 


	if (left.priority()==priority())
		  return "(" + left + ")" + getName() + "(" +right + ")"; 
	  else if (priority()<25)
		  return left + getName() + right;

	  else if (left.priority()<priority())
		  return "(" + left + ")" + getName() + right; 
	  else if (left.priority()>priority())
		  return left + getName() + "(" + right + ")"; 
	  else
		  return "(" + left + ")" + getName() + "(" + right + ")"; 
		 */

