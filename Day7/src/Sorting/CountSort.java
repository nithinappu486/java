package Sorting;

import sun.applet.Main;

import java.util.Arrays;

public class CountSort {
    public static void countsort(int[]arr) {
        int k = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > k) {
                k = arr[i];
            }
        }
        int[] count = new int[k + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        //step 4:calculate the cumulative fequency
        for (int i = 1; i <= k; i++) {
            count[i] += count[i - 1];
        }
        int[] output = new int[arr.length];
    for (int i=arr.length-1;i>=0;i--) {
        output[--count[arr[i]]] = arr[i];
    }
    //copy the output back to the input
        System.arraycopy(output,0,arr,0,arr.length);
    }

    public static void main(String[] args) {
        int[]arr={1,3,2,3,4,1,6,4,3};
        System.out.println(Arrays.toString(arr));
        countsort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
