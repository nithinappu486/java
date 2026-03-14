class Nodes{
    int data;
    Nodes next;
    Nodes(int data){
        this.data=data;
    }
}

public class MiddleOffLinkedList {
    static int findMiddle(Nodes head){
        Nodes slow=head;
        Nodes fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow.data;
    }

    public static void main(String[] args) {
        Nodes head1=new Nodes(1);
        head1.next=new Nodes(2);
        head1.next.next=new Nodes(8);
        head1.next.next.next=new Nodes(4);
        head1.next.next.next.next=new Nodes(5);
        System.out.println("Middle Node data:"+findMiddle(head1));
        Nodes  head2= new Nodes(1);
        head2.next=new Nodes(2);
        head2.next.next=new Nodes(3);
        head2.next.next.next=new Nodes(4);
        head2.next.next.next.next=new Nodes(5);
        System.out.println("Middle Node data:"+findMiddle(head2));
    }
}