import java.util.*;

public class palindrome {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number to check it is palindrome or not : ");
        int num = sc.nextInt();
        int x;
        int y = 0;  
        for (int i = num; i > 0; i = i / 10) {
            x = i % 10;
            y = y * 10 + x;
        }
        if (num == y)
            System.out.println("num is palindrome");
        else
            System.out.println("number is not palindrome");
            
        sc.close();

}

}
