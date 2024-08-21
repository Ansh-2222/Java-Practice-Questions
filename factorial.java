import java.util.*;


public class factorial {
public static void main (String arg[]){

    Scanner sc =new Scanner(System.in);
    System.out.println("Enter the number to have factorial");
    int num =sc.nextInt();

    int f=1;

    for(int i = num ;i>=1;i--){
    f=f*i ;
     
}
    System.out.println(f);
}    
}
