//two object write & read
import java.io.*;

public class Q1WriteRead{
	public static void main(String[] args){
		
		try{
			Q1 s1 = new Q1(10,"Hasan",25000,true);
			Q1 s2 = new Q1(11,"Tara",24000,false);
			
			File f1 = new File("a.txt");
			FileOutputStream fos = new FileOutputStream(f1);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			ObjectOutputStream oos = new ObjectOutputStream(bos);
			oos.writeObject(s1);
			oos.writeObject(s2);
			oos.flush();
			oos.close();
			
			FileInputStream fis = new FileInputStream(f1);
			BufferedInputStream bis = new BufferedInputStream(fis);
			ObjectInputStream ois = new ObjectInputStream(bis);
			
			Object ob = ois.readObject();
			Object ob2 = ois.readObject();
			Q1 p = (Q1)ob;
			Q1 p2 = (Q1)ob2;
			
			System.out.println("ID: "+p.id+"\nName: "+p.name+"\nSalary: "+p.salary+"\nActive: "+p.active);
			System.out.println("<<<<<<<<->>>>>>>>>");
			System.out.println("ID: "+p2.id+"\nName: "+p2.name+"\nSalary: "+p2.salary+"\nActive: "+p2.active);
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}