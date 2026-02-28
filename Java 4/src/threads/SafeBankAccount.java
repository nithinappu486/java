package threads;

public class SafeBankAccount {
    int balance =1000;
    synchronized void withdraw(int amount){
        balance-=amount;
    }

    public static void main(String[] args)throws Exception {
        BankAccount acc=new BankAccount();
        Thread t1=new Thread(()->acc.withdraw(500));
        Thread t2=new Thread(()->acc.withdraw(500));
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("final balance:"+acc.balance);

    }
}
// code explanation
//:The synchronized keyword ensures that only one thread can execute withdraw()operation at a time
//perventing race condition and ensuring correct balance deduction.
//📌points to remember
//:synchronisation avoids race condition
//:locks critical section in an application
//:slower but safe
//:essential for shared resources
