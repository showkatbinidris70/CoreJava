import java.util.Scanner;
public class PracticeArrScan{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int r;
		System.out.println("Please ente a conditon");
		r = sc.nextInt();
		int[] p = new int[r];
		
		
		
		for(int i=0; i<p.length; i++){
			System.out.print("Enter a value ");
			  p[i] = sc.nextInt();  
			
		}
		double res = 0;
		for(int temp : p){
				res+=temp;
		}
		
		System.out.println(res);
			
		
		
	}
	
}