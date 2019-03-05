public class TestComputer{
	public static void main(String[] args){
		Computer c1 = new Computer("SAMSUNG","S-101",10,34000.5,1000.6,3000.7,36000.5,"Black","4GB",true,true);
		Computer c2 = new Computer("ASUS","A-011",11,36000.8,1000.5,3000.9,38000.6,"Black","4GB",false,true);
		Computer c3 = new Computer("ACER","AC-610",12,31000.8,1000.6,3000.4,33000.8,"White","2GB",true,true);
		Computer c4 = new Computer("DELL","D-512",13,34000.4,1000.5,3000.8,36000.3,"Red","2GB",true,false);
		Computer c5 = new Computer("DELL","R-305");
		Computer c6 = new Computer("DELL","D-512",14,34000.8,1000.2,3000.5,36000.6,"Red","2GB",true,false);
		
		System.out.println("Brand name: "+c1.brand);
		System.out.println("Total price: "+c2.totalPrice);
		System.out.println("Model: "+c3.model);
		System.out.println("UPS Support: "+c4.ups);
		System.out.println("Model: "+c5.model);
		System.out.println("Color: "+c6.color);
	}
}