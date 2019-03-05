import java.util.Scanner;
public class Student{
	public static void main(String[] args){
		String id = " ";
		Scanner sc = new Scanner(System.in);
		System.out.println("Write your ID here.");
		id = sc.next();
		String name = " ";
		System.out.println("Write your Name here.");
		name = sc.next();
		String pass = " ";
		System.out.println("Write your Password here.");
		pass = sc.next();
		String email = " ";
		System.out.println("Write your E-mail here.");
		email = sc.next();
		String round = " ";
		System.out.println("Write your Round here.");
		round = sc.next();
		System.out.println("ID : "+id+"\nName : "+name+"\nPassword : "+pass+"\nE-mail : "+email+"\nRound : "+round);
	}
}