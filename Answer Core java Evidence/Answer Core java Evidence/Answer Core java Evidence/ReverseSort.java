

public class ReverseSort{
    public static void main(String[] args) {
        int k, a[][] = {{4, 1, 3, 7, 5}, {8, 3, 2, 9, 21}, {10, 15, 7, 6, 2}};
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                for (int m = j + 1; m < a[i].length; m++) {
                    if (a[i][j] < a[i][m]) {
                        k = a[i][m];
                        a[i][m] = a[i][j];
                        a[i][j] = k;
                    }
                }
                System.out.print(a[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
