import java.io.*;
public class Student implements Serializable{
	String name;
	int id;
	int round;
	String email;
	boolean active;
	public Student(String name,int id,int round,String email,boolean active){
		this.name=name;
		this.id=id;
		this.round=round;
		this.email=email;
		this.active=active;
	}
}