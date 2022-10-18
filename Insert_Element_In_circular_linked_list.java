/*

Insertion in circular linked list
Given a circular linked list consisting of N nodes and an integer K, your task is to add the integer K at the end of the list.

Input Format
The first line contains an integer N, the length of the circular linked list.
The next line contains N integers, the elements of the circular linked list.

Output Format
Print the updated circular linked list in new line.

Example 1
Input

3
1 2 3
4
Output

1 2 3 4
Example 2
Input

4
1 2 3 4
1
Output

1 2 3 4 1
Constraints:
1 <= N <= 1000
1 <= list[i] <= 1000, where list[i] is the ith element of the list.

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

class CircularLinkedList{
        Node tail;

        void insertAtEnd(int val){

                Node n = new Node(val);

                if (tail == null){
                        tail = n;
                        n.next = n;
                        return;
                }

                n.next = tail.next;
                tail.next = n;
                tail = n;
               
        }

        void print(){

                Node head = tail.next;
                Node temp = head;

                System.out.print(temp.val+" ");
                temp = temp.next;

                while(temp != head){
                        System.out.print(temp.val+" ");
                        temp = temp.next;
                }
        }
}

public class Insert_Element_In_circular_linked_list
{  
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                CircularLinkedList cl1 = new CircularLinkedList();

                for(int i = 0; i<n; i++){
                        cl1.insertAtEnd(sc.nextInt());
                }

                int  k = sc.nextInt();
                cl1.insertAtEnd(k);

                 cl1.print();
                
	}
}