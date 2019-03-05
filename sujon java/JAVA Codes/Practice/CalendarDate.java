import java.util.*;
import java.text.*;

public class CalendarDate{
	public static void main(String[] args){
		Calendar c = Calendar.getInstance();
		Date d = c.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		String s = sdf.format(d);
		
		System.out.println("Today is: "+s);
	}
}