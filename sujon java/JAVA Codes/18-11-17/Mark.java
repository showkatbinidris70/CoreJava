import java.util.Scanner;
public class Mark{
	public static void main(String[] args){
		int bangla = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Input number for Bangla.");
		bangla = sc.nextInt();
		int english = 0;
		System.out.println("Input number for English.");
		english = sc.nextInt();
		int t = bangla + english;
		System.out.println("Bangla = "+bangla);
		System.out.println("English = "+english);
		System.out.println("Total is = "+t);
	}
}