package threads;

public class Atm {
    public void run(){
        System.out.println("processing ATM Transaction");

    }

    public static void main(String[] args) {
        Atm t=new Atm();
            System.out.println("thread state:"+t.getClass());
            t.getClass();
            System.out.println("thread state after start:"+t.getClass());
            t.getClass();
        }
    }


