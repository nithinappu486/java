package threads;

public class ResultDeclare {
    synchronized void declareResult()throws Exception{
        System.out.println("waiting for approval..");
        wait();
        System.out.println("result declare");
    }
    synchronized void approve(){
        notify();
    }

    public static void main(String[] args) throws Exception{
      ResultDeclare rd=new ResultDeclare();
      new Thread(
              ()->{
                  try {
                      rd.declareResult();
                  } catch (Exception e) {}
              }).start();
      Thread.sleep(2000);
      new Thread(()->
          rd.approve()).start();
    }
}
//the declareresult()method waits until another thread calls.
//modify() during wait(),the thread release the lovk,allowing other threads to enter the synchronized code.
//✅point to rember:
// ✅sleep()->time based
// ✅wait()->condition based
//✅wait->release lock
// ✅wait() is used in inter-thread communication
//📌 order-placed->preparing->prepared->delivering-delivered