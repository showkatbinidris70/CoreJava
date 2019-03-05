import java.util.*;
public class FactorialTest{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter value for find factorial : ");
		int fac = sc.nextInt();
		double n = 1;
		

		for(int i = fac; i>=1; i--){
			
			n = n*i;
		}
		System.out.println(fac+" factorial value "+n);

	}


}