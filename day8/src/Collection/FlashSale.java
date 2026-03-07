package Collection;

import java.util.ArrayList;
import java.util.Collection;

public class FlashSale {
    public static void main(String[] args) {
        Collection<Integer>orderIdes=new ArrayList<>();
        orderIdes.add(101);
        orderIdes.add(102);
        orderIdes.add(103);
        System.out.println("orders recived:"+orderIdes);
        System.out.println("no of orders:"+orderIdes.size());
    }
}
