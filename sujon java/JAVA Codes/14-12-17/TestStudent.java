//Extends main class
import java.io.*;
public class TestStudent{
	public static void main(String[] args){
		Student s = new Student(10,"Raju",132458,"Male","Mirpur","01759-9885",true);

		try{
			File f1 = new File("StudentInfo.txt");
			boolean b1 = f1.createNewFile();
			FileOutputStream fos = new FileOutputStream(f1);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			ObjectOutputStream oos = new ObjectOutputStream(bos);
				oos.writeObject(s);
				oos.flush();
				oos.close();
				
			FileInputStream fis = new FileInputStream(f1);
			BufferedInputStream bis = new BufferedInputStream(fis);
			ObjectInputStream ois = new ObjectInputStream(bis);
			
			Object ob = ois.readObject();
			Student st = (Student)ob;
			
			
			System.out.println(st.name);
			System.out.println(st.nid);
			System.out.println(st.gender);
			System.out.println(st.address);
			System.out.println(st.phone);
			System.out.println(st.active);
			
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}
}