public class Abc{
	public static void main(String[] args){
		int pInt = 420;
		Integer wInt = new Integer(pInt); //boxing
		int p2 = wInt.intValue(); //unboxing
		
		System.out.println("Result of boxing : "+wInt);
		System.out.println("Result of unboxing : "+p2);
	}
}