public class Num{
	public static void main(String[] args){
		
		//Showing: 1 2 3 4 5 6 7 8 9 10
		for(int i=1; i<=10; i++){
		System.out.print(" "+i);
		}
		System.out.println("");
		
		//Showing: 0 2 4 6 8 10 12 14 16 18 20
		for(int i=0; i<=20; i=i+2){
		System.out.print(" "+i);
		}
		System.out.println("");
		
		//Showing: 0 3 6 9 12 15 18 21
		for(int i=0; i<=21; i=i+3){
		System.out.print(" "+i);
		}
		System.out.println("");
		
		//Showing: 1 2 4 8 16 32 64 128 256
		for(int i=1; i<=256; i=i+i){
		System.out.print(" "+i);
		}
		System.out.println("");
		
		//Showing: 1 3 5 9 17 33 65 129 257
		int a = 1;
		for(int i=1; i<=257; i=i*2){
			a = i;
			if(a==1){
				System.out.print(a);
				System.out.print(" ");
			}else{
				System.out.print(a+1);
				System.out.print(" ");
			}
		}
	}
}