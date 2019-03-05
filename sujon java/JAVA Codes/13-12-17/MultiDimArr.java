public class MultiDimArr{
	public static void main(String[] args){
		
		int[] m = new int[3];
		m[0] = 1;
		m[1] = 2;
		m[2] = 3;
		int[] n = new int[3];
		n[0] = 4;
		n[1] = 5;
		n[2] = 6;
		
		int[][] twoDim = new int [4][];
		twoDim[0] = m;
		twoDim[1] = n;
		
		System.out.println(twoDim[1][1]);
	}
}