public class Student{
	int id;
	String name;
	public void setId(int id){
		this.id = id;
	}
	public int getId(){
		return id;
	}
	public void setName(String id){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public Student(){
		
	}
	public Student(int id){
		this.id = id;
	}
	public Student(int id,String name){
		this.id = id;
		this.name = name;
	}
}