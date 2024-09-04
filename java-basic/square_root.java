import java.util.*;

public class square_root {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want the square root of:");
        int num = sc.nextInt();
        int count = 0;

        for (int i = 1; i <= num; i = i + 2) {
            num = num - i;
            count++;
        }

        if (num == 0) {
            System.out.println("The square root of your number is " + count);

        }

        else {
            System.out.println("The nunber you entered is not a perfect square");
        }

    }

}
