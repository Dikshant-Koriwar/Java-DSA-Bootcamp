package Sorting;

import java.util.*;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = { 5, 4, 3, 2, 1 };
        sortFn(arr);
    }

    public static void sortFn(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

        }
        System.out.println(Arrays.toString(arr));
    }
}
