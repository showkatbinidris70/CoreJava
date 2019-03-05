import java.util.*;
public class SetLoopExample{
	public static void main(String[] args){
		Set<String> s = new HashSet<String>();
		s.add("Arif");
		s.add("Rakib");
		s.add("Mamun");
		s.add("Jafar");
		s.add("Sarwar");
		Iterator it = s.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
	}
}