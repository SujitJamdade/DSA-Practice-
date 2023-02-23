/*
Size, Sum, Maximum And Height Of A Binary Tree
Given a binary tree a, you need to compute the size, sum, maximum and height of the tree. You must complete the function bodies for each of these functions.

Input Format
The only line of the input contains the elements of the tree in level order form separated by a space. A null node is represented by the character N. The input ends when the last node is processed.

Output Format
The first line contains the size of the tree.

The second line contains the sum of the tree.

The third line contains the maximum value in the tree.

The fourth line contains the height of the tree.

Example 1
Input

1 2 3 4 5 N N N N N N
Output

5
15
5
3
Explanation

The tree looks like this:

        1
      /   \
     2     3
    / \
   4   5
The size of the tree is 5, the sum of the tree is 15, the maximum value in the tree is 5 and the height of the tree is 3.

Example 2
Input

1 2 N 3 N 4 N N N
Output

4
10
4
4
Constraints
1 <= n <= 10000
1 <= a[i] <= 10000
*/

import java.util.LinkedList;
import java.util.Queue;
import java.io.*;
import java.util.*;

class Main {
    static Node buildTree(String str) {
        if (str.length() == 0 || str.charAt(0) == 'N') {
            return null;
        }
        String ip[] = str.split(" ");
        Node root = new Node(Integer.parseInt(ip[0]));
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        int i = 1;
        while (queue.size() > 0 && i < ip.length) {
            Node currNode = queue.peek();
            queue.remove();
            String currVal = ip[i];
            if (!currVal.equals("N")) {
                currNode.left = new Node(Integer.parseInt(currVal));
                queue.add(currNode.left);
            }
            i++;
            if (i >= ip.length) break;
            currVal = ip[i];
            if (!currVal.equals("N")) {
                currNode.right = new Node(Integer.parseInt(currVal));
                queue.add(currNode.right);
            }
            i++;
        }

        return root;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        String s1 = br.readLine();
        Node root1 = buildTree(s1);
        Solution g = new Solution();
        System.out.println(g.sizeOfTree(root1));
        System.out.println(g.sumOfTree(root1));
        System.out.println(g.maxOfTree(root1));
        System.out.println(g.heightOfTree(root1));
    }
}


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


class Solution {
    public int sizeOfTree(Node root) {

		if(root==null) return 0;

		// get size of left side
		int ls = sizeOfTree(root.left);
		
		// get size of right  side
		int rs = sizeOfTree(root.right);
		
		// total size = leftside + 1(root itself) + rightside
		return ls + 1+ rs;
    }

    public int sumOfTree(Node root) {

		if(root==null) return 0;

		// get sum of left side
		int leftsum = sumOfTree(root.left);

		// get sum of right  side
		int rightsum = sumOfTree(root.right);
		
		// total sum = leftsum + root.data(root itself) + rightsum
		return leftsum + root.data + rightsum;
    }

    public int maxOfTree(Node root) {
			if(root==null) {
				return Integer.MIN_VALUE;
			}
		// get max of left side
		int leftmax = maxOfTree(root.left);
		
		// get max of right  side
		int rightmax = maxOfTree(root.right);

		return Math.max(root.data , Math.max(leftmax, rightmax));
    }

    public int heightOfTree(Node root) {
		if(root==null) return 0;

		// get max of left side
		int lh = heightOfTree(root.left);
		
		// get max of right  side
		int rh = heightOfTree(root.right);

		//max of (left max , rightmax )+1
		return Math.max(lh, rh) +1;
    }
}