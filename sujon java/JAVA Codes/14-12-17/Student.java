//Extends class from Men
import java.io.*;
class Student extends Men implements Serializable{
	int id;
	String address;
	String phone;
	boolean active;
	
	public Student(){
		
	}
	public Student(int id,String name,int nid,String gender,String address,String phone,boolean active){
		this.id = id;
		this.name = name;
		this.nid = nid;
		this.gender = gender;
		this.address = address;
		this.phone = phone;
		this.active = active;
	}
	
	public String m1(){
		String p = "Bangladesh";
		return p;
	}
}