/**
 * Parser
 * See syntax diagrams for documentation
 */
import java.util.Map;
import java.util.TreeSet;
public class Parser {

	private Stokenizer tokenizer;
	private TreeSet<String> functions;  // Names of recognized functions

	/**
	 * Constructs a parser
	 * @param tokenizer an initialized tokenizer
	 */
	public Parser(Stokenizer tokenizer) {  
		this.tokenizer = tokenizer; 
		// Create a set with the names of the recognized functions
		functions = new TreeSet<String>();
		functions.add("sin");
		functions.add("cos");
		functions.add("exp");
		functions.add("log");
	}

	/**
	 * Handles a
	 */
	public Sexpr assignment() {
		Sexpr value = expression();
		while (tokenizer.getChar() == '=') {
			tokenizer.nextToken();
			if (tokenizer.isWord()) {
				value = new Assignment(value, new Variable(tokenizer.getWord()));
				tokenizer.nextToken();
			} else {
				throw new SyntaxException("Expected variable after '='");
			}
		}

		return value;
	}

	/**
	 * Handles a sum of terms 
	 */
	public Sexpr expression() {
		Sexpr sum = term();
		int c;
		while ((c=tokenizer.getChar()) == '+' || c == '-') {
			tokenizer.nextToken();
			if (c=='+') {
				sum = new Addition(sum, term());
			}else if (c=='-') {
				//System.out.println("hej");
				sum = new Subtraction(sum, term());
			}
		}
		/*while ((c=tokenizer.getChar()) == '-') {
			tokenizer.nextToken();
			if (c=='-') {
				System.out.println("hej");
				sum = new Subtraction(sum, term());
			}
		}*/
		return sum;
	}

	/**
	 * Handles a product of factors
	 */
	public Sexpr term() {
		int c;
		Sexpr prod = factor();
		while ((c=tokenizer.getChar()) == '*' || c == '/'){
			tokenizer.nextToken();
			if (c=='*') {
				prod = new Multiplication(prod, factor());
			}else if (c=='/') {
				prod = new Division(prod, factor());
			} 
		}
		/*while ((c=tokenizer.getChar()) == '/'){
			tokenizer.nextToken();
			if (c=='/') {
				prod = new Division(prod, factor());
			} 
		}*/
		return prod;
	}

	/**
	 * Handles a differentiation:
	 * <primary>[' <variable> [' <variable> ...]]
	 */
	public Sexpr factor() {
		Sexpr value = primary();
		String s = "'";
		while (tokenizer.getChar() == s.charAt(0)) {
			tokenizer.nextToken();
			if (tokenizer.isWord()) {
				value = new Differentiation(value, new Variable(tokenizer.getWord()));
				tokenizer.nextToken();
			} else {
				throw new SyntaxException("Expected variable after '");
			}
		}

		return value;



		//return primary();
	}

	/**
	 * Handles a primary  (see syntax diagram)
	 */
	public Sexpr primary() {
		Sexpr result = null;
		if (tokenizer.getChar() == '(') {          // Parentheses
			tokenizer.nextToken(); 
			result = assignment();
			if (tokenizer.getChar() == ')') {
				tokenizer.nextToken();
			} else {
				throw new SyntaxException("Expected ')'");
			}
		} 

		// Unary minus
		else if (tokenizer.getChar() == '-') {
			tokenizer.nextToken();
			result = new Negation(primary());  
		} 
		// Quotation
		else if (tokenizer.getChar() == '"') {
			tokenizer.nextToken();
			result = new Quotation(primary());  
		} 
		else if(tokenizer.getChar() == '&') {
			tokenizer.nextToken();
			result = new Evaluation(primary()); 
		}

		else if (tokenizer.isNumber()) {           // Number
			result = new Constant(tokenizer.getNumber());
			tokenizer.nextToken();
		} 

		else if (tokenizer.isWord()) {             // Word
			String theWord = tokenizer.getWord();
			tokenizer.nextToken();
			if (functions.contains(theWord)) {           // Function?
				result = function(theWord);
			} else  {
				result = new Variable(theWord);            // Variable
			} 
		} 

		else {
			throw new SyntaxException("Expected number, word, '-', " + 
					"'\"', '&' or '('");
		}

		return result;
	}

	public Sexpr function(String functionName) {
		System.out.println(functionName);
		if(functionName.equals("sin")){
			Sexpr result = null;
			if (tokenizer.getChar() == '(') {          // Parentheses
				tokenizer.nextToken(); 
				result = assignment();
				if (tokenizer.getChar() == ')') {
					tokenizer.nextToken();
				} else {
					throw new SyntaxException("Expected ')'");
				}
			} 
			return new Sin(result);
		}else if(functionName.equals("cos")){
			Sexpr result = null;
			if (tokenizer.getChar() == '(') {          // Parentheses
				tokenizer.nextToken(); 
				result = assignment();
				if (tokenizer.getChar() == ')') {
					tokenizer.nextToken();
				} else {
					throw new SyntaxException("Expected ')'");
				}
			} 
			return new Cos(result);
		}else if(functionName.equals("exp")){
			Sexpr result = null;
			if (tokenizer.getChar() == '(') {          // Parentheses
				tokenizer.nextToken(); 
				result = assignment();
				if (tokenizer.getChar() == ')') {
					tokenizer.nextToken();
				} else {
					throw new SyntaxException("Expected ')'");
				}
			} 
			return new Exp(result);
			
		}else if(functionName.equals("log")){
			Sexpr result = null;
			if (tokenizer.getChar() == '(') {          // Parentheses
				tokenizer.nextToken(); 
				result = assignment();
				if (tokenizer.getChar() == ')') {
					tokenizer.nextToken();
				} else {
					throw new SyntaxException("Expected ')'");
				}
			} 
			return new Log(result);
		}else{

			throw 
			new EvaluationException("Handling of functions not yet implemented");    
		}

	}
}


