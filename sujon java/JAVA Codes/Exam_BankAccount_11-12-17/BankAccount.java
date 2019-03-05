import java.io.*;

public class BankAccount implements Serializable{
	int accNumber;
	String password;
	String name;
	int age;
	String address;
	String email;
	String phone;
	double balance;
	double intRate;
	boolean active;
	public void setAccNumber(int accNumber){
		this.accNumber = accNumber;
	}
	public int getAccNumber(){
		return accNumber;
	}
	public void setPassword(String password){
		this.password = password;
	}
	public String getPassword(){
		return password;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setAge(int age){
		this.age = age;
	}
	public int getAge(){
		return age;
	}
	public void setAddress(String address){
		this.address = address;
	}
	public String getAddress(){
		return address;
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
	public void setBalance(double balance){
		this.balance = balance;
	}
	public double getBalance(){
		return balance;
	}
	public void setIntRate(double intRate){
		this.intRate = intRate;
	}
	public double getIntRate(){
		return intRate;
	}
	public void setActive(boolean active){
		this.active = active;
	}
	public boolean isActive(){
		return active;
	}
	
	public BankAccount(){
		
	}
	public BankAccount(int accNumber,String password,String name,int age,String address,String email,String phone,double balance,double intRate,boolean active){
		this.accNumber = accNumber;
		this.password = password;
		this.name = name;
		this.age = age;
		this.address = address;
		this.email = email;
		this.phone = phone;
		this.balance = balance;
		this.intRate = intRate;
		this.active = active;
	}
}