public class Dist{
	public static void main(String[] args){
		
		String[] dlist = new String[3];
		dlist[0] = "Satkhira";
		dlist[1] = "Khulna";
		dlist[2] = "Bagerhat";
		
		String[] dlist2 = new String[3];
		dlist2[0] = "Pabna";
		dlist2[1] = "Gazipur";
		dlist2[2] = "Narsingdi";
		
		String[][] twoArr = new String[2][];
		twoArr[0] = dlist;
		twoArr[1] = dlist2;
		
		System.out.println(twoArr[0][1]);
	}
}