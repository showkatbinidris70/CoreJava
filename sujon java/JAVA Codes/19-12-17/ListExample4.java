import java.util.*;
public class ListExample4{
	public static void main(String[] args){
		List<String> s = new ArrayList<String>();
		s.add("Arif");
		s.add("Rakib");
		s.add("Mamun");
		s.add("Jafar");
		s.add("Jafar");//Duplicate will print.
		System.out.println(s.get(3));
	}
}