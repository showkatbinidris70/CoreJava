import java.util.Scanner;
public class CalculationPractice{
	
	public static void main(String[] args){
	
		int m,n;
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Value for Bangla ");
		m =sc.nextInt();
		
		System.out.print("Value for English ");
		n =sc.nextInt();
		
		int res =m2(m,n);
		int sub =m3(m,n);
		int mul =m4(m,n);
		int div =m5(m,n);
		System.out.println("Total is : "+res);
		System.out.println("Substraction is : "+sub);
		System.out.println("Multiplication is : "+mul);
		System.out.println("Divide is : "+div);
		
	}
	
	public static int m2(int x,int y){
		int z=x+y;
		return z;
	}
	
		public static int m3(int x,int y){
		int z=x-y;
		return z;
	}
	
		public static int m4(int x,int y){
		int z=x*y;
		return z;
	}
	
		public static int m5(int x,int y){
		int z=x/y;
		return z;
	}
}