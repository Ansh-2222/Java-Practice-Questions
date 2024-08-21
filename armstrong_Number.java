import java.util.*;

public class armstrong_Number {
    public static void main(String arg[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to check it is Armstrong or not");
        int num = sc.nextInt();
        int digit=0;
        int x = 0;
        int sum = 0;
        for (int i = num; i > 0; i = i / 10) {
            x=i%10;
            digit++;
        }

        for (int i = num; i > 0; i = i / 10) {
            x = i % 10;
            sum += Math.pow(x, digit);
        }
        System.out.println(sum);
        if (num == sum)
            System.out.println("number is Armstrong ");
        else
            System.out.println("number is not armstrong");

    }
}
