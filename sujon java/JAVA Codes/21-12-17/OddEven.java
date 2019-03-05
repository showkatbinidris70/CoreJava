import java.util.*;
public class OddEven{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to check odd-even and -1 to exit:");
		int x = sc.nextInt();
		
		while(x!=-1){
			if(x%2==0){
				System.out.println("The number "+x+" is even!");
			}else{
				System.out.println("The number "+x+" is odd!");
			}
			x = sc.nextInt();
		}
	}
}