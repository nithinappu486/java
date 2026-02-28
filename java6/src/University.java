public class University {
    static class admission{
        static boolean isEligible(int marks){
            return marks>=60;
        }
    }

    public static void main(String[] args) {
        boolean result=University.admission.isEligible(45);
        System.out.println(result);
        boolean result2=University.admission.isEligible(65);
        System.out.println(result2);
    }
}
