import java.util.Scanner;
public class Prime{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int x = sc.nextInt();
		int c = 0;
		for (int i = 1; i <= x; i++){
			if (x%i==0){
				c++;
			}
		}
		if (c==2){
			System.out.println("The number "+x+" is prime.");
		}else{
			System.out.println("The number "+x+" is not prime.");
		}
	}
}