public class BinarySearchTree {
  
   private static class Node {
       private String key;
       private Node left, right;
    
       private Node(String key, Node left, Node right) {
           this.key = key;
           this.left  = left;
           this.right = right;
       }
   }
  
   private Node root;
  
   public BinarySearchTree() { 
     root = null; 
   }
  
   private BinarySearchTree(Node r) { 
     root = r; 
   }
  
   public void insert(String key) {
     root = insert(key, root);
   }
   
   private static Node insert(String key, Node r) {
     if (r==null) {
       return new Node(key, null, null);
     } else if (key.compareTo(r.key) < 0) {
       r.left = insert(key, r.left);
     } else if (key.compareTo(r.key) > 0) {
       r.right = insert(key, r.right);
     } else {
     
     }
     return r;
   }
     
   public String toString() {
     return "<" + toString(root) + ">";
   }
   
   private static String toString(Node r) {
     if (r==null) {
       return "";
     } else {
       return toString(r.left) + " " + r.key + toString(r.right);
     }
   }
   
   public int size(){
	   return size(root);
   }
   
   public static int size(Node n){
	   //System.out.println(n.key + " " + n.left.key + " " + n.right.key);
	   if (n == null){
		   return 0;
	   }else if (n.right == null){
		   return size(n.left)+1;
	   }else if(n.left == null){
			return size(n.right)+1;
	   }else{
		   return size(n.right)+size(n.left)+1;
	   }
   }
   
   public int height(){
	   return height(root);
   }
   
   public static int height(Node n){
	   if(n==null){
		   return 0;
	   }else if (n.right == null){
		   return height(n.left)+1;
	   }else if(n.left == null){
			return height(n.right)+1;
	   }else{
		   if(height(n.right) >= height(n.left)){
			   return height(n.right)+1;
		   }else{
			   return height(n.left)+1;
		   }
	   }
   }
   
   public boolean contains(String s){
	   return contains(s,root);
   }
   
   public static boolean contains(String s, Node n){
	   if (n == null)
		   return false;
	   else if (n.key == s)
		   return true;
	   else if (n.right == null && n.left != null)
		   return contains(s,n.left);
	   else if (n.left == null && n.right != null)
		   return contains(s,n.right);	   		
	   else
		   return ( contains(s,n.right) || contains(s,n.left) );
   }
   
   public BinarySearchTree copy(){
	   if (size() == 0)
		   return new BinarySearchTree();
	   return new BinarySearchTree(copy(root));
   }
   
   public static Node copy(Node n){
	    if (n==null)
	        return null;
	    else
	        return new Node(n.key, copy(n.left),copy(n.right));
   }
   
   public boolean equals(BinarySearchTree t) {
	   return equals(this.root,t.root);
   }
   
   public static boolean equals(Node n1, Node n2){
	   if (n1 == null && n2 == null){
		   return true;
	   }else if (n1 == null || n2 == null){
		   return false;
	   }else if (n1.key == n2.key){
		   return ( equals(n1.right,n2.right) && equals(n1.left,n2.left) );
	   }else{
		   return false;
	   }
   }
   
   public int ipl(){
	   return ipl(root,1);
   }

   public static int ipl(Node n,int x){
	   if (n==null)
		   return 0;
	   else if (n.right == null && n.left == null){
		   System.out.println(x);
		   return x;
	   }else{
		   //System.out.println(ipl(n.right,x+1));
		   return x + ipl(n.right,x+1)+ipl(n.left,x+1);
	   }
   }
   
   public static void main(String[] args) {
     BinarySearchTree t = new BinarySearchTree();
     t.insert("g"); t.insert("a"); t.insert("c"); t.insert("x");
     t.insert("z"); t.insert("b"); t.insert("f");
     System.out.println("t : " + t);
     
  
   
     System.out.println("size             : " + t.size() );

     System.out.println("height           : " + t.height() );
    
     System.out.println("contains(\"x\")    : " + t.contains("x") );  
     System.out.println("contains(\"y\")    : " + t.contains("y") );
     /*
     System.out.println("smallest()       : " + t.smallest());
     System.out.println("numberOfLeaves() : " + t.numberOfLeaves());*/
     
     BinarySearchTree u = t.copy();
     System.out.println("u (copy of t)    : " + u);

     System.out.println("t.equals(u)      : " + t.equals(u));

     System.out.println("Inserting new nodes in different order");
     t.insert("h"); t.insert("i");
     u.insert("i"); u.insert("h");
     System.out.println("t.equals(u)      : " + t.equals(u));
    /*
     System.out.println("t.isOmorph(u)    : " + t.isOmorph(u));
     System.out.println("t.sameContents(u): " + t.sameContents(u));
     */
     BinarySearchTree s = new BinarySearchTree();
     BinarySearchTree r = s.copy();// new BinarySearchTree();
     System.out.println("Empty tree eqauls copy: " + s.equals(r));
     //s.insert("v");
     s.insert("a");
     s.insert("l");
     s.insert("x");
     
     System.out.println("height             : " + s.height() );
     System.out.println("s.ipl()          : " + s.ipl());
    
     /*   Flytta mer denna rad allteftersom du implementar metoderna
     */ 
   }
  
   
   
}
                             
                             
                             
                             