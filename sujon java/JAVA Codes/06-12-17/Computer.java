public class Computer{
	String brand;
	String model;
	int cNum;
	double price;
	double discount;
	double vat;
	double totalPrice;
	String color;
	String ram;
	boolean ups;
	boolean ok;
	
	public void setBrand(String brand){
		this.brand = brand;
	}
	public String getBrand(){
		return brand;
	}
	public void setModel(String model){
		this.model = model;
	}
	public String getModel(){
		return model;
	}
	public void setCNum(int cNum){
		this.cNum = cNum;
	}
	public int getCNum(){
		return cNum;
	}
	public void setPrice(double price){
		this.price = price;
	}
	public double getPrice(){
		return price;
	}
	public void setDiscount(double discount){
		this.discount = discount;
	}
	public double getDiscount(){
		return discount;
	}
	public void setVat(double vat){
		this.vat = vat;
	}
	public double getVat(){
		return vat;
	}
	public void setTotalPrice(double totalPrice){
		this.totalPrice = totalPrice;
	}
	public double getTotalPrice(){
		return totalPrice;
	}
	public void setColor(String color){
		this.color = color;
	}
	public String getColor(){
		return color;
	}
	public void setRam(String ram){
		this.ram = ram;
	}
	public String getRam(){
		return ram;
	}
	public void setUps(boolean ups){
		this.ups = ups;
	}
	public boolean isUps(){
		return ups;
	}
	public void setOk(boolean ok){
		this.ok = ok;
	}
	public boolean isOk(){
		return ok;
	}
	
	public Computer(){
	}
	public Computer(String brand){
		this.brand = brand;
	}
	public Computer(String brand, String model){
		this.brand = brand;
		this.model = model;
	}
	public Computer(String brand, String model, int cNum, double price, double discount, double vat, double totalPrice, String color, String ram, boolean ups, boolean ok){
		this.brand = brand;
		this.model = model;
		this.cNum = cNum;
		this.price = price;
		this.discount = discount;
		this.vat = vat;
		this.totalPrice = totalPrice;
		this.color = color;
		this.ram = ram;
		this.ups = ups;
		this.ok = ok;
	}
	public String greeting(){
		String s = "Good Morning!";
		return s;
	}
}