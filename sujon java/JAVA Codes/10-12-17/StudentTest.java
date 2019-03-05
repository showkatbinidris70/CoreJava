import java.util.regex.*;
import java.io.*;

public class StudentTest{
	public static void main(String[] args){
		Student s1 = new Student(112345, "Monirul");
		Student s2 = new Student(132456, "Raju");
		Student s3 = new Student(156421, "Hasan");
		
		//System.out.println(s1.name);
		try{
			File f1 = new File("Student.txt");
			boolean b1 = f1.createNewFile();
			FileWriter fw = new FileWriter(f1);
			BufferedWriter bw = new BufferedWriter(fw);
				bw.write("Name: "+s1.name+", ID: "+s1.id+". Name: "+s2.name+", ID: "+s2.id);
				bw.flush();
				bw.close();
				
			File f2 = new File("Student.txt");
			FileReader fr = new FileReader(f2);
			BufferedReader br = new BufferedReader(fr);
				char c[] = new char[1];
				int n = br.read(c, 0, 1);
				
				while(n!=-1){
					System.out.print(c);
					n = br.read(c, 0, 1);
				}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}