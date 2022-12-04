/*
Garry and the linked list problem
Garry is learning the concept of odd and even.

His teacher gives him an assignment. He is given a linked list, and he needs to segregate odd position nodes and even position nodes such that all odd position nodes are together and before all even position nodes.

He is still not good at the task and asks for your help. Could you help him to complete the assignment?

You need to complete the given function with the pointer to the head of the linked list.

Input Format
The first line contains the number of test cases.

For each test case: The first line contains an integer N denoting the number of nodes in the linked list.

The second line contains N space-separated integers denoting elements of the linked list.

Output Format
For each test case, return the head node of the modified, linked list.

Example 1
Input

1
4
1 2 3 4
Output

1 3 2 4
Explanation

The Initial Linked List looks like this:

1 -> 2 -> 3 -> 4

Odd elements are brought together before all even elements

The Linked List after the operation looks like this:

1 -> 3 -> 2 -> 4
Example 2
Input

1
4
1 3 5 2
Output

1 5 3 2
Explanation

The odd elements are brought together.
Constraints
1 <= T <= 10

1 <= N <= 10000

1 <= L[i] <= 100000
*/

import java.util.*;

class Node {
    int data;
    Node next;
    Node(int d)
    {
        data = d;
        next = null;
    }
}

class Main {
	Node head;
	Node temp;

	public void push(int new_data)
	{
		if(head == null){
			
			head = new Node(new_data);
			
			temp =head;
			
			return ;
		}
		else{
			Node new_node = new Node(new_data);

			temp.next = new_node;
			
			temp=temp.next;

			return;		
		}
		
	}

	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		Main ob = new Main();
		int t=0;
		t = sc.nextInt();
		while(t-->0){
			ob.head=null;
			int n=0;
			n=sc.nextInt();
			int tn =n;
			while(tn-->0){
				int x=0;
				x = sc.nextInt();
				ob.push(x);
			}
            Solution obj = new Solution();
            Node temp = obj.segregateList(ob.head);
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;			
            }
            System.out.println();

		}
		sc.close();
		return;
	}
}

class Solution{
	public Node segregateList(Node head) {
		//Write code 
		if(head==null || head.next==null){
			return head;
		}

		Node dummy1 = new Node(-1);
		Node dummy2 = new Node(-1);
		Node even = dummy2;
		Node odd = dummy1;
		Node curr = head;
		int count =1;
		while(curr!=null){
			Node nextOfcurr = curr.next;
			curr.next = null;

			if (count%2 ==1){

				odd.next = curr;
				curr=nextOfcurr;
				odd= odd.next;
				
			}else{
				even.next = curr;
				curr= nextOfcurr;
				even= even.next;
			}
			count++;
		}

		Node oddHead = dummy1.next;
		Node evenHead = dummy2.next;

		odd.next = evenHead;
		return oddHead;
	}
}