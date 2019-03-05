//package testr14.array;

public class MultidimentionArray {

    public static void main(String args[]) {

//declaring and initializing 2D array
        int arr1[][]= new int[3][];
        arr1[0] = new int[3];
        arr1[1] = new int[2];
        arr1[2] = new int[3];
        arr1[0][0]= 1;
        
        int arr[][] = {{1, 2, 3}, {2, 4}, {4, 4, 5}};

//printing 2D array
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
