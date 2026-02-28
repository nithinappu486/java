package Arrays;
//varargs
public class E6 {
    public static void display(int[]arr){
        for(int num:arr){
            System.out.print(num);
        }
    }

    public static void main(String[] args) {
        int[]arr={1,2,3,4,5};
        display(arr);
    }
}
