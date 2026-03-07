package Queue;
import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeExample {
    public static void main(String[] args) {
        Deque<String>actions =new ArrayDeque<>();
        actions.addLast("user types A");
        actions.addLast("user types B");
        actions.addLast("user Details B");
        System.out.println("undo :"+actions.removeLast());
        System.out.println("remaining actions:"+actions);

    }
}


