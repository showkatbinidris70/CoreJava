//two object write & read
import java.io.*;

public class Q1 implements Serializable{
	int id;
	String name;
	double salary;
	boolean active;
	
	public Q1(){
		
	}
	public Q1(int id,String name,double salary,boolean active){
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.active = active;
	}
}