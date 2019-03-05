import java.util.regex.*;
import java.io.*;
import java.util.*;

public class StudentTest{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter student id:");
		int sid = sc.nextInt();
		
		System.out.println("Enter student name:");
		String sname = sc.next();
		
		System.out.println("Enter student gpa:");
		double sgpa = sc.nextDouble();
		
		System.out.println("Enter student active:");
		boolean sactive = sc.nextBoolean();
		
		Student s1 = new Student(sid,sname,sgpa,sactive);
		
		try{
			File f1 = new File("Student.txt");
			boolean b1 = f1.createNewFile();
			FileWriter fw = new FileWriter(f1);
			BufferedWriter bw = new BufferedWriter(fw);
				bw.write("ID:"+s1.id+"  Name:"+s1.name+"  GPA:"+s1.gpa+"  Active:"+s1.active);
				bw.flush();
				bw.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}