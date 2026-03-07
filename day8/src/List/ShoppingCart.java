package List;

import java.util.*;

public class ShoppingCart {
    public static void main(String[] args) {
        List<String>cart=new ArrayList<>();
        cart.add("laptop");
        cart.add("mouse");
        cart.add("cpu");
        cart.remove("mouse");
        cart.set(1,"mechanical keybord");
        System.out.println("cart items:"+cart);
        System.out.println("total items:"+cart.size());
    }
}
