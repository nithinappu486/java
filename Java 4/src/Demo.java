public class Demo {
    public static void main(String[] args) {
        try{
            int balance=1000;
            int withdraw=5000;
            if(withdraw>balance){
                throw new ArithmeticException("Insufficient funds");
            }
            System.out.println("withdraw succesfull");
        }catch (ArithmeticException e){
            System.out.println("caught exception"+e.getMessage());
        }
    }
}
