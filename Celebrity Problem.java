/*
Celebrity Problem
You are present in a party of N people. You have to find if a celebrity is present in the party or not.

A matrix M of size N * N is used to represent people at the party. If M[i][j] = 1, it means ith person knows jth person.

If a person is known to every other person at the party and he knows no one, he is a celebrity.

Here M[i][i] will always be 0.

Note Complete the given function. The input and output would be handled by the driver code.

Print the answer in 0-based indexing.

Input Format
The first line contains N.

The next N lines contains N integer each of matrix M.

Output Format
Print the index of the lowest numbered celebrity. If no celebrity is present, print -1.

Example 1
Input

2
0 1
0 0
Output

1
Explanation

The second person is know to the first but does not know the first person.

Example 2
Input

2
0 1
1 0
Output

-1
Explanation

Both the person know each other.

Constraints
2 <= N <= 300

0 <= M[i] <= 1

*/

import java.io.*;
import java.util.*; 

class Main{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M[][] = new int[N][N];
        for(int i=0; i<N; i++)
            for(int j=0; j<N; j++)
                M[i][j] = sc.nextInt();
        System.out.println(new Solution().findCelebrity(M,N));
    } 
} 
class Solution
{ 
    int findCelebrity(int M[][], int n)
    {
		Stack<Integer> st = new Stack<>();
		for(int i = 0; i < n; i++) st.push(i);

		while(st.size() > 1) {
			int a = st.pop();
			int b = st.pop();

// a knows b => a cant be celebrity so b might be celebrity hence push(b)
			if(M[a][b] == 1) st.push(b);
// b knows a => b cant be celebrity so a might be celebrity hence push(a)
			else if(M[b][a] == 1) st.push(a);
		}

		if(st.size() == 0) return -1;
		
            // Confirm whether top of stack is celebrity
		int ans = st.peek();
		for(int i = 0; i < n; i++) {
			if(M[ans][i] == 1) return -1;
		}
		
		return ans;

       
    }

}