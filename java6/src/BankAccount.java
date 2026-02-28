public class BankAccount {
    private double balance = 10000;
    //member inner class
    class Transaction{
        void withdraw(double amount){
            if(amount<=balance){
                balance-=amount;
                System.out.println("withdraw:"+amount);
            }else{
                System.out.println("insufficient funds.");
            }
        }
    }

    public static void main(String[] args) {
        BankAccount account=new BankAccount();
        //outer.inner in_object=out_object.new inner();
        BankAccount.Transaction tx=account.new Transaction();
        tx.withdraw(3000);
        tx.withdraw(2000);
        System.out.println(account.balance);
    }
}
//Points to remember
//transaction belongs to specific amount
//Direct access to the private variable balance
//Clean Encapsulation
// */
//*

