import javafx.concurrent.Task;

public class JoinProof {
    static class task extends Thread{
        public void run(){
            try{
                Thread.sleep(2000);
            }catch (Exception e){

            }System.out.println("task finished");
        }
    }

    public static void main(String[] args)throws InterruptedException {
        task t=new task();
        t.start();
        t.join();
        System.out.println("main thread resumes");
    }
}
