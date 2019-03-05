import java.io.*;
import java.util.*;

public class EmployeesWriteRead{
	public static void main(String[] args){
		Employees e = new Employees();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input emp ID:");
		int id = sc.nextInt();
		e.setEmpId(id);
		
		System.out.println("Input emp Name:");
		String name = sc.next();
		e.setEmpName(name);
		
		System.out.println("Input emp Age:");
		int age = sc.nextInt();
		e.setEmpAge(age);
		
		System.out.println("Input emp JobId:");
		String jobId = sc.next();
		e.setEmpJobId(jobId);
		
		System.out.println("Input Email:");
		String email = sc.next();
		e.setEmail(email);
		
		System.out.println("Input Phone:");
		String phone = sc.next();
		e.setPhone(phone);
		
		System.out.println("Input Salary:");
		double salary = sc.nextDouble();
		e.setSalary(salary);
		
		System.out.println("Input Commission:");
		double comm = sc.nextDouble();
		e.setCommission(comm);
		
		System.out.println("Input Manager Id:");
		int manaId = sc.nextInt();
		e.setManagerId(manaId);
		
		System.out.println("Input Active:");
		boolean active = sc.nextBoolean();
		e.setActive(active);
		
		try{
			File f1 = new File("EmployeeInfo.txt");
			boolean b1 = f1.createNewFile();
			FileOutputStream fos = new FileOutputStream(f1);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			ObjectOutputStream oos = new ObjectOutputStream(bos);
				oos.writeObject(e);
				oos.flush();
				oos.close();
				
			FileInputStream fis = new FileInputStream(f1);
			BufferedInputStream bis = new BufferedInputStream(fis);
			ObjectInputStream ois = new ObjectInputStream(bis);
			
			Object ob = ois.readObject();
			Employees em = (Employees)ob;
			
			System.out.println("<<<->>> Employee Info: <<<->>>");
			System.out.println("Employee ID: "+em.empId+"\nEmployee Name: "+em.empName+"\nEmployee Age: "+em.empAge+"\nEmployee Job ID: "+em.empJobId+"\nEmployee Email: "+em.email+"\nEmployee Phone: "+em.phone+"\nEmployee Salary: "+em.salary+"\nEmployee Commission: "+em.commission+"\nEmployee Manager ID: "+em.managerId+"\nEmployee Active: "+em.active);
			
		}catch(Exception ex){
			ex.printStackTrace();
		}
		
	}
}