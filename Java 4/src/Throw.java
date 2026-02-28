import com.sun.org.apache.bcel.internal.generic.ATHROW;

public class Throw {
     static void test()throws Throwable {
         throw new Throwable("somthing went wrong");

    }

    public static void main(String[] args) {
        try{
            test();
        }catch (Throwable t){
            System.out.println("handles:"+t);
            System.out.println("handles:"+t.getMessage());
        }
    }
}
