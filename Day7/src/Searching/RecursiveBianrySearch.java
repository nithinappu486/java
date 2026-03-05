package Searching;

public class RecursiveBianrySearch {
    public static int recursivebianrysearch(int[]arr,int key,int s,int e){
        if(s>e)return -1;
        int mid=s+(e-s)/2;
        if(arr[mid]==key)return mid;
        else if(arr[mid]<key)
            return recursivebianrysearch(arr,key,mid+1,e);
        else
            return recursivebianrysearch(arr,key,s,mid-1);

    }

    public static void main(String[] args) {
        int[]arr={2,5,8,12,16,23,38,45};
        int key=23;
        int result=recursivebianrysearch(arr,key,0,arr.length-1);
        System.out.println("element"+key+" found at index:"+result);

    }
}
