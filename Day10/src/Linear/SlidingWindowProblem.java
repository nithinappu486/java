package Linear;

public class SlidingWindowProblem {
    public static void main(String[] args) {
        /*
        total Windows Formula:n-k+1=8-3+1
        total windows =Total length- windowssize+1
         */
        int[] arr={1,3,-1,-3,5,3,6,7};
        int k=3;
        for(int i=0;i<=arr.length-k;i++){ // 0 to 8-3 = 5 total 6 window are there (Number of windows is formula length-k)
            int max=arr[i];
            for(int j=0;j<i+k;j++){
                if(arr[j]>max){
                    max=arr[j];
                }
            }
            System.out.print(max+" ");
        }
    }
}

