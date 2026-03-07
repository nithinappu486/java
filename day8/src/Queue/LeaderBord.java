package Queue;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class LeaderBord {
    public static void main(String[] args) {
        Set<Integer> scores=new TreeSet<>(Collections.reverseOrder());
        // Normally Ascending Order
        scores.add(450);
        scores.add(200);
        scores.add(10);
        scores.add(500);
        System.out.println("leader board stats:"+scores);
    }
}

