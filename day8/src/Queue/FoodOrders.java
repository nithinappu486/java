package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class FoodOrders {
    public static void main(String[] args) {
        Queue<String>orders=new LinkedList<>();
        orders.add("order1");
        orders.offer("order2");
        System.out.println("orders"+orders);
        System.out.println("serving"+orders.poll());
        System.out.println("panding"+orders);
    }
}
