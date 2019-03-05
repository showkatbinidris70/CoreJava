package Array;

public class PrintarraySum {

    public static void main(String[] args) {
        int[] arr = {4, 2, 1, 8, 9, 14, 45, 21, 37};
        int sum = 0;
        for (int i : arr) {
            sum += i;
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Sum: " + sum);
    }
}
