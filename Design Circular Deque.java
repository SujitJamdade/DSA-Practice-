/*

LeetCode : 641. Design Circular Deque
Accio Weekly Contest Question 

Design Circular Deque
Design your implementation of the circular double-ended queue (deque).

Implement the MyCircularDeque class:

MyCircularDeque(int k) Initializes the deque with a maximum size of k.

boolean insertFront() Adds an item at the front of Deque. Returns true if the operation is successful, or false otherwise.

boolean insertLast() Adds an item at the rear of Deque. Returns true if the operation is successful, or false otherwise.

boolean deleteFront() Deletes an item from the front of Deque. Returns true if the operation is successful, or false otherwise.

boolean deleteLast() Deletes an item from the rear of Deque. Returns true if the operation is successful, or false otherwise.

int getFront() Returns the front item from the Deque. Returns -1 if the deque is empty.

int getRear() Returns the last item from Deque. Returns -1 if the deque is empty.

boolean isEmpty() Returns true if the deque is empty, or false otherwise.

boolean isFull() Returns true if the deque is full, or false otherwise.

Input Format
The first line of input contains the number of queries n.

The next n line of input contains a string as input and number if required.

Output Format
Just compelete the given functions, rest will be handled by driver code.

Example 1
Input

10
3
insertLast 1
insertLast 2
insertFront 3
insertFront 4
getRear
isFull
deleteLast
insertFront 4
getFront
Output

true true true false 2 true true true 4
Explanation

MyCircularDeque myCircularDeque = new MyCircularDeque(3);
myCircularDeque.insertLast(1);  // return True
myCircularDeque.insertLast(2);  // return True
myCircularDeque.insertFront(3); // return True
myCircularDeque.insertFront(4); // return False, the queue is full.
myCircularDeque.getRear();      // return 2
myCircularDeque.isFull();       // return True
myCircularDeque.deleteLast();   // return True
myCircularDeque.insertFront(4); // return True
myCircularDeque.getFront();     // return 4
Example 2
Input

5
3
insertLast 1
insertLast 2
insertFront 3
insertFront 4
Output

true true true false
Explanation

MyCircularDeque myCircularDeque = new MyCircularDeque(3);
myCircularDeque.insertLast(1);  // return True
myCircularDeque.insertLast(2);  // return True
myCircularDeque.insertFront(3); // return True
myCircularDeque.insertFront(4); // return False, the queue is full.
Constraints
1 <= k <= 1000

0 <= value <= 1000
*/


import java.util.*;

public class Main{
    public static void main(String[] args)
    {
        int n,k;
        Scanner in = new Scanner(System.in);
	    n = in.nextInt();
	    k=in.nextInt();
	   in.nextLine();
        MyCircularDeque obj=new MyCircularDeque(k);
        for(int i=0;i<n-1;i++)
        {
            String[] s = in.nextLine().split(" "); 
            
            if(s[0].equals("insertFront"))
            {
                int value=Integer.parseInt(s[1]);
                boolean ans=obj.insertFront(value);
                if(ans==true)
                System.out.print("true ");
                else
                System.out.print("false ");
            }
            else if(s[0].equals("insertLast"))
            {
                int value=Integer.parseInt(s[1]);
                boolean ans=obj.insertLast(value);
                if(ans==true)
                System.out.print("true ");
                else
                System.out.print("false ");
            }
            else if(s[0].equals("deleteFront"))
            {
                boolean ans=obj.deleteFront();
                if(ans==true)
                System.out.print("true ");
                else
                System.out.print("false ");
            }
            else if(s[0].equals("deleteLast"))
            {
                boolean ans=obj.deleteLast();
                if(ans==true)
                System.out.print("true ");
                else
                System.out.print("false ");
            }
            else if(s[0].equals("isFull"))
            {
                boolean ans=obj.isFull();
                if(ans==true)
                System.out.print("true ");
                else
                System.out.print("false ");
            }
            else if(s[0].equals("isEmpty"))
            {
                boolean ans=obj.isEmpty();
                if(ans==true)
                System.out.print("true ");
                else
                System.out.print("false ");
            }

            else if(s[0].equals("getFront"))
            {
                int ans=obj.getFront();
                System.out.print(ans+" ");
            }

            else if(s[0].equals("getLast"))
            {
                int ans=obj.getRear();
                System.out.print(ans+" ");
            }
        }

    System.out.println();
    }
    
}

// approach 1

// class MyCircularDeque {
//     // your code here
// 	int head, tail, size,n;
// 	final int[] a;
//     public MyCircularDeque(int k) {
//         a = new int[k];
// 		n = a.length;
// 		tail = 1;
//     }
    
//     public boolean insertFront(int value) {
//         if(size == n) return false;
// 		a[head = ++head % n] =value;
// 		size++;
// 		return true;
//     }
    
//     public boolean insertLast(int value) {
//         if(size==n)return false;
// 		a[tail = (--tail +n)%n]=value;
// 		size++;
// 		return true;
//     }
    
//     public boolean deleteFront() {
//         if (size==0)return false;
// 		head = (--head +n )%n;
// 		size--;
// 		return true;
//     }
    
//     public boolean deleteLast() {
//         if (size==0)return false;
// 		tail = ++tail %n;
// 		size--;
// 		return true;
//     }
    
//     public int getFront() {
//         return size == 0 ? -1 : a[head];
//     }
    
//     public int getRear() {
//          return size == 0 ? -1 : a[tail];
//     }
    
//     public boolean isEmpty() {
//         return size == 0;
//     }
    
//     public boolean isFull() {
//         return size == a.length;
//     }
// }

// Approach 2

class Node{
	int data;
	Node next;
	Node prev;

	Node(int data){
		this.data = data;
	}
}
class MyCircularDeque {
    // your code here
	
	Node head;
	Node tail;
	int size;
	int maxsize;
	
	
    public MyCircularDeque(int k) {
       head= null;
		tail = null;
		size=0;
		maxsize=k;
    }
    
    public boolean insertFront(int value) {

		if(size==maxsize){
			return false;
		}
		else{
			Node nn = new Node(value);
			if(head==null){
				head=tail= nn;
			}
			else{
				nn.next=head;
				head.prev=nn;
				head=nn;
			}
			size++;
			return true;
		}
    }
    
    public boolean insertLast(int value) {
        if(size==maxsize){
			return false;
		}
		else{
			Node nn = new Node(value);
			if(head==null){
				head=tail= nn;
			}
			else{
				tail.next=nn;
				nn.prev=tail;
				tail=nn;
			}
			size++;
			return true;
		}
    }
    
    public boolean deleteFront() {
        
		if(size==0){
			return false;
		}
		else{
			if(head==tail){
				head=tail=null;
			}
			else{
				head= head.next;
				head.prev = null;
			}
			size--;
			return true;
		}
    }
    
    public boolean deleteLast() {
        if(size==0){
			return false;
		}
		else{
			if(head==tail){
				head=tail=null;
			}
			else{
				tail= tail.prev;
				tail.next = null;
			}
			size--;
			return true;
		}
    }
    
    public int getFront() {
        if(size==0){
			return -1;
		}
		else{
			return head.data;
		}
    }
    
    public int getRear() {
        if(size==0){
			return -1;
		}
		else{
			return tail.data;
		}
    }
    
    public boolean isEmpty() {
        return size == 0;
    }
    
    public boolean isFull() {
        return size == maxsize;
    }
}
