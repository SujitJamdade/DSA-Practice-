package Linked_list;
import java.util.Scanner;

class Node{
    int data;
    Node next;

    public Node(int d){
        this.data = d;
    }
}


public class Add_Node_At_First {
    static Node head;
    static Node tail;

    // add node at fisrt
    public static void addFirst(int data){
        Node nn = new Node(data);

        if(head == null){ //checking is list null or not
            head = nn;   // if its null then adding first node as head node
            tail = nn;  // also adding tail node is first node
        }else{
            nn.next = head;  // giving head as a reference for new node
            head = nn;      // making new node as a head node
        }
    }

    // display function

    public static void display(){
        Node curr = head;

        while(curr != null){
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
    }

    public static void main(String args[]){
        head = null;
        tail = null;

        Scanner sc = new Scanner(System.in);
        System.out.print("What will be the initial size of your list : ");
        int n = sc.nextInt();
        System.out.println("Enter the data element of your list : ");

        for(int i = 0; i<n; i++){
            int a = sc.nextInt();
            addFirst(a);
        }
        display();

    }
}
