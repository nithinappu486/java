package Collection;

import java.util.ArrayList;
import java.util.Collection;

public class LiveOrders {
    public static void main(String[] args) {
        Collection<String>liveOrders=new ArrayList<>();
        liveOrders.add("ord101");
        liveOrders.add("ord102");
        liveOrders.add("ord103");
        System.out.println("ord103 exists?"+liveOrders.contains("ord103"));
        System.out.println("live orders:"+liveOrders);
        liveOrders.clear();
        System.out.println("orders after closing:"+liveOrders);

    }
}
