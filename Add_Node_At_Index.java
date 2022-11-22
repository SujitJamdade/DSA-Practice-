package Linked_list;

import java.util.Scanner;

class Node{
    int data;
    Node next;

    Node(int d){
        this.data = d;
    }
}

public class Add_Node_At_Index {

    static Node head;
    static Node tail;

    public static void addNodeAtGivenIndex(int idx, int data){

        Node curr = head;

        for(int i = 1; i<idx; i++){
            curr = curr.next;
        }
        Node nn = new Node(data);
        nn.next = curr.next;
        curr.next = nn;

    }

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
        display();
        int idx = sc.nextInt();
        int data = sc.nextInt();
        addNodeAtGivenIndex(idx,data);
        display();
    }
}
