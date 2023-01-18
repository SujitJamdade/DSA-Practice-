package Linked_list;
import java.sql.SQLOutput;
import java.util.Scanner;

class Node{

    int data;
    Node next;

    public Node(int d){

        this.data = d;
    }
}

public class Add_Node_At_Last {
    static  Node head;
    static Node tail;

    // adding Node in linked list at last
    public static void addLast(int data){

        Node nn = new Node(data);

        if(head == null){ // in case of 0 size linked list
            head = nn;    // this is my first node of list
            tail = nn;    // and also my last node of list
        }else{
            tail.next = nn;   // attaching new node
            tail = nn;        // tail = tail.next // shifting tail to last =>
        }
    }


    public static void main(String args[]){
        head = null;
        tail = null;

        Scanner sc = new Scanner(System.in);
        System.out.print("What will be the initial size of your list : ");
        int n = sc.nextInt();
        System.out.print("Enter the data element of your list : ");

        for(int i = 0; i<n; i++){
            int a = sc.nextInt();
            addLast(a);
        }

    }


}
