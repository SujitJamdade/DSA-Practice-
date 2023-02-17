/*
Record Values
Alex gave Alice to keep scores for a game,with strange rules. At the beginning of the game,record is empty.

A list of strings operation has been given, where each operation[i] is the ith operation Alice must apply.

1.) An integer x , add number to x to record.

2.) + Record a new score that is the sum of the previous two scores

3.) D Record a new score that is the double of the previous score

4.) C Record a new score that is the double of the previous score

Alice task is to return the sum of all the record after applying all the operations.

Input Format
The first line of input contains a single integer n.

The second line of imput contains n space strings.

Output Format
Return the sum after applying all the operations.

Example 1
Input

5
5 2 C D +
Output

30
Explanation

"5" - Add 5 to the record, record is now [5].
"2" - Add 2 to the record, record is now [5, 2].
"C" - Invalidate and remove the previous score, record is now [5].
"D" - Add 2 * 5 = 10 to the record, record is now [5, 10].
"+" - Add 5 + 10 = 15 to the record, record is now [5, 10, 15].
The total sum is 5 + 10 + 15 = 30.
Example 2
Input

2
1 C
Output

0
Explanation

"1" - Add 1 to the record, record is now [1].
"C" - Invalidate and remove the previous score, record is now [].
Since the record is empty, the total sum is 0.
Constraints
1 <= n <= 103

operation[i] is "C", "D", "+", or a string representing an integer in the range [-3 * 104, 3 * 104].

For operation "+", there will always be at least two previous scores on the record.

For operations "C" and "D", there will always be at least one previous score on the record.
*/

import java.io.*;
import java.util.*;

class Main {

    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String operation[]=new String[n];
        for(int i=0;i<n;i++)
        operation[i]=sc.next();
        
        Solution obj=new Solution();

        System.out.print(obj.solve(operation,n));

		sc.close();
    }
}

class Solution {

    int solve(String operation[],int n) {
        // Add your code here.

		Stack<Integer> stack = new Stack<>();
		for(int i = 0; i < n; i++) {
			String s = operation[i];
			if(s.equals("+")) {
				int a = stack.pop();
				int newScore = a + stack.peek();
				stack.push(a);
				stack.push(newScore);
			}else if(s.equals("D")) {
				stack.push(2 * stack.peek());
			}else if(s.equals("C")) {
				stack.pop();
			}else{
				stack.push(Integer.parseInt(s));
			}
		}
		int maxScore = 0;
		while(!stack.isEmpty()) {
			maxScore = maxScore + stack.pop();
		}
		return maxScore;
		
		
  }
}
