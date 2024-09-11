import java.util.*;

public class linear_search {
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
        System.out.println("\nEnter number you want to search in the arrray ");
        int key = sc.nextInt();
        int found = 0;
        for (int i = 0; i < num; i++) {
            if (arr[i] == key) {
                System.out.println("Number Found   position : " + i);
                found++;
                break;
            }
        }
        if (found > 0) {
        }

        else {
            System.out.println("Not found");
        }

    }
}
