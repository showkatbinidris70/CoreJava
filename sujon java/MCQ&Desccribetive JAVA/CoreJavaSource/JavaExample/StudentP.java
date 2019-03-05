import java.util.Scanner;
public class StudentP{
	
	public static void main(String[] args){
		/* System.out.println("Hello World");
		m1(); */
		int m,n;
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Value for Bangla ");
		m =sc.nextInt();
		
		System.out.print("Value for English ");
		n =sc.nextInt();
		
		/* StudentP p=new StudentP();
		p.m1(); */
		
		int res =m2(m,n);
		System.out.println("The total is : "+res);
	}
	
	public void m1(){
		
		
		/* int o=m+n;
		int q=o/2; */
		
		//int h=m2(m,n);
		
		
		
	}
	
	public static int m2(int x,int y){
		int z=x+y;
		return z;
	}
}