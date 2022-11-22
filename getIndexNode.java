package Linked_list;
import java.util.Scanner;

class Node{
    int data;
    Node next;

    Node(int d){
        this.data = d;
    }
}

public class getIndexNode {

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


    public static Node getIndex(int idx){

       if (idx<0){
           System.out.println("Given index is out of range.");
           return null;
       }

       Node curr = head;

       for(int i = 0; i<idx; i++){

           if(curr == null){
               System.out.println("Given index is out of range.");
               return null;
           }
           curr = curr.next;
       }
       return curr;
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

        int idx = sc.nextInt();
        Node ans = getIndex(idx);

        if (ans != null)
        System.out.println(ans.data);

    }
}
