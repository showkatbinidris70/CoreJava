import java.util.Scanner;
public class CompareIf{
	
	public static void main(String[] args){
	
		int m,n;
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Value for Bangla ");
		m =sc.nextInt();
		
		System.out.print("Value for English ");
		n =sc.nextInt();
		
		/* int res =m2(m,n);
		System.out.println("Total is : "+res);
		
		boolean res1 =m3(res);
		//System.out.println("Return is : "+res1); */
		
		/* if(res1=true){
			System.out.print("The number is greater than 100!");
		}else{
			System.out.print("The number is less than 100!");
		}
		
	} */
	
		if(m>n){
			System.out.println("Hello");	
		}else{
			System.out.println("Bangladesh");	
		}if(m>n){
			System.out.print("Dhaka");	
		}
	}
	
}