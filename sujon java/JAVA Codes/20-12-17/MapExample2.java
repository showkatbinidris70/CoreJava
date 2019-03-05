import java.util.*;
public class MapExample2{
	public static void main(String[] args){
		Map m = new HashMap();
		m.put("one","1st");
		m.put("second",new Integer(2));
		m.put("third","3rd");
		//Overwrites the previous assignment.
		m.put("third","iii");
		
		//Return keys
		Set s1 = m.keySet();
		//Return values
		Collection c = m.values();
		//Return keys with values
		Set s2 = m.entrySet();
		
		Iterator it = s2.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
}