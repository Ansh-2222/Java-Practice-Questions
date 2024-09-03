import java.util.*;

public class prime_number {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check prime or not");
        int num = sc.nextInt();
        int p = 0;
        for (int i = 1; i <= num; i++) {

            if (num % i == 0)
                p++;

        }
        if (p > 2) {
            System.out.println("number is not prime");
        } else {
            System.out.println("number is   prime");
        }

   sc.close();
    }
}
