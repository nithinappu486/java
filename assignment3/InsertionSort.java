package module7;

import java.util.Arrays;

public class InsertionSort {
    public static void insertionSort(int[]arr){
        for(int i=0;i< arr.length;i++){
            int temp=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>temp){
                //shift operation
                arr[j+1]=arr[j];
                j--;//empty space()
            }
            arr[j+1]=temp;//fill the space[]with the temp variable
        }
    }

    public static void main(String[] args) {
        int[]arr={6,4,3,-1,7,9,0};
        System.out.println(Arrays.toString(arr));
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
/*Advantages
Very fast for nearly sorted data
Best case time complexity
Simple to implement
In-place sorting
Stable Sort
 */