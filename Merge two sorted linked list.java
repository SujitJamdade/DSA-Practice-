/*
Merge two sorted linked list
Merge two sorted linked lists and return it as a sorted list. The list should be made by splicing together the nodes of the first two lists.

Input Format
The format for each test case is as follows:

The first line contains an integer n, the length of the first linked list.
The next line contain n integers, the elements of the linked list.
The next line contains an integer m , the length of the second linked list.
The next lines contain m integers, the elements of the second linked list.

Output Format
Output a single line of (n + m) integers consisting all elements of linked lists in sorted order.

Example 1
Input
1 2 4
3
1 3 4
Output
1 1 2 3 4 4
Explanation
Merge the two linked list

Example 2
Input
3
1 5 9
3
1 3 4
Output
1 1 3 4 5 9
Explanation

Merge the two linked list in sorted order

Constraints
The number of nodes in both lists is in the range [0, 50].

-100 <= Node.val <= 100
*/


import java.io.*;
import java.util.*;
 
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        next = null;
    }
}
class LinkedList{
    Node head;
    void add(int data ){
        Node new_node = new Node(data);
        if(head == null){
            head = new_node;
            return;
        }
        Node current = head;
        while(current.next !=null){
            current = current.next;
        }
        current.next = new_node;
    }
}

class Solution {
 static Node merge(Node x, Node y){
       // Write your code here
	 Node dummy = new Node(-1);
	 Node curr = dummy;
	 Node p1 = x;
	 Node p2 = y;

	 while(p1!=null && p2!=null){
		 Node np1 = p1.next;
		 Node np2 = p2.next;

		 if(p1.data<p2.data){
			 curr.next = p1;
			 p1=np1;
		 }
		 else{
			 curr.next = p2;
			 p2=np2;
		 }
		 curr = curr.next;
	 }

	 if(p1 == null){
		 curr.next = p2;
	 }
	 if(p2 == null){
		 curr.next = p1;
	 }

	 Node headans = dummy.next;
	 return headans;
	 
    }
}

public class Main {
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedList l1= new LinkedList();
        for(int i=0;i<n;i++){
            l1.add(sc.nextInt());
        }
        int m = sc.nextInt();
        LinkedList l2 = new LinkedList();
        for(int i=0;i<m;i++){
            l2.add(sc.nextInt());
        }

        Solution Ob = new Solution();
        Node head = Ob.merge(l1.head, l2.head);
        while(head != null){
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
}