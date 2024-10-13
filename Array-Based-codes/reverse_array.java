import java.util.*;

public class reverse_array {
public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter size of array");
    int num = sc.nextInt();
    System.out.println("Enter number to store in array");

    int[] arr = new int[num];
    for (int i = 0; i < num; i++) {
        arr[i] = sc.nextInt();
    }
    System.out.println("The array is ");
    for (int i = 0; i < num; i++) {
        System.out.print(arr[i] + " ");
    }

     

    for (int i = 0, a = num - 1; i < a; a--, i++) {
        int temp =arr[i];
        arr[i]=arr[a];
        arr[a] = temp;


    }
    
    System.out.println("\nThe reverse array is array is ");
    for (int i = 0; i < num; i++) {
        System.out.print(arr[i] + " ");
    }

}    
}
