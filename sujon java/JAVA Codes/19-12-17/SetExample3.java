import java.util.*;
public class SetExample3{
	public static void main(String[] args){
		Set s = new HashSet();
		s.add("Arif");
		s.add("Rakib");
		s.add("3rd");
		s.add(new Integer(4));
		s.add(new Float(5.0F));
		s.add(new Float(5.0F));//Duplicate will not print.
		System.out.println(s);
	}
}