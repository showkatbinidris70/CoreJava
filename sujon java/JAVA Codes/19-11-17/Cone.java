import java.util.Scanner;
public class Cone{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double h = 0;
		System.out.println("Enter value for h");
		h = sc.nextDouble();
		double r = 0;
		System.out.println("Enter value for r");
		r = sc.nextDouble();
		double area = (Math.PI*r*r)/3;
		System.out.println("Area of Cone is = "+area);
	}
}