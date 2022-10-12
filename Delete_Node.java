
/*

    Delete a Node
        We are given an integer n denoting size of linked list and after than we are given n elements where the ith element denotes the ith element if linked list (0<= i <= n-1). The head of Linked list is at position 0 and we are given a postion (0 index based), which denotes the position of element we want to delete. Delete the required node and then print the whole linked list.

        Input
        The first line of input contains an integer n, the number of elements in the linked list. Each of the next n lines contains an integer, the node data values in order. The last line contains an integer, position , the position of the node to delete. (0 <= position <= n-1)

        Output
        Output elements of linked list after deleting the required node

        Constraints:
        1 <= n <= 1000 1 <= llist[i] <= 1000, Where llist[i] is the ith element of linked list

        Example
        llist = 0 -> 1 -> 2 -> 3 position = 2 After removing node at position 2 llist = 0 -> 1 -> 3

        Sample Input:
        8
        20
        6
        2
        19
        7
        4
        15
        9
        3
        Sample Output:
        20 6 2 7 4 15 9


 */


import java.util.*;
import java.lang.*;
import java.io.*;

class Node{
    int val;
    Node next;

    Node(int val){
        this.val = val;
    }
}

class LinkedList{
    Node head;

    void insertLinkedList(int val){

        Node n = new Node(val);
        if (this.head==null){
            this.head=n;
            return;
        }

        Node temp = this.head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = n;

    }

    void deleteNodePosition(int pos){

        if(pos==0){
            head = head.next;
            return;
        }

        Node prev = head;
        for(int i = 0;i< pos-1;i++){
            prev = prev.next;
        }
        prev.next = (prev.next).next;
    }

    void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }

    }
}

public class Delete_Node
{
    public static void main (String[] args) throws java.lang.Exception
    {
        //your code here
        Scanner sc = new Scanner(System.in);
        int nn = sc.nextInt();

        LinkedList l1 = new LinkedList();

        for(int i = 0; i<nn; i++){
            l1.insertLinkedList(sc.nextInt());

        }


        int pos = sc.nextInt();
        l1.deleteNodePosition(pos);
        l1.print();


    }
}