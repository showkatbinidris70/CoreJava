//Method call from class
import java.io.*;
public class MethodCall{
	public static void main(String[] args){
		Student s = new Student(10,"Raju",132458,"Male","Mirpur","01759-9885",true);
		
		String r = s.m1(); //m1(); is in Student class
		System.out.println(r);
		
	}
}