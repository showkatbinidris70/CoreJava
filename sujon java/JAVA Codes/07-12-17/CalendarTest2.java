
import java.text.SimpleDateFormat;
import java.util.*;

public class CalendarTest2{
	public static void main(String[] args){
		Calendar c = Calendar.getInstance();
		c.set(2015,05,23);
		Date d1 = c.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");
		String s1 = sdf.format(d1);
		System.out.println("Result of Calendar: "+s1);
	}
}