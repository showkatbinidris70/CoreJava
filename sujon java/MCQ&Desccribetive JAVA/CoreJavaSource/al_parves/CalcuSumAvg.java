import java.util.*;
public class CalcuSumAvg{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int p = 0;
		int n;
		

		
	   
	  	 do{
			System.out.print("Enter a value for test : ");
	 		n = sc.nextInt();

			if(n!=-1){
			
				sum+=n;
				p++;
			}
		

	   	 }while(n!=-1);
		
		System.out.println("Total is : "+sum);
		System.out.println("Average is : "+sum/p);
	
	
	}



}