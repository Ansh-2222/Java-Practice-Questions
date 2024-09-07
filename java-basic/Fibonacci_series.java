import java.util.*;

public class a7 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.err.println("Enter the number how much Fibonacci series you want to print");
        int num = sc.nextInt();

        int a = 0;
        int b = 1;
        System.err.println(a);
        int c;
        for (int i = 0; i < num; i++) {
            c = a + b;
            System.err.println(c);
            a = b;
            b = c;

        }
        sc.close();
}
}
