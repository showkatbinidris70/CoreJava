import java.io.*;
public class TestStudent{
	public static void main(String[] args){
		
		Student s = new Student("Monirul",13456,34,"monirul@mail.com",true);
		try{
			File f1 = new File("StudentInfo.txt");
			boolean b1 = f1.createNewFile();
			FileOutputStream fos = new FileOutputStream(f1);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			ObjectOutputStream oos = new ObjectOutputStream(bos);
			oos.writeObject(s);
			oos.flush();
			oos.close();

		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
}