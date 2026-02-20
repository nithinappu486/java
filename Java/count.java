public class count {
    static int count=0;
    int id;
    count(){
        count++;
        id=count;
        System.out.println("object id:"+id);
    }
    public static void main(String[] args) {
        count c1=new count();
        count c2=new count();
        count c3=new count();


    }

    
}
