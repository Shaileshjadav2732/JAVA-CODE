import java.util.*;

class sorting {
    public static void printarray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 6, 26, 27, 12, 3 };


        // Time complexity =O(n^2)
        // bubble sort
        // for (int i = 0; i < arr.length - 1; i++) {
        // for (int j = 0; j < arr.length - i - 1; j++) {
        // if (arr[j] > arr[j + 1]) {
        // int temp = arr[j];
        // arr[j] = arr[j + 1];
        // arr[j + 1] = temp;

        // }
        // }
        // }



        // Time complexity =O(n^2)
        // sellection sort
        // for (int i = 0; i < arr.length; i++) {
        // int smallest = i;
        // for (int j = i + 1; j < arr.length; j++) {
        // if (arr[smallest] > arr[j]) {
        // smallest = j;
        // }
        // }
        // int temp = arr[smallest];
        // arr[smallest] = arr[i];
        // arr[i] = temp;

        // }


        // insertion sort
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i -1;
            while (j >= 0 && current < arr[j]) {
                arr[j + 1] = arr[j];
                j--;

            }
            // placement
            arr[j + 1] = current;
        }
        printarray(arr);
    }
}