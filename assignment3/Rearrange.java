package module6;

public class Rearrange {
    public static void main(String[] args) {
        int[] arr = {3,6,12,1,5,8};
        int[] result = new int[arr.length];

        int even = 0;
        int odd = 1;

        for(int x : arr){
            if(x%2==0){
                result[even] = x;
                even += 2;
            }else{
                result[odd] = x;
                odd += 2;
            }
        }

        for(int x : result)
            System.out.print(x+" ");
    }
}
