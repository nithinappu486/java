import java.awt.*;
import java.io.IOException;

public class CheckException {
    static void readfile()throws IOException {
        throw new IOException("file not found");
    }

    public static void main(String[]args) {
        try {
            display();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
static void display()throws IOException{
        readfile();
   }
}
