package LinkedList;

import java.util.Scanner;

class Nodes
{
    int data;
    Nodes next;
    Nodes(int data)
    {
        this.data=data;
    }
}
public class EvenOddLinkedList
{
    static Node head;
    static void insert(int data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
            return;
        }
        Node temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=newNode;
    }
    static void printOdd()
    {
        System.out.print("Odd: ");
        Node temp=head;
        while(temp!=null)
        {
            if(temp.data%2!=0)
            {
                System.out.print(temp.data+" ");

            }
            temp=temp.next;
        }
        System.out.println();
    }
    static void printEven()
    {
        System.out.print("Even: ");
        Node temp=head;
        while(temp!=null)
        {
            if(temp.data%2==0)
            {
                System.out.print(temp.data+" ");

            }
            temp=temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the nodes:");
        int n=sc.nextInt();
        System.out.println("Enter the value of "+n+" nodes");
        for(int i=0;i<n;i++)
        {
            insert(sc.nextInt());
        }
        printEven();
        printOdd();
    }
}

