public class employee {
    String name;
    int id;
    double salary;
    employee(String name,int id,double salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
    }
    void display(){
        System.out.println("employee name:"+name);
         System.out.println("employee id:"+id);
          System.out.println("employee salary:"+salary);   
    }
    public static void main(String[] args) {
        employee ob=new employee("shashi",20,10000);
        ob.display();
    }

    
}
