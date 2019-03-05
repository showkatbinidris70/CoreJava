public class Test2 implements Abc2{
	public int m1(){
		int x = 10;
		return x;
	}
	public String m2(){
		return "Bangladesh";
	}
	public void m3(){
		System.out.println("Dhaka");
	}
	public static void main(String[] args){
		Test2 t1 = new Test2();
		
		System.out.println(t1.m1());
		System.out.println(t1.m2());
		t1.m3();
	}
}