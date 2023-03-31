/*
Construct Bst From Levelorder Traversal
You are given an array representing the valid level order traversal of a BST. You are required to build the unique Binary Search Tree of which the level order traversal is provided.

A Binary Search Tree (BST) is a binary tree data structure that has the following properties -

The left subtree of a node contains only nodes with data less than the node’s data.
The right subtree of a node contains only nodes with data greater than the node’s data.
Both the left and right subtrees must also be binary search trees.
Note

You are required to return the root node of the BST and the printing will be taken care of in the main function. Simply complete the function bstFromLevel which receives n and input array as parameters and returns the root node of the BST.

Input Format
First line of input contains n representing the number of nodes.
The second line contains the n space-separated nodes representing the level order of the BST.

Output Format
The single line of output contains the level order traversal of the BST.

Example 1
Input

6
3 2 5 1 6 7

        3
      /  \
    2     5
  /        \
1           6
             \
              7
Output

3 2 5 1 6 7
Example 2
Input

6
5 3 6 2 4 7 

        5
      /   \
    3      6
  /  \      \
2     4      7
Output

5 3 6 2 4 7 
Constraints:
1 <= n<= 5000
1 <= node.val <= 10^7

Topic Tags
BST
*/
import java.util.LinkedList;
import java.util.Queue;
import java.io.*;
import java.util.*;
import java.lang.*;

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

public class Main {

    static void printLevelOrder(Node root) {
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);
        while (!queue.isEmpty()) {

            Node tempNode = queue.poll();
            System.out.print(tempNode.data + " ");

            if (tempNode.left != null) {
                queue.add(tempNode.left);
            }

            if (tempNode.right != null) {
                queue.add(tempNode.right);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; ++i)
            arr[i] = sc.nextInt();
        Solution Obj = new Solution();
        Node ans = Obj.bstFromLevel(arr, n);
        printLevelOrder(ans);
        sc.close();
    }
}

class Solution {

	class Helper{
		Node parent;
		int left;
		int right;

		Helper(Node p, int l, int r){
			this.parent = p;
			this.left = l;
			this.right = r;
		}
	}
	
    Node bstFromLevel(int arr[], int n) {
        // write code here

		Queue<Helper> que = new LinkedList<>();
		int idx = 1;
		Node root = new Node(arr[0]);
		que.add(new Helper(root,Integer.MIN_VALUE, root.data-1));
		que.add(new Helper(root,root.data+1, Integer.MAX_VALUE));

		while(que.size()>0){

			Helper front = que.remove();
			Node parent = front.parent;
			int left = front.left;
			int right = front.right;

			if(idx==n) continue;
			
			if(arr[idx]<left || arr[idx]>right) continue;
			//if im standing on this line means i belong to the range
			//now i have to check if i am left or right child of the parent

			Node me = new Node(arr[idx]);
			idx++;

			if(me.data <parent.data){
				// //i am left child
				parent.left = me;
			}else{
				//i am right child
				parent.right = me;
			}
			
			//left child
			que.add(new Helper(me,left,me.data-1));
			// right child
			que.add(new Helper(me,me.data+1,right));
			
		}
		return root;
    }
}