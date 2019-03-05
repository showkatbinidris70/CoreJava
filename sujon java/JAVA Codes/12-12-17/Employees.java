import java.io.*;

public class Employees implements Serializable{
	int empId;
	String empName;
	int empAge;
	String empJobId;
	String email;
	String phone;
	double salary;
	double commission;
	int managerId;
	boolean active;
	public void setEmpId(int empId){
		this.empId = empId;
	}
	public int getEmpId(){
		return empId;
	}
	public void setEmpName(String empName){
		this.empName = empName;
	}
	public String getEmpName(){
		return empName;
	}
	public void setEmpAge(int empAge){
		this.empAge = empAge;
	}
	public int getEmpAge(){
		return empAge;
	}
	public void setEmpJobId(String empJobId){
		this.empJobId = empJobId;
	}
	public String getEmpJobId(){
		return empJobId;
	}
	public void setEmail(String email){
		this.email = email;
	}
	public String getEmail(){
		return email;
	}
	public void setPhone(String phone){
		this.phone = phone;
	}
	public String getPhone(){
		return phone;
	}
	public void setSalary(double salary){
		this.salary = salary;
	}
	public double getSalary(){
		return salary;
	}
	
	public void setCommission(double commission){
		this.commission = commission;
	}
	public double getCommission(){
		return commission;
	}
	public void setManagerId(int managerId){
		this.managerId = managerId;
	}
	public int getManagerId(){
		return managerId;
	}
	public void setActive(boolean active){
		this.active = active;
	}
	public boolean isActive(){
		return active;
	}
	
	public Employees(){
		
	}
	/*public Employees(int empId,String empName,int empAge,String empJobId,String email,String phone,double salary,double commission,String managerId,boolean active;){
		this.empId = empId;
		this.empName = empName;
		this.empAge = empAge;
		this.empJobId = empJobId;
		this.email = email;
		this.phone = phone;
		this.salary = salary;
		this.commission = commission;
		this.managerId = managerId;
		this.active = active;
	}*/
}