/*
Merge Intervals
Given a set of time intervals in any order, merge all overlapping intervals into one and output the result which should have only mutually exclusive intervals.

Input Format
First line contains an integer n denoting number of intervals.

Next n lines contain the two integers, representing the start and end intervals.

Output Format
Print the merged intervals, each interval in a new line.

Example 1
Input

4
1 3
2 4
6 8
9 10
Output

1 4
6 8
9 10
Explanation

Given intervals: [1,3],[2,4],[6,8],[9,10], we have only two overlapping intervals here,[1,3] and [2,4]. Therefore we will merge these two and return [1,4],[6,8], [9,10].

Example 2
Input

4
6 8
1 9
2 4
6 7
Output

1 9
Constraints
1 <= n <= 10000
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Solution {
    public void merge(int[][] intervals) {
      // Your code here, Print your output here
		// sorting the 2D arrays with 0th column
		Arrays.sort(intervals, (a,b) -> Integer.compare(a[0],b[0]));

		int n = intervals.length;
		int prevStart = intervals[0][0];
		int prevEnd = intervals[0][1];

		for(int i = 1; i<n;i++){
			int currStart = intervals[i][0];
			int currEnd = intervals[i][1];
			// if curr start less then prev end then interval will overlap
			if(currStart <= prevEnd){
				prevEnd = Math.max(prevEnd, currEnd);
			}
			else{
				System.out.println(prevStart+" "+prevEnd);
				prevStart = currStart;
				prevEnd = currEnd;
				
			}
		}
		
		System.out.println(prevStart+" "+prevEnd);            
    }
}

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int m;
        m = sc.nextInt();
        int[][] A = new int[m][2];
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < 2; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        Solution Obj = new Solution();
        Obj.merge(A);
        
    }
}