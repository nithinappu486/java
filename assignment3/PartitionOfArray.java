package module6;

public class PartitionOfArray {
    public static void main(String[] args) {
        int[] arr = {1,-5,4,-9,-3};

        int j = 0;

        for(int i=0;i<arr.length;i++){
            if(arr[i] < 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }

        for(int x: arr)
            System.out.print(x+" ");
    }
}
