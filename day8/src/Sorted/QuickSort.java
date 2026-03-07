package Sorted;

import java.util.Arrays;

public class QuickSort {
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int partitionindex(int[] arr, int s, int e) {
        int pivot = arr[s];
        int count = 0;
        for (int i = s + 1; i <= e; i++) {
            if (arr[i] < pivot) {
                count++;
            }
        }
        int pivotindex = s + count;
        swap(arr, pivotindex, s);
        int i = s, j = e;
        while (i < pivotindex && j > pivotindex) {
            while (arr[i] < pivot) {
                i++;
            }
            while (arr[j] > pivot) {
                j--;
            }
            if (i < pivotindex && j > pivotindex) {
                swap(arr, i++, j--);
            }
        }
        return pivotindex;
    }

    public static void quicksort(int[] arr, int s, int e) {
        if (s >= e) {
            return;
        }
        int p = partitionindex(arr, s, e);
        quicksort(arr, s, p - 1);
        quicksort(arr, p+1,e);
    }

    public static void main(String[] args) {
        int[] arr = {8, 4, 7, 3, 10, 2, 6};
        int n = arr.length;
        quicksort(arr, 0, n - 1);


        System.out.println(Arrays.toString(arr));
    }
}
