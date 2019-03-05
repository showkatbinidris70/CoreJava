
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;

public class CalendarTest{
	public static void main(String[] args){
		Calendar c = Calendar.getInstance();
		Date d1 = c.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("MMM-dd-yyyy");
		String s1 = sdf.format(d1);
		System.out.println("Result of Calendar: "+s1);
	}
}