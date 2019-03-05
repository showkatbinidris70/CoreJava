import java.util.*;
public class MapExample{
	public static void main(String[] args){
		Map m = new HashMap();
		m.put("one","1st");
		m.put("second",new Integer(2));
		m.put("third","3rd");
		//Overwrites the previous assignment.
		m.put("third","iii");
		
		Set s1 = m.keySet();
		Collection c = m.values();
		Set s2 = m.entrySet();
		
		System.out.println(s1+"\n"+c+"\n"+s2);
	}
}