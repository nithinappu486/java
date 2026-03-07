package Sorted;

import java.util.Arrays;

public class MergeTwoSorted {
    public static void main(String[] args) {
        int[]array1={1,3,5,7,9};
        int[]array2={2,4,6};
        int[]merge=MergeTwoSorted(array1,array2);
        System.out.println("merge array:"+ Arrays.toString(merge));
    }
    public static int[]MergeTwoSorted(int[]arr1,int[]arr2){
        int n1=arr1.length;
        int n2=arr2.length;
        int[]merge=new int[n1+n2];
        int i=0,j=0,k=0;
        while (i<n1&&j<n2){
            if(arr1[i]<arr2[j]){
                merge[k++]=arr1[i++];
            }else {
                merge[k++]=arr2[j++];
            }
        }
        while (i<n2){
            merge[k++]=arr1[i++];
        }
        while (j<n2){
            merge[k++]=arr2[j++];
        }
        return merge;
        }
}