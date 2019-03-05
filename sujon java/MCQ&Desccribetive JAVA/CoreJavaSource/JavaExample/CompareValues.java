import java.util.Scanner;
public class CompareValues{
	
	public static void main(String[] args){
	
		int m,n;
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Value for Bangla ");
		m =sc.nextInt();
		
		System.out.print("Value for English ");
		n =sc.nextInt();
		
		int res =m2(m,n);
		System.out.println("Total is : "+res);
		
		boolean res1 =m3(res);
		//System.out.println("Return is : "+res1);
		
		if(res1=true){
			System.out.print("The number is greater than 100!");
		}else{
			System.out.print("The number is less than 100!");
		}
		
	}
	
	public static int m2(int x,int y){
		int z=x+y;
		return z;
	}
	
	public static boolean m3(int x){
		
			boolean res2=x>100;
			return res2;
	}
	
}