/*
Delete a node from BST
You are given N nodes and have to form BST from it. You are given a key K, delete node with value K.

Note If K is not present in the BST, do not modify the BST.

Input Format
The first line inputs N, the number of nodes and K, key.

The second line inputs the value of N nodes of the BST.

Output Format
Print the preorder traversal of the updated BST in a new line.

Example 1
Input

7 42
2 81 42 87 90 41 66
Output

2 81 66 41 87 90 
Explaination

     2
      \
      81
     /  \
   42    87
  /  \    \
 41   66   90

As 42 is present in the given nodes, so the node 42 will deleted and the updated tree will be like 

     2
      \
      81
     /  \
   66    87
  /       \
 41       90

The preorder will be 2 81 66 41 87 90.
Example 2
Input

7 41
2 81 42 87 90 41 66
Output

2 81 42 66 87 90 
Explaination

     2
      \
      81
     /  \
   42    87
  /  \    \
 41   66   90

As 41 is present in the given nodes, so the node 41 will deleted and the updated tree will be like 

     2
      \
      81
     /  \
   42    87
     \    \
      66   90

The preorder will be 2 81 42 66 87 90 .
Constraints
1 <= N <= 1000

-1000 <= Val[node], K <= 1000
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

	public int getMin(Node root){

		if(root.left==null) return root.val;

		return getMin(root.left);
	}
	
    public Node deleteNode(Node root, int val){
        // WRITE YOUR CODE HERE

		if(root == null){
			return null;
		}
		else if(val < root.val){
			root.left = deleteNode(root.left,val);
			return root;
		}
		else if(root.val < val){
			root.right = deleteNode(root.right,val);
			return root;
		}
		else{
			// It means now root.val == val so node should be delete
			// Here we need to take care of some cases let's strat
			// a) If this is leaf node is null then return null to parent

			if(root.left == null && root.right == null){
				return null;
			}

			// b) if node have only left child then return root.left 
			else if ( root.left != null && root.right == null){
				return root.left;
			}

			// c) if node have only right child then return root.right
			else if(root.left == null & root.right != null){
				return root.right;
			}
			else{
				// d) In this case we have to delete a such node where left and right child present

				// so here we need to delete this node without loosing any tree

				// so here first we will find ideal val which we can place in node val which we have to delete

				// so ideal val can be 1) max of left tree 2) min of right tree
				int ideal = getMin(root.right);
				root.val = ideal; // here we replace root.val value with ideal value

				// now delete our ideal value from tree
				root.right = deleteNode(root.right, ideal);
				return root;
			}
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
        t.root= obj.deleteNode(t.root, k);
        t.print(t.root);
    }
}