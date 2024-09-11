
    import java.util.*;

public class largest_inarrray {
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
        System.out.println("\nThe largest number in array is  ");
         
         int l=arr[0];

        for (int i = 0; i < num; i++) {
            if (arr[i] > l) {
               l=arr[i]  ;
            }
            
        }
         System.out.println(l +" is largest");

    }
}


