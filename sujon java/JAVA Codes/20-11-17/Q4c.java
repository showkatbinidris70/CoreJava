import java.util.Scanner;
public class Q4c{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number for MCQ");
		int m = sc.nextInt();
		if((m>=80) && (m<101)){
			System.out.println("You got A+");
		}else if((m>=70) && (m<80)){
			System.out.println("You got A");
		}else if((m>=0) && (m<70)){
			System.out.println("You failed.");
		}else{
			System.out.println("Invalid number.");
		}
	}
}