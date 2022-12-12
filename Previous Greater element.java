/*
Previous Greater element
You are given an array arr of distinct integers.Your task is to find the previous greater element for each element in the array.If previous greater doesn't exist print -1.

Input Format
First line of input contains a single integer n, the size of array.

Second line of input contains n space seperated integrs representing the elements of the array.

Output Format
Find the previous greater element for each of the element in the array.

Example 1

Input
4
10 20 30 40

Output:
-1 -1 -1 -1

Explanation:

For element 10 we not have any element in its left which is greater than 10, so we print -1, similary for 20, 30 and 40 no element is greater to the left of them.Therefore we print -1 -1 -1 -1.

Example 2

Input
4
40 30 20 10

Output:
-1 40 30 20

Explanation:

For element 40 we dont have any value to its left which is greater than it, for 30 we have 40 on its left, for 20 we have 30 on its left and for 10 we have 20 on its left.

Constraints
1 <= n <= 10^5

1 <= arr[i] <= 10^6
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Solution
{
    public static long[] prevGreater(long[] arr, int n)
    { 
        //Write code here and print output 
		long ans[] = new long[n];
		Stack<Integer> st = new Stack<>();
		for(int i = n-1; i>=0; i--){

			while(st.size()>0 && arr[i]>arr[st.peek()]){
				ans[st.peek()] = arr[i];
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
	
}
class Main {
    public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		    int n = Integer.parseInt(br.readLine().trim());
		    String inputLine[] = br.readLine().trim().split(" ");
		    long[] arr = new long[n];
		    for(int i=0; i<n; i++)arr[i]=Long.parseLong(inputLine[i]);
		    long[] res = new Solution().prevGreater(arr, n);
		    for (int i = 0; i < n; i++) 
		        System.out.print(res[i] + " ");
		    System.out.println();
	}
}