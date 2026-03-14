package Linear;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryNumbergenerater {
    public static void generateBinaryNumbers1toN(int N){
        Queue<String> q =new LinkedList<>();
        q.offer("1");
        while (N --> 0){
            String curr =q.poll(); // Print the latest
            System.out.print(curr +" "); // Concatenate 0 & push to queue
            q.offer(curr + "0");
            q.offer(curr + "1");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int N=5;
        generateBinaryNumbers1toN(N);
        generateBinaryNumbers1toN(6);
    }

}

