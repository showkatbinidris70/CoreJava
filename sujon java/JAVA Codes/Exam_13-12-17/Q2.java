//Factorial
import java.util.*;

public class Q2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int s = sc.nextInt();
		
		int f = 1;
		for(int i=s; i>=1; i--){
			f = f * i;
		}
		System.out.println("Factorial of "+s+" is = "+f);
	}
}