public class Trim{
	public static void main(String[] args){
		String s1 = "Dhaka ";
		String s2 = "Bangladesh ";
		String s3 = s1.trim();
		String s4 = s3.concat(s2);
		System.out.println(s4);
	}
}