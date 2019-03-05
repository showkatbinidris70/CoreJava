public class TestStudent{
	public static void main(String[] args){
		Student s1 = new Student(100, "Monirul", 3.9, true);
		Student s2 = new Student();
		Student s3 = new Student(100, "Rezaul");
		System.out.println(s1.name);
		System.out.println(s2.gpa);
		System.out.println(s2.name);
	}
}