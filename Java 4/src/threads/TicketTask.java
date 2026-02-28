package threads;

public class TicketTask implements Runnable  {
    String task;
    TicketTask(String task){
        this.task=task;
    }
    public void run(){
        System.out.println(task+"in progress.");
    }

    public static void main(String[] args) {
      Thread t1=new Thread(new TicketTask("seat ass"));
        Thread t2=new Thread(new TicketTask("payment ass"));
        Thread t3=new Thread(new TicketTask("sma ass"));
        t1.start();
        t2.start();
        t3.start();

    }
}
/*
👌Each runnable objects is a job,and the thread class in responsible only for execuation,which makes this apporach cleaner&more flexible
 ✌️implements runnable
 ✌️better design
 ✌️interviwers mostly ask this
 ✌️supports multiple inheritance via interface

 */
