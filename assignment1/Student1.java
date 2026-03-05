package Assignment1;

public class Student1
{
    int rollNo;
    String name;
    Student1()
    {
        rollNo = 0;
        name = "Not Assigned";
    }
    Student1(int r, String n)
    {
        rollNo = r;
        name = n;
    }
    void display()
    {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println();
    }


    public static void main(String[] args)
    {
        Student1 s1 = new Student1();
        Student1 s2 = new Student1(101, "Vivek");
        s1.display();
        s2.display();
    }
}
