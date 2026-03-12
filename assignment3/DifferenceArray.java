package module6;

public class DifferenceArray {
    public static void main(String[] args) {
        int n = 5;
        int[] diff = new int[n];

        int l = 1;
        int r = 3;
        int val = 5;

        diff[l] += val;
        if(r+1<n)
            diff[r+1] -= val;

        for(int i=1;i<n;i++){
            diff[i] += diff[i-1];
        }

        for(int x: diff)
            System.out.print(x+" ");
    }
}
