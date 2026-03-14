package LinkedList;
class LL{
    Node head;
    private int size;
    LL(){
        size=0;
    }
    public class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;//we dont know the address of the next node
            size++;//Increment the size as soon as a node is created
        }
    }
    public void printList(){
        Node curr=head;
        while(curr !=null){
            System.out.print(curr.data+" -> ");
            curr=curr.next;
        }
        System.out.println("null");
    }
    public void addFirst(String data){
        //create a new node
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
    }
    public void addLast(String data){
        //create a new node
        Node newNode=new Node(data);
        //empty list
        if(head==null){
            head=newNode;
            return;
        }
        //If there are multiple nodes,we need to find the last node
        Node last=head;
        while(last.next !=null){
            last=last.next;
        }
        //At the end of this loop,we will stand at the last node
        //point the last node next to the new node
        last.next=newNode;
    }
    public void RemoveFirst(){
        //empty list-> cannot remove the head node.
        if(head==null){
            System.out.println("list is empty cant delete the head!");
            return;
        }
        //For a single node,the head will point to the next (null)
        //for multiple nodes,the head will point to the next (head.next)
        head=this.head.next;
    }
    public void removeLast(){
        //empty list-> cannot remove the head node.
        if(head==null){
            System.out.println("list is empty.Cant delete the tail");
            return;
        }
        //Single element in the list
        if(head.next==null){
            head=null;//C/C++ style of code
            return;
        }
        // Multiple elements in the list
        Node curr=head;
        Node last=head.next;
        while (last.next !=null){
            curr=last;
            last=last.next;

        }
        // The last node wil be cleared by the JVM if not used
        // So, we point the SecondLast (curr) node to null pointer
        curr.next=null;
        size--;

    }
    public void removetarget(String target){
        if(head==null){
            System.out.println("list is empty.can't delete the target");
            return;
        }
        //case:target is the head node irself
        if (head.data.equals(target)){
            head=head.next;
            size--;
            return;
        }
        //case :target is anywhere in the list
        Node prev=null;
        Node curr=head;
        while (curr!=null&&!curr.data.equals(target)){
            prev=curr;
            curr=curr.next;
        }
        if(curr==null){
            System.out.println("target not found in the list!");
            return;
        }

        prev.next=curr.next;
        size--;
    }
    public static void main(String[] args) {
        LL sll=new LL();
        sll.addFirst("DSA");
        sll.addFirst("Learning");
        sll.addFirst("are");
        sll.addFirst("WE");
        sll.printList();
        sll.addLast("in");
        sll.addLast("java");
        sll.addLast("at");
        sll.addLast("SNPUS");
        sll.printList();
        sll.RemoveFirst();
        sll.printList();
        sll.removeLast();
        sll.printList();
        sll.removeLast();
        sll.printList();
        sll.removetarget("Learning");
        sll.printList();
        sll.removetarget("python");

    }

}




