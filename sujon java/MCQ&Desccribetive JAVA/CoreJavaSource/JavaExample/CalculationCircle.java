import java.util.Scanner;
public class CalculationCircle{
	
	public static void main(String[] args){
	
		int m,n;
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Ente desire radious ");
		m =sc.nextInt();
		
		System.out.print("Ente desire length ");
		n =sc.nextInt();
		
		double cir = m5(m);
		double scr = m6(n);
		
		System.out.println("Area is : "+cir);
		System.out.println("Squire is : "+scr);
		
		
	}
	
	
	public static double m5(int x){
		double z=3.1416*x*x;
		return z;
	}
		public static double m6(int x){
		double z=x*x;
		return z;
	}
}