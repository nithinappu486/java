package module7;

public class FirstAndLastBinary {
    public static int firstOcc(int []arr,int key){
        int s=0;
        int e=arr.length-1;
        int ans=-1;
        while (s<=e){
            int mid=s+(e-s)/2;
            if(arr[mid]==key){
                //store the index and move to the extreame left for the first occ
                ans=mid;
                e=mid-1;
            } else if (arr[mid]<key) {
                s=mid+1;
            }else{
                e=mid-1;
            }
        }
        return ans;
    }
    public static int lastOcc(int []arr,int key){
        int s=0;
        int e=arr.length-1;
        int ans=-1;
        while (s<=e){
            int mid=s+(e-s)/2;
            if(arr[mid]==key){

                ans=mid;
                e=mid-1;
            } else if (arr[mid]<key) {
                s=mid+1;
            }else{
                e=mid-1;
            }
        }
        return ans;

    }
    public static int totalOcc(int []arr,int key){
        int fo=firstOcc(arr,key);
        int lo=lastOcc(arr, key);
        return lo-fo+1;
    }

    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6};
        int f=firstOcc(arr,3);
        int l=lastOcc(arr,3);
        int t=totalOcc(arr,3);
        System.out.println("first Occurrence index " + f);
        System.out.println("last Occurrence index " + l);
        System.out.println("total Occurrence index " + t);

    }
}
