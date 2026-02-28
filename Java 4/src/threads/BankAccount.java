package threads;

public class BankAccount {
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
//both the threads t1&t2 access&modify the same balance variable
//simultameously.due to lack of synchronisation,the final balance becomes inconsistent
//📌points to remember
//⭐shared data causes issues
// ⭐execution order is umpredicate
// ⭐leads to data inconsistency
// ⭐nedd synchronisation to slove the race condition

