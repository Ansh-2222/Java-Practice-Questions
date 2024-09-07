import java.util.*;

public class swap_by_BitwiseOperator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers :");
        int  a = sc.nextInt();
        int  b = sc.nextInt();
        System.out.println("a ="+a);
        System.out.println("b =" + b);

        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("After swap \n" +"a= "+ a +"\n" + "b="+ b);


        


        

       sc.close();
 }

}
