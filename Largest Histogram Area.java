/*
Largest Histogram Area
You are given a histogram of N bars. The height of each bar is given in the the array A. The width of each bar is 1. Find the largest rectangular area possible where the rectangles can be made of a number of contiguous bars.

Note Complete the given function. The input and output would be handled by the driver code.

Input Format
The first line contains N.

The second line contains elements of A.

Output Format
Print the maximum area.

Example 1
Input

4
1 2 3 1
Output

4
Explanation

The rectangle 1 1 1 1 is maximum possible.

Height = 1. Width is 1 * 4 = 4.

Area = 1 * 4 = 4.

Example 2
Input

3
2 2 2
Output

6
Explanation

The rectangle 2 2 2 is maximum possible.

Height = 2. Width is 1 * 3 = 3.

Area = 2 * 3 = 6.

Constraints
1 <= N <= 10000

1 <= A[i] <= 10000
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    
    
	public static void main (String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
        long n = Long.parseLong(br.readLine().trim());
        String inputLine[] = br.readLine().trim().split(" ");
        long[] arr = new long[(int)n];
        for(int i=0; i<n; i++)arr[i]=Long.parseLong(inputLine[i]);
        System.out.println(new Solution().maximumArea(arr, n));
	}
}

class Solution
{
	public static long[] leftSmall(long arr[], int n){
		long ans[] = new long[n];
		Stack <Integer> st= new Stack<>();

		for(int i = n-1;i>=0;i--){
			while(st.size()>0 && (arr[i]<arr[st.peek()])){
				ans[st.peek()]=i;
				st.pop();
			}
			st.push(i);
		}
		while(st.size()>0){
			ans[st.peek()]=-1;
				st.pop();
		}
		return ans;
	}

	public static long[] rightSmall(long arr[], int n){
		long ans[] = new long[n];
		Stack <Integer> st= new Stack<>();

		for(int i = 0;i<n; i++){
			while(st.size()>0 && (arr[i]<arr[st.peek()])){
				ans[st.peek()]=i;
				st.pop();
			}
			st.push(i);
		}
		while(st.size()>0){
			ans[st.peek()]=n;
				st.pop();
		}
		return ans;
	}
      public static long maximumArea(long hist[], long n){
	//Your code here   
		  long l[]= leftSmall(hist, (int)n);
		  long r[]= rightSmall(hist, (int)n);
		  long ans = 0;
		  for(int i = 0;i<(int)n;i++){
			  long area = hist[i] * (r[i] - l[i] -1);
			  ans = Math.max(ans,area);
		  }
		  return ans;
    }
}



