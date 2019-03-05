import java.util.Scanner;
public class IncomePra{
	
	public static void main(String[] args){
	
		int x,y;
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter value for first item ");
		x=sc.nextInt();
		
		System.out.print("Enter value for second item ");
		y=sc.nextInt();
		
		double z=x*.17;
		double m=x-z;
		double p=y*.13;
		double q=y-p;
		
		double k=x*.05;
		double a=m-k;
		double l=y*.03;
		double b=q-l;

		double c=a+b;
		
		double d=c-(c*.05);
		
		System.out.print("Net profit is "+d);
	
	}
	
}