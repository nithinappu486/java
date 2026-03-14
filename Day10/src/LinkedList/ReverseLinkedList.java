package LinkedList;

import java.util.Scanner;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }
}
public class ReverseLinkedList {
    static Node head;
    static void insert(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node temp=head;
        while (temp.next!=null){
            temp=temp.next;
        }
        temp.next = newNode;
    }
    static void reverse(){
        Node prev=null;
        Node curr=head;
        Node next=null;
        while (curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }
    static void display(){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.data+" --> ");
            temp=temp.next;
        }
        System.out.print("null");
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number of nodes:");
        int n=sc.nextInt();
        System.out.print("enter the" +n+"nodes of the list:");
        for(int i=0;i<n;i++){
            insert(sc.nextInt());
        }
        System.out.print("original list:");
        display();
        reverse();
        System.out.print("reversed list:");
        display();
    }

}
