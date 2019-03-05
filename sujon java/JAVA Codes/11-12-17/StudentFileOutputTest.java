import java.io.*;
public class StudentFileOutputTest{
	public static void main(String[] args){
		try{
			Student s1 = new Student(20,"Razu",5,true);
			File f1 = new File("Student.txt");
			FileOutputStream fos = new FileOutputStream(f1);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			ObjectOutputStream oos = new ObjectOutputStream(bos);
				//oos.writeObject("Name:"+s1.name+"  ID:"+s1.id+"  GPA:"+s1.gpa+"  Active"+s1.active);
				oos.writeObject(s1.id);
				oos.flush();
				oos.close();
		}catch(Exception e){
			e.printStackTrace();
		}
			
	}
}