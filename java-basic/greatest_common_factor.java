import java.util.*;

public class greatest_common_factor {
public static void main(String[] args) {
    
    Scanner sc= new Scanner(System.in);
    System.err.println("Enter two number to find Greatest Common Divisor");
    int a=sc.nextInt();
    int b=sc.nextInt();

     
while (b!=0) 
{
    int r = a%b;
    a=b;
    b=r;
    
}
System.out.println("The GCD is " + a);

     

    sc.close();
}    
}
