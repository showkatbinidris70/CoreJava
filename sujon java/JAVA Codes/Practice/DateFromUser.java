import java.util.*;
import java.text.*;

public class DateFromUser{
	public static void main(String[] args){
		try{
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter a Date:");
			String s = sc.nextLine();
			
			//input format
			SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
			Date d = sdf.parse(s);
			
			//output format
			SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");
			String d2 = sdf2.format(d);
			
			System.out.println("Your inserted Date is: "+d2);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}