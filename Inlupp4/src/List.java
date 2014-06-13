	public class List {
	  
	  private Node first;
	  
	  
	  /********************************** Internal Node class ***/
	  
	  private static class Node {
	    private int data;
	    private Node next;
	    
	    private Node(int data, Node next) {
	      this.data = data;
	      this.next = next;
	    }
	  }
	 
	  
	  /*********************************** Constructors ***/
	  
	  public List() {
	     first = null; 
	  }
	  
	    
	  private List(Node n) {   // For internal use 
	    first = n;
	  }
	  
	  
	  /*********************************** Methods ***/
	  
	  //                                   toString
	  public String toString() {
	    return "[" + toString(first) + "]";
	  }
	  
	  private static String toString(Node n) {
	    if (n==null)
	      return "";
	    else if (n.next==null)
	      return "" + n.data;
	    else
	      return "" + n.data + ", " + toString(n.next);
	  }
	  
	  public void putFirst(int n) { // Should not be used on an ordered list!
	    first = new Node(n, first);
	  }
	   
	  public boolean isEmpty() {
	    return first==null;
	  }
	  
	 
	  /** Inserts a number in an ordered list so that the order is maintained. 
	    * If the number already is in the list, nothing
	    * is changed, i. e. every number occurs only once in the list
	    */
	  public void insert(int k) { 
	    first = insert(k, first); 
	  } 
	  
	  private static Node insert(int k, Node n) { 
	    if (n==null || k<n.data) { 
	      return new Node(k, n); 
	    } else if (k>n.data) { 
	      n.next = insert(k, n.next); 
	    } 
	    return n; 
	  }
	  
	  
	  public void remove(int k) { 
	    first = remove(k, first); 
	  }
	 
	  private static Node remove(int k, Node n) { 
	    if (n==null || k<n.data) {
	      //throw new ListException("remove: No such element in list: " + k); 
	    } else if (k==n.data) {
	    	return n.next; 
	    } else { 
	    	n.next = remove(k, n.next); 
	    }
	    return n;  
	  }
	
	  
	  public List copy() {
	     return new List(copy(first)); 
	  }
	  
	  private static Node copy(Node n) {
	    if (n==null)
	      return null;
	    else
	      return new Node(n.data, copy(n.next));
	  }
	  
	  public int length(){
		  /***************Iterative method**********/
		  /*int len = 0;
		  Node n = first;
		  while(n != null){
			  len++;
			  n=n.next;
		  }
		  return len;*/
		  /**************Recursive method**********/
		  return length(first);
		    
	  }
	  
	  public static int length(Node n){
		  if (n==null)
		      return 0;
		    else if (n.next==null)
		      return 1;
		    else
		      return length(n.next)+1;			  
	  }
	  
	 public boolean contains(int x){
		 if(!isEmpty()){
			 if(first.data == x)
			 	return true;
		 	else
			 	return contains(x,first);
		 }else 
			 return false;
	 }
	 
	 public static boolean contains(int x, Node n){
		  if (n==null)
		      return false;
		    else{
		    	if(x == n.data)
		    		return true;
		    	else if(contains(x,n.next))
		    		return true;
		    	else
		    		return false;
		    	
		    }	  
	  }
	 
	 public int getLast()throws ListException{
		 int last = 0;
		 if(!isEmpty())
			 last = getLast(first);
		 else
			 throw new ListException("Empty!");
		 
		 return last;
	 }
	 
	 public static int getLast(Node n){
		 if(n.next == null)
			return n.data;
		else
			return getLast(n.next);
	 }
	 
	 public int atIndex(int i) throws ListException{
		 if(length()-1 < i){
			 throw new ListException("Out of bounds!");
		 }else if(isEmpty()){
			 throw new ListException("Empty");
		 }else if(i < 0){
			 throw new ListException("No negative numbers");
		 }else{
			 return  atIndex(i,first,0);
		 }
	 }
	  
	 public static int atIndex(int i , Node n, int thisIndex){
		 if(thisIndex == i)
			 return n.data;
		 else if(n.next != null)
			 return atIndex(i,n.next,thisIndex+1);
		 else
			 return 0;
	 }
	 
	 
	 
	 public int removeFirst(){
		 if(!isEmpty()){
			 int firstVal = first.data;
			 first = first.next;
			 return firstVal;
		 }else
			 throw new ListException("Empty!");
	 }
	 
	 
	 public int removeLast() throws ListException{
		 if(!isEmpty()){
			 int lastVal = atIndex(length()-1);
			 first = removeLast(first);
			 return lastVal;
		 }else
			 throw new ListException("Empty!");
	 }
	 
	 public static Node removeLast(Node n){
		 if(n.next == null){
			 return n.next;
		 }else{
			 n.next =  removeLast(n.next);
		 }
		 return n;
	 }
	 
	 
	 public boolean equals(List l) throws ListException{
		 /*if(this.length() == l.length())
			 return equals(this.first,l.first);
		 else if(this.isEmpty() && l.isEmpty())
			 return true;
		 else
			 return false;	 
		 */
		 return equals(this.first, l.first);
	 }
	 
	 public static boolean equals(Node n1,Node n2){ 
		 if(n1==null && n2==null){
			 return true;
		 }else if(n1==null || n2==null){
			 return false;
		 }else if(n1.data == n2.data){
			 return equals(n1.next, n2.next);
		 }else{
			 return false;
		 }
	 }
	 
	 public List intersection(List l){ //Check for empty
		 return intersection(l.first,new List());
	 }
	 
	 public List intersection(Node n, List intList){
		 if(n != null){
			 if(this.contains(n.data)){
				 intList.insert(n.data);
			 }
			 return intersection(n.next,intList);
			 
		 }else
			 return intList;
	 }
	 
	  public static void main(String[] args) {
	     List p = new List();
	     System.out.println(p.toString());
	     p.putFirst(7);
	     System.out.println(p.toString());
	     p.putFirst(5);
	     System.out.println(p.toString());
	     p.putFirst(3);
	     System.out.println(p.toString());
	     p.putFirst(1);
	     System.out.println(p.toString());
	     
	
	      
	     System.out.println("Length: " + p.length());           // Test of length
	     
	     System.out.println("contains(0): " + p.contains(0));   // Test of contains
	     System.out.println("contains(1): " + p.contains(1));
	     System.out.println("contains(2): " + p.contains(2));
	     System.out.println("contains(5): " + p.contains(5));
	     System.out.println("contains(7): " + p.contains(7));
	     System.out.println("contains(9): " + p.contains(9));
	    
	     
	     System.out.println("getLast()  : " + p.getLast());    // Test of getLast
	     
	     System.out.println("atIndex(0) : " + p.atIndex(0));   // Test of atIndex
	     System.out.println("atIndex(1) : " + p.atIndex(1));     
	     System.out.println("atIndex(2) : " + p.atIndex(2));
	     
	     System.out.print("removeFirst: ");                    // Test of removeFirst
	     while (!p.isEmpty()) {
	      System.out.print(p.removeFirst() + "  "); 
	     }
	     System.out.println();
	 
	     System.out.println("Force an exception");             // Test of ListException
	     try {
	       p.removeFirst();
	     } catch (ListException e) {
	       System.out.println("List exception: " + e.getMessage());
	     }
	     
	                                                           // Rebuilding lists
	     for (int i=0; i<9; i++) {
	       p.insert((int)(Math.random()*10));
	     }
	     
	     System.out.println("Inserted random numbers: " + p);
	     
	     for (int i= 2; i<10; i+=2 ) {
	       if (p.contains(i))
	         p.remove(i);
	     }
	     System.out.println("Without even numbers   : " + p);
	     
	     List q = p.copy();
	     q.insert(42);
	     q.insert(42);
	     System.out.println("p: " + p);
	     System.out.println("q: " + q);
	     System.out.println(q.removeLast());                                      // Test of removeLast
	     System.out.println("q: " + q + 
	                        "   after q.removeLast()");
	
	     System.out.println("p.equals(q): " + p.equals(q));   // Test of equals
	     p.insert(42);
	     System.out.println("p.equals(q): " + p.equals(q) + 
	                        " after insertion in p");
	    
	                                                          // Test of union and intersection
	     for (int i=0; i<10; i++) {
	       p.insert((int)(Math.random()*15));
	       q.insert((int)(Math.random()*15));
	     }
	
	     System.out.println("p: " + p);
	     System.out.println("q: " + q);
	     List r = new List();
	     List s = r.copy();
	     s.insert(3);
	     s.removeLast();
	     System.out.println(r.length());
	     if(r.equals(s))
	    	 System.out.println("It worked!!");
	     
	     System.out.println(r.toString());
	     //System.out.println("p.union(q)       : " + p.union(q));
	     System.out.println("p.intersection(q): " + q.intersection(r));
	     
	     
	     List l1 = new List();
	     l1.insert(21); l1.insert(37); l1.insert(40); l1.insert(52);
	     List l2 = l1.copy();
	     System.out.println("\n");
	     System.out.println("l1: \t " + l1.toString());
	     System.out.println("l2: \t " + l2.toString());
	     
	     l2.putFirst(3);
	     System.out.println("\n");
	     System.out.println("l1: \t " + l1.toString());
	     System.out.println("l2: \t " + l2.toString());
	     
	     l2.removeLast();
	     System.out.println("\n");
	     System.out.println("l1: \t " + l1.toString());
	     System.out.println("l2: \t " + l2.toString());
	     
	     System.out.println("l1=l2: \t " + l1.equals(l2));
	     /*  Flytta ned denna rad allteftersom du implementerar metoderna
	   */
	  }
	  
	  
	  
	}
