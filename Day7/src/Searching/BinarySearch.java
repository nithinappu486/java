package Searching;

import java.util.Arrays;

public class BinarySearch {
    static int BinarySearch(int[]arr,int key){
        int s=0;
        int e=arr.length-1;
        while (s<e){
            int mid=s+(e-s)/2;
            if(arr[mid]==key){
                return  mid;
            }else if(arr[mid]<key){
                s=mid+1;
            }else {
                e=mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[]arr={2,4,6,8,9,12};
        int key=9;
        int index=BinarySearch(arr,key);
        if (index!=-1){
            System.out.println(key+"is present at index"+index+"in the array:"+ Arrays.toString(arr));
        }else {
            System.out.println(key+"is not present in the array:"+Arrays.toString(arr));
        }
    }
}
