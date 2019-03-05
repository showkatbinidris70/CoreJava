//Pattern matching

import java.util.regex.*;

public class PatternTest{
	public static void main(String[] args){
		
		Pattern p = Pattern.compile("^[a-zA-Z]+$");
		Matcher m = p.matcher("Bangladesh");
		boolean b1 = m.matches();
		
		if(b1){
			System.out.println("match!");
		}else{
			System.out.println("not match!");
		}
	}
}