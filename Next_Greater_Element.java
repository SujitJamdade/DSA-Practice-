/*

Next Greater Element
Given an array arr of size n of non-zero positive integers, the task is to find the next greater element for each element of the array in order of their appearance in the array.

Next greater element of an element in the array is the nearest element on the right which is greater than the current element.

If there does not exist next greater of current element, then next greater element for current element is -1. For example, next greater of the last element is always -1.

Input Format
Line 1: contains an integer n denoting size of array.

Line 2: contains n spaced integers denoting elements of array.

Output Format
Returns a list of integers of length n denoting the next greater elements for all the corresponding elements in the input array.

Example 1
Input

4
1 3 2 4
Output

3 4 4 -1
Explanation

In the array, the next larger element to 1 is 3 , 3 is 4 , 2 is 4 and for 4 ? since it doesn't exist, it is -1.

Example 2
Input

5
6 8 0 1 3
Output

8 -1 1 3 -1
Explanation

In the array, the next larger element to 6 is 8, for 8 there is no larger elements hence it is -1, for 0 it is 1 , for 1 it is 3 and then for 3 there is no larger element on right and hence -1.

Expected Time Complexity: O(N)

Expected Space Complexity: O(N)

Constraints
1<=n<=10^6

1<=arr[i]<=10^18

*/

import java.util.*;
import java.lang.*;
import java.io.*;

public class Next_Greater_Element
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();

                long arr[] = new long[n];

                for(int i = 0; i<n; i++){
                        arr[i] = sc.nextLong();
                }

                long ans [] = new long [n];

                Stack <Long> s1 = new Stack<>();

                for(int i = n-1; i>=0; i--){

                        while(!s1.empty() && (s1.peek() <= arr[i])){
                                s1.pop();
                        }

                        if (s1.empty()){
                                ans[i] = -1;
                        }
                        else{
                                ans[i] = s1.peek();
                        }

                        s1.push(arr[i]);
                } 

                for(int i =0 ; i<n; i++){
                        System.out.print(ans[i] + " ");
                }
	}
}