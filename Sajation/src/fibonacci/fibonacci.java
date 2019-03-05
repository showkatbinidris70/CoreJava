package fibonacci;

public class fibonacci {

    public static void main(String[] args) {

        int a = 0, b = 1, c = 0;
        System.out.println(a);
        System.out.println(b);
        int ctr = 0;

        while (ctr <= 100) {
            c = a + b;
            System.out.print( "  " + c);
            a = b;
            b = c;
            ctr++;
        }
    }
}
