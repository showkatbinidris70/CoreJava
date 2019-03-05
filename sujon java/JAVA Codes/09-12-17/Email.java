//Email vrification

import java.util.Scanner;
import java.util.regex.*;

public class Email{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Write email here:");
		String s = sc.nextLine();
		
		Pattern p = Pattern.compile("^[a-zA-Z]+[a-zA-Z0-9_.]+[@][a-zA-Z]+[.][a-zA-Z]{2,3}$");
		Matcher m = p.matcher(s);
		boolean b1 = m.matches();
		
		if(b1){
			System.out.println("** Email address has matched! **");
		}else{
			System.out.println("** Email address doesn't match!\nExample: (abc_cd23@yahoo.com). **");
		}
	}
}