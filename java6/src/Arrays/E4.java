package Arrays;

public class E4 {
    public static void PrintArray(int[]arr) {
        for(int num:arr){
            System.out.print(num+"");
        }
        System.out.println();
    }
    public static int[]createArray(){
        return  new int[]{10,20,30};
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        PrintArray(arr);
        int[] result = createArray();
        for (int num : result) {
            System.out.print(num + "");
        }
        System.out.println();
    }
}


