import java.util.*;

public class reverse_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to reverse it");
        int num = sc.nextInt();

        int x=0;
        int y=0;
        for(int i =num; i>0;i=i/10){
            x=i%10;
            y=y*10+x;

        }
    System.out.println("The reversed number is " + y);
    }
}
