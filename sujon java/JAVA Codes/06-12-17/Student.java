public class Student{
	int id;
	String name;
	double gpa;
	boolean active;
	public void setId(int id){
		this.id=id;
	}
	public int getId(){
		return id;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public void setGpa(double gpa){
		this.gpa=gpa;
	}
	public double getGpa(){
		return gpa;
	}
	public void setActive(boolean active){
		this.active=active;
	}
	public boolean isActive(){
		return active;
	}
	
	public Student(){
	}
	public Student(int id){
		this.id=id;
	}
	public Student(int id, String name){
		this.id=id;
		this.name=name;
	}
	public Student(int id, String name, double gpa, boolean active){
		this.id=id;
		this.name=name;
		this.gpa=gpa;
		this.active=active;
	}
	public String sayHello(){
		String s="Hello";
		return s;
	}
}