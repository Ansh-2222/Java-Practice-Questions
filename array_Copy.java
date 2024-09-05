import java.util.*;

public class array_Copy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] arr1=new int[]{1,2,3,4,5};
        int [] arr2=new int[arr1.length];

        for(int i=0;i<arr1.length;i++){

            arr2[i]=arr1[i];
        }
System.out.println("After coping Array 2 is");
        for(int i=0;i<arr1.length;i++){

            System.out.print(arr2[i]+" ");
        }

    }
}
