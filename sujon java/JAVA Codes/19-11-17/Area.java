import java.util.Scanner;
public class Area{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double r = 0;
		System.out.println("Enter value for r.");
		r = sc.nextDouble();
		double area = Math.PI*r*r;
		System.out.println("Area = "+area);
	}
}