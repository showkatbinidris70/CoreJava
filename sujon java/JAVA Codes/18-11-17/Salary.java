public class Salary{
	public static int Rahim = 25000;
	public static int Karim = 20000;
	public static void main(String[] agrs){
		int s = Rahim - Karim;
		int r = s*100/Rahim;
		System.out.println("Rahim gets "+Rahim+"TK.");
		System.out.println("Karim gets "+Karim+"TK.");
		System.out.println("Rahim get " + r + "% more salary than Karim.");
	}
}