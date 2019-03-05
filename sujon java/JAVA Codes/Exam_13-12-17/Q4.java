//Email validation
import java.util.regex.*;
import java.util.*;

public class Q4{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter email:");
		String s = sc.next();
		
		Pattern p = Pattern.compile("^[a-z]+.[a-zA-Z0-9_]+@[a-zA-Z]+.[a-zA-Z]{2,3}$");
		Matcher m = p.matcher(s);
		boolean b = m.matches();
		if(b){
			System.out.println("Email match.");
		}else{
			System.out.println("Email doesn't match.\nExam: abc@gmail.com");
		}
	}
}