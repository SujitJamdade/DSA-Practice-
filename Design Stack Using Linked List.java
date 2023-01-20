/*

Design Stack Using Linked List
Your task is to implement a stack using singly linked list.

In driver code, you are given an empty linked list named top. The structure of a node of the linked list is:

class Node {

    int data;
    Node link;
}
You just need to complete the function of the given class using concepts of the linked list such that stack is implemented.

These are the required functions in the stack:

push(): Inserts a value in the stack.

pop(): removes a value from the top of the stack.

peek(): returns the top value of the stack.

display(): print the items in the stack.

Note

If the stack is empty and the peek function is called return -1.

You just need to return the head of the linked list in the display function.

Input Format
You are given an empty linked list and you need to implement a stack.

The input is handled by the driver code.

In driver code, input is taken as:

The first line of the input contains an integer Q denoting the number of operation.

The next Q lines could contain one of four numbers 1, 2, 3, 4.

1 denotes the insertion operation and is followed by the value to be inserted.

2 denotes peek operation

3 denotes the pop operation

4 denotes display operation

Output Format
Complete the given functions.

Example 1
Input

6
1 5
1 9
2
3
3
2
Output

9
-1
Explanation

First, we enter 5 and 9 into the stack. Now we check the top of the stack which is 9. Therefore 9 is printed. Now we pop two values from the stack and then again check the top of the stack. As the stack is empty this time -1 is printed.

Example 2
Input

6
1 5
1 9
1 3
3
2
4
Output

9
9 5
Explanation

First, we enter 5, 9, and 3 into the stack. Now we pop once. We now check the top element which is 9. Therefore 9 is printed. Now we display the list which is 9 5.

Constraints
1 <= Q <= 10000

1 <= value that can be added in stack <= 10000

*/

import java.util.*;

class Node {

    int data;
    Node next;

	Node(int d){
		this.data = d;
		this.next = null;
	}
}

class Main {
	public static void main(String[] args)
	{
		StackUsingLinkedlist obj = new StackUsingLinkedlist();
		Scanner sc = new Scanner(System.in);
        int q;
        q = sc.nextInt();
        while(q-->0){
            int x;
            x = sc.nextInt();
            if(x==1){
                int y;
                y = sc.nextInt();
                obj.push(y);
            }
            if(x==2){
                System.out.println(obj.peek());
            }
            if(x==3){
                obj.pop();
            }
            if(x==4){
                Node temp = obj.display();
                while (temp != null) {

                    System.out.print(temp.data+" ");

                    temp = temp.next;
			    }
				System.out.println();
            }
        }
	}
}

class StackUsingLinkedlist {

	Node top;
	StackUsingLinkedlist() { this.top = null; }

	public void push(int x)
	{
		//Complete the function
		Node temp = new Node(x);

		if(top==null){
			top = temp; 
		}
		else{
			temp.next = top;
			top = temp;
		}
	}

	public int peek()
	{
		//Complete the function
		if(top == null) return -1;
		return top.data;
		
	}

	public void pop()
	{
		//Complete the function
		if (top == null ) return;
		top = top.next;
	}

	public Node display()
	{
		//Complete the function
		return top;
		
	}
}
