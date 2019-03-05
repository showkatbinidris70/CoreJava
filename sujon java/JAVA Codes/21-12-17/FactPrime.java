import java.util.*;
public class FactPrime{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to get factorial and check prime or not:");
		int z = sc.nextInt();
		int f = 1;
		
		for(int i=z; i>=1; i--){
			f = f * i;
		}
		System.out.println("Factorial of "+z+" is: "+f);
		
		int x = f;
		int c = 0;
		for(int j=1; j<=x; j++){
			
			if(x%j==0){
				c++;
			}
		}
		if(c==2){
			System.out.println(x+" is a prime number!");
		}else{
			System.out.println(x+" is not a prime number!");
		}
	}
}