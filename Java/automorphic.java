import java.util.*;

public class automorphic {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number=");
        int n=sc.nextInt();
        int square=n*n;
        int temp=n;
        while( temp > 0){
            if( temp % 10 !=square%10){
                System.out.print(n+"is not an automorphic number");
                return;
            }
            temp/=10;
            square/=10;
        }
        System.out.print(n+"is an automorphic number");

    }
    
}
