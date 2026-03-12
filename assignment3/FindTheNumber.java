package module6;

public class FindTheNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,7};
        int n = 7;

        int sum = n*(n+1)/2;
        int arrSum = 0;

        for(int x: arr)
            arrSum += x;

        System.out.println(sum-arrSum);
    }
}
