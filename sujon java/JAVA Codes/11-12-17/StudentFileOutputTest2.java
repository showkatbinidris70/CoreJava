import java.io.*;

public class StudentFileOutputTest2{
	public static void main(String[] args){
		try{
			Student2 s1 = new Student2(20,"Razu",5,true);
			File f1 = new File("Student2.txt");
			FileOutputStream fos = new FileOutputStream(f1);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			ObjectOutputStream oos = new ObjectOutputStream(bos);
				//oos.writeObject("Name:"+s1.name+"  ID:"+s1.id+"  GPA:"+s1.gpa+"  Active"+s1.active);
				oos.writeObject(s1);
				oos.flush();
				oos.close();
				
			
			FileInputStream fis = new FileInputStream(f1);
			BufferedInputStream bis = new BufferedInputStream(fis);
			ObjectInputStream ios = new ObjectInputStream(bis);
			
			Object ob = ios.readObject();
			Student2 s = (Student2)ob;
			System.out.println(s.id);
			System.out.println(s.name);
			System.out.println(s.gpa);
			System.out.println(s.active);
			
		}catch(Exception e){
			e.printStackTrace();
		}
			
	}
}