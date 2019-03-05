import java.util.Scanner;
public class OddEven{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n1 = 0;
		System.out.println("Enter number.");
		n1 = sc.nextInt();
		if (n1%2==0){
			System.out.println("The number is even.");
		}else{
			System.out.println("The number is odd.");
		}
	}
}