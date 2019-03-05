//Pattern From User

import java.util.Scanner;
import java.util.regex.*;

public class PatternFromUser{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Write here:");
		String s = sc.nextLine();
		
		Pattern p = Pattern.compile("^[a-zA-Z. ]+$");
		Matcher m = p.matcher(s);
		boolean b1 = m.matches();
		
		if(b1){
			System.out.println("match!");
		}else{
			System.out.println("not match!\nWrite in(a-zA-Z. ).");
		}
	}
}