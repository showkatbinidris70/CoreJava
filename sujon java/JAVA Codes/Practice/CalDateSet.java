
import java.text.*;
import java.util.*;

public class CalDateSet{
	public static void main(String[] args){
		Calendar c = Calendar.getInstance();
		c.set(2012,05,13);
		Date d = c.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String s = sdf.format(d);
		
		System.out.println("Set time is: "+s);
	}
}