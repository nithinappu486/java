package Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void selectionsort(int[]arr){
        for (int i=0;i<arr.length-1;i++){
            int minindex=i;
            for (int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[minindex]){
                    minindex=j;
                }
            }
            if(minindex!=i){
                int temp=arr[i];
                arr[i]=arr[minindex];
                arr[minindex]=temp;
            }
        }
    }

    public static void main(String[] args) {
        int[]arr={5,3,6,8,9,2,0};
        System.out.println(Arrays.toString(arr));
        selectionsort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
