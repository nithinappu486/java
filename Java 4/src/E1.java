import jdk.internal.dynalink.beans.StaticClass;

public class E1 {
    public static void main(String[] args) {
        int i, j, k = 0;
        i = 10;
        j = 10;
        try {
            k = i / j;
            int[] arr = {1, 2, 3, 4, 5};
            System.out.println(arr[9]);
//        } catch (ArithmeticException e) {
//            System.out.println(e);
//            e.printStackTrace();//details
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("invalid array index");
        } catch (Exception e) {
            System.out.println("something happend");
        }finally {
            System.out.println("start execution");
            System.out.println("FAAAAAAA");
            System.out.println("suni");
            System.out.println("master");

        }
    }
    static{
        System.out.println("start execution");
        System.out.println("loda bat");
        System.out.println("load files");
        System.out.println("load gadi");
    }
}