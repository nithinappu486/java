package Arrayproblem;

public class MajorityElement {
    public static void main(String[] args) {
        int[]arr={2,2,1,1,2,2,2};
        int count=0;
        int can=0;
        for (int i=0;i<arr.length;i++){
            if(count==0){
                can=arr[i];
            }
            if (arr[i]==can) {
                count++;
            }else {
                count--;
            }
        }
        System.out.println("majority element:"+can);
    }
}
