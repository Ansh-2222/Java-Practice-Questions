
public class frequency_ofnumber_inarray {

    public static void main(String[] args) {

        int arr[] = new int[] { 1, 2, 5, 2, 2, 3, 1 };
        int arr2[] = new int[7];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length; j++) {

                if (arr[i] == arr[j]) {
                    count++;
                    arr2[i] = -1;
                }

            }
            arr2[i] = count;
            count = 0;
        }
        System.out.println("The frquency of array number is array 1 numbers are  ");

        for (int i = 0; i < 3; i++) {

            System.out.println(arr2[i] + " ");
        }

    }
}
