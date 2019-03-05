public class Test implements Abc{
	public int m1(){
		return 5;
	}
	public static void main(String[] args){
		Test t1 = new Test();
		System.out.println(t1.m1());
	}
}