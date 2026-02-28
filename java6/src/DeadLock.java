public class DeadLock {
    static final Object accountA = new Object();
    static final Object accountB = new Object();

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            synchronized (accountA) {
                System.out.println("Thread 1 locked Account A");
                try {
                    Thread.sleep(2000);
                }catch (Exception e){}
                synchronized (accountB) {
                    System.out.println("Thread 2 locked Account B");
                }
            }
        });
        Thread t2 = new Thread(() -> {
            synchronized (accountB) {
                System.out.println("Thread 2 locked Account B");
                try {
                    Thread.sleep(2000);
                }catch (Exception e){}
                synchronized (accountA) {
                    System.out.println("Thread 1 locked Account A");
                }
            }
        });
        t1.start();
        t2.start();
    }
}
//Thread -1 acquires a lock on amount A and then sleep ,giving
//Thread-2 to acquire a lock on ammount B.now,Thread-1  Waits for
//account A&thead 2 waits for account b.since neither thread
//releases the lock both keep waiting & thus creating a DeadLock🔏
//📌deadlock explanation :deadlock ocures when each thread is hoilday
//a source & waiting for the other to release it,