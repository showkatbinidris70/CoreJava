import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class DateFormat2{
	public static void main(String[] args){
		try{
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter a date");
			String d1 = sc.nextLine();
			SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
			Date d2 = sdf.parse(d1);
			//String s = sdf.format(d2);
			SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");
			String s = sdf2.format(d2);
			
			System.out.println("Result of date format: "+s);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}