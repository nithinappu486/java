package module7;

import java.util.Arrays;

public class BubbleSort {
    public static void bubbleSort(int[]arr){
        int n=arr.length;
        for(int i=1;i<n;i++){
            for(int j=0;j<n-1;j++){
                if(arr[j]>arr[j+1]){
                    //swap arr[j] and arr[j+1]
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void main(String[] args){
        int []arr={9,3,5,7,6};
        System.out.println(Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
//time complexity of BUBBLE SORT IS:O(n2)