package threads;

public class FoodOrder extends Thread {
String task;
FoodOrder(String task){
    this.task=task;
}
public void run(){
    System.out.println(task+"started");
  }

    public static void main(String[] args) {
        FoodOrder cooking=new FoodOrder("cooking");
        FoodOrder packing=new FoodOrder("packing");
        FoodOrder delivery=new FoodOrder("delivery");
        cooking.start();
        packing.start();
        delivery.start();

    }
}
