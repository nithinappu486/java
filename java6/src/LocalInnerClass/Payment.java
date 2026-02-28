package LocalInnerClass;

public interface Payment {
    void pay();
}
class PaymentDemo{
    public static void main(String[] args) {
        Payment p=new Payment() {
            public void pay(){
                System.out.println("payment done using cridet card.");
            }
        };
        p.pay();
        Payment p1=()->System.out.println("cash payment");
    }
}
/*
:point to remember:
=one time implementation
=no need to create separate class
=it is used in events&callback functions
 */
