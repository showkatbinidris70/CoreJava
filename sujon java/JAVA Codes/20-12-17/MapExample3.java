import java.util.*;
public class MapExample3{
	public static void main(String[] args){
		Map m = new HashMap();
		m.put("one","1st");
		m.put("second",new Integer(2));
		m.put("third","3rd");
		//Overwrites the previous assignment.
		m.put("third","iii");
		
		/*//Return keys
		Set s1 = m.keySet();
		//Return values
		Collection c = m.values();
		//Return keys with values
		Set s2 = m.entrySet();*/
		
		//Showing values
		Enumeration e = Collections.enumeration(m.values());
		while(e.hasMoreElements()){
			System.out.println(e.nextElement());
		}
	}
}