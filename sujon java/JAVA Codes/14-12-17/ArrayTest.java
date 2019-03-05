//Enhance loop
public class ArrayTest{
	public static void main(String[] args){
		int myArray[] = new int[10];
		myArray[0] = 5;
		myArray[1] = 9;
		myArray[2] = 3;
		myArray[3] = 7;
		myArray[4] = 2;
		myArray[5] = 1;
		myArray[6] = 10;
		myArray[7] = 50;
		myArray[8] = 15;
		myArray[9] = 25;
		
		for(int e: myArray){
			System.out.println(e);
		}
	}
}