package Queue;

import java.util.HashSet;
import java.util.Set;

public class EmailNotification {
    public static void main(String[] args) {
        Set<String>emailQueue=new HashSet<>();
        emailQueue.add("@nithin");
        emailQueue.add("@nandan");
        emailQueue.add("@suni");
        emailQueue.add("@akash");
        System.out.println("emails to end:"+emailQueue);
    }
}
