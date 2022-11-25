package Linked_list;
import java.util.Scanner;

class Node{
    int data;
    Node next;

    public Node(int d){
        this.data = d;
    }
}

public class removeFirstNode {
    static Node head;
    static Node tail;

    public static void addLast(int data){

        Node nn = new Node(data);

        if(head == null){
            head = nn;
            tail = nn;
        }else{
            tail.next = nn;
            tail = nn;
        }
    }

    public static void removeFirstNodeFromList(){

        if(head == null) // should atleast one node to remove
        {
            System.out.println("Can't remove anything list is empty");
        }
        else if (head == tail)
        {
            head = null;
            tail = null;
        }
        else{
            head = head.next; // moving head to the next node so fisrt node will remove
        }
    }

    public static void display(){

        Node curr = head;

        while(curr!=null){
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String args[]){

        head = null;
        tail = null;

        Scanner sc = new Scanner(System.in);
        System.out.print("What will be the initial size of your list : ");
        int n = sc.nextInt();
        System.out.println("Enter the data element of your list : ");

        for(int i =0; i<n; i++){
            int a = sc.nextInt();
            addLast(a);
        }
        removeFirstNodeFromList();
        display();
    }
}
