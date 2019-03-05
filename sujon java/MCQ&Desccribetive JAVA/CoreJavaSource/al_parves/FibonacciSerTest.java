import java.util.*;
public class FibonacciSerTest{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter value for find test value : ");
		int n = sc.nextInt();
	
		System.out.print("Enter a value : ");
		for(int i = 1; i<=n; i++){
		
			int f = fib(i);
			System.out.println("fib("+i+") = "+f);
		}
	
	}
	public static int fib(int n){
	
		if(n<=2){
			
			return 1;
		}else{
		
			return fib(n-1) + fib(n-2);
		}	

	}


}