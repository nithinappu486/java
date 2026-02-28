package LocalInnerClass;

import java.time.LocalDate;

public class Exam {
    void evaluate(int marks){
        class GradeCalculator{
            String calculate(){
                if(marks>=75)return "Distinction";
                else if (marks>=60)return "first class";
                else return "pass";
            }
        }
        GradeCalculator gc=new GradeCalculator();
        System.out.println(gc.calculate());
    }
    void displayExamdate(){
        LocalDate date=LocalDate.now().plusDays(5);
        System.out.println("the exam date:" + date);
    }

    public static void main(String[] args) {
        Exam exam=new Exam();
        exam.evaluate(67);
        exam.evaluate(89);
        exam.displayExamdate();
    }
}
/*
Points to remember
Grade logic is scoped to the "evaluate" method
It avoids polluting the class with the helper methods
It helps inn designing the codebase in a cleaner way
 */