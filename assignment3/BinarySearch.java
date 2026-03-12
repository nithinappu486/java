package module7;

import java.util.Arrays;

public class BinarySearch {
    static int binarySearch(int[]arr,int key){
        int s=0;
        int e=arr.length-1;
        while(s<e){
            int mid=s+(e-s)/2;
            if(arr[mid]==key){
                return mid;
            } else if (arr[mid]<key) {
                s=mid+1;//go to the right to find the key
            }else{
                e=mid-1;//go to the left side to find the key
            }
        }
        return -1;//if the key wwas not found return the invalid index
    }

    public static void main(String[] args) {
        int []arr={23,54,78,34,31};
        int key=78;
        int index=binarySearch(arr,key);
        if(index !=-1){
            System.out.println(key+" is present at index " +index+ " in the array :"+ Arrays.toString(arr));
        }else{
            System.out.println(key+" is not present in the array "  +Arrays.toString(arr));
        }
    }
}