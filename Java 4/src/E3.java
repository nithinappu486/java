public class E3 {
    static void CheckAge(int age) {
        if (age >= 18) {
            System.out.println("eligible-access granted");
        } else {
            throw new RuntimeException("not eligible-access denied");
        }
    }

    public static void main(String[] args) {
        CheckAge(20);
    }
}

