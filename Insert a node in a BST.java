/*
Insert a node in a BST
You are given the root node of a binary search tree (BST) and a value to insert into the tree. Return the root node of the BST after the insertion. It is guaranteed that the new value does not exist in the original BST.

Input Format
The first line inputs N, the number of nodes, and K, the key.

The second line inputs the value of N nodes of the BST.

Output Format
Print the PreOrder traversal of the BST in a new line.

Example 1
Input

7 44
2 81 42 87 90 42 41
Output

2 81 42 41 44 87 90 
Explaination

   2
    \
    81
   /  \
  42   87
 /  \   \
41  44   90

As 44 is not present in the given nodes, so the tree will change and preorder of the updated tree is 2 81 42 41 66 44 87 90.
Example 2
Input

7 25
40 20 60 10 30 50 70 
Output

40 20 10 30 25 60 50 70
Explaination

As 25 is not present in the given nodes, so the tree will  change and preorder of the updated tree is 40 20 10 30 25 60 50 70.
Constraints:
1 <= N <= 1000

-1000 <= Val[node], K <= 1000

Topic Tags
Trees
BST
*/


import java.util.*;
import java.io.*;

class Node{
    int val;
    Node left, right;
    Node(int val){
        this.val = val;
        left = null;
        right = null;
    }
}
class BST{
    Node root = null;
    BST(){
        
    }
    BST(Node root){
        root=root;
    }
    Node insert(Node root, int val){
        if(root == null){
            root = new Node(val);
            return root;
        }
        if(root.val == val)
            return root;
        if(val < root.val){
            root.left = insert(root.left, val);
        }else{
            root.right = insert(root.right, val);
        }
        return root;
    }
    void print(Node root){
        System.out.print(root.val + " ");
        if(root.left != null){
            print(root.left);
        }
        if(root.right != null){
            print(root.right);
        }
    }
}

class Solution{
    public Node insertNode(Node root, int val){
        // WRITE YOUR CODE HERE
		 
        if(root == null){
            Node newNode = new Node(val);
            return newNode;
        }

		if(root.val == val){
            return root;
        }
        
        if(val<root.val){
            root.left = insertNode(root.left, val);
            return root;
        }else{
            root.right = insertNode(root.right, val);
            return root;
        }
    }
}

public class Main {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(), k = input.nextInt();
        BST t = new BST();
        for(int i = 0; i < n; i++){
            t.root = t.insert(t.root, input.nextInt());
        }
        Solution obj=new Solution();
        t.root= obj.insertNode(t.root, k);
        t.print(t.root);
    }
}