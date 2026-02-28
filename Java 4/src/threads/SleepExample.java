package threads;

public class SleepExample {
    public static void main(String[] args)  throws InterruptedException{
        System.out.println("printing 0-9");
        for(int i=0;i<10;i++){
            System.out.println("printed:"+i);
            Thread.sleep(2000);
        }
        System.out.println("done");
    }
}
//here,the thread is paused for a fixed duration of time.
//the thread doesn't lock anything and resumes after the given time.
