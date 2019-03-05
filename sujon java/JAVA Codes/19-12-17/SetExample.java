import java.util.*;
public class SetExample{
	public static void main(String[] args){
		Set<String> s = new HashSet<String>();
		s.add("Arif");
		s.add("Rakib");
		s.add("Mamun");
		s.add("Jafar");
		s.add("Jafar");//Duplicate will not print.
		System.out.println(s);
	}
}