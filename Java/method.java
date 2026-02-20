import java.util.Scanner;

public class method {
    int factoria(int d){
        int fact=1;
        for(int i=1; i<= d;i++){
            fact = fact * i;
        }
        return fact;
    }

    boolean isStrong(int n){//n=145
        int temp=n;
        int sum=0;
        while(n!=0){
            int d=n%10;
            sum=sum+factoria(d);
            n = n/ 10;
        }
        if(sum ==temp){
            return true;
        } else {
            return false;
        }
    } 
    public static void main(String[] args) {
        method ob = new method();
        Scanner ob1=new Scanner(System.in);
        System.out.print("enter a no");
        int n=ob1.nextInt();
        if(ob.isStrong(n)){
            System.out.print("strong no");
        }
        else{
            System.out.print("not");
        }
    }
}
    