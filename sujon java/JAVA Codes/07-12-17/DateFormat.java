import java.text.SimpleDateFormat;
import java.util.Date;
public class DateFormat{
	public static void main(String[] args){
		Date d1 = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		String s = sdf.format(d1);
		
		System.out.println(s);
	}
}