import java.util.Scanner;
public class Price{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double totalPrice = 0.0;
		System.out.println("Enter total price.");
		totalPrice = sc.nextDouble();
		double discount = (7.0*totalPrice)/100.0;
		double vat = (2.5*totalPrice)/100.0;
		double payment = totalPrice-discount+vat;
		System.out.println("Total price = "+totalPrice+" TK");
		System.out.println("Discount = "+discount+" TK");
		System.out.println("VAT = "+vat+" TK");
		System.out.println("Payment = "+payment+" TK");
	}
}