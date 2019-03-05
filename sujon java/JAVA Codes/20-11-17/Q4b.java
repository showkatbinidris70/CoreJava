import java.util.Scanner;
public class Q4b{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of pens");
		int x = sc.nextInt();
		System.out.println("Enter price of the pen");
		int y = sc.nextInt();
		System.out.println("Enter new numbers of pen");
		int n = sc.nextInt();
		int r = y*n/x;
		System.out.println("Pen = "+x);
		System.out.println("Price = "+y);
		System.out.println("New pens price = "+r);
	}
}