import java.util.Scanner;
public class SomeCalculation{
	
	public static void main(String[] args){
	
		int m,n,p,q,r;
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Ente desire radious ");
		m =sc.nextInt();
		
		System.out.print("Ente desire radious ");
		n =sc.nextInt();
		
		System.out.print("Ente desire radious ");
		p =sc.nextInt();
		
		System.out.print("Ente desire radious ");
		q =sc.nextInt();
		
		System.out.print("Ente desire radious ");
		r =sc.nextInt();
		
		int res=m1(m,n,p,q,r);
		
		System.out.print("The average is : "+res);
		
	}
	
	public static m1(int x, int y, int z, int a,int b){
		
			int res=(x+y+z+a+b)/5;
			return res;
	}
}