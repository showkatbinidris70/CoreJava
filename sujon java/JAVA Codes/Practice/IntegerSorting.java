import java.util.*;
public class IntegerSorting{
	public static void main(String[] args){
		int[][] a = {
						{1,8,6,9,4},
						{10,32,54,81,12},
						{30,21,50,45,60},
						{90,58,36,51,13},
						{88,41,27,55,39}
					};
					
		for(int i=0; i<a.length; i++){
			Arrays.sort(a[i]);
			for(int j=0; j<a[i].length; j++){
				System.out.print(" "+a[i][j]);
			}
			System.out.println();
		}
	}
}