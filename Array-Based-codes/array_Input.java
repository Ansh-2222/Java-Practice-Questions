

import java.util.*;

public class array_Input {
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
            System.out.print(arr[i]+" ");
        }

    sc.close();
    }
}