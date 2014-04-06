/*
Inlupp 2, Programmeringsteknik II, Andreas Johlander
*/
  import java.util.Scanner;
public class Recursion{


	//Övning 1
	public static double power(double x, int n){		
		if(n == 0){
			return 1;
		}else{
			return x*power(x,n-1);
		}
	}

	//Övning 2
		public static int multiply(int m, int n){
			if(n == 0){
				return 0;
			}else{
				return m+multiply(m,n-1);
			}
		}

	//Övning 3
		public static int divide(int t, int n){
			if(t-n <0){
				return 0;
			}else{
				return 1+divide(t-n,n);
			} 

		}

	//Övning 4
		public static double harmonic(int n){
			if(n == 1){
				return 1.0;
			}else{
				return 1.0/n + harmonic(n-1);

			} 

		}

	//Övning 5
		public static int largest(int[] a, int i){
			if(i==0){
				return a[i];

			}else{
				int[] newArray = new int[i];
				if(a[i]>=a[0]){
					for(int j=1; j<=i; j++){
						newArray[j-1] = a[j];
					}
				}else{
					for(int j=0; j<i; j++){
						newArray[j] = a[j];
					}
				}
				return largest(newArray,i-1);
			} 

		}



	//Övning 9
		public static void hanoi(char from, char to, char help, int n){
			
			if(n ==1){
				System.out.println(from + " -> " + to);
			}else{
				hanoi(from,help,to,n-1);
				System.out.println(from + " -> " + to);
				hanoi(help,to,from,n-1);
			}
		}

	//Övning 10
		public static long fib(int n) {
			if ( n==0 )
				return 0;
			else if ( n==1 )
				return 1;
			else
				return fib(n-1) + fib(n-2);
			}
/* 
Tid för:
n = 50	-	t = 68.4s
n = 100	-	t = alldeles för lång tid
			t = 1.92*10^12s enligt formel, det är 60000 år...

*/



		//Övning 15
		public static String reverseInt(int x){
			String str = "";
			if(x/10 == 0){
				return Integer.toString(x);
			}else{
				str = x%10 + reverseInt(x/10);
				return str;
			}
		}



		//Övning 17
		public static void reverseNumbers(){
			Scanner sc = new Scanner(System.in);			
			if(sc.hasNextInt()){
				int i = sc.nextInt();
				reverseNumbers();
				System.out.print(" " + i);
			
			}
		}













}


