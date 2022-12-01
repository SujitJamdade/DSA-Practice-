/*
DiffK
Given an array A of sorted integers and another non negative integer k, find if there exists 2 indices i and j such that A[i] - A[j] = k , i != j.

Note: Try doing this in less than linear space complexity.

You have to complete diffPossible function which contains array A and integer K or B (given difference) as inputs and you have to return integer output as 1 or 0.

Input Format
First line contains a number n which denotes the size of the array.

Second line will contain n spaced separted elements of array A

Third line will contain a non-negative integer k.

Output Format
Print 0 or 1 (i.e. 0 for false, 1 for true ) for this problem.

Example 1:
Input

3
1 3 5 
4
Output

1
Explanation

As 5 - 1 = 4
Example 2:
Input

5
1 3 5 6
7
Output

0
Explanation

There is no pair whose difference is equal to 7.
Constraints
2 <= A.length <= 10^4

-10^9 <= A[i] <= 10^9

-10^9 <= k <= 10^9
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Solution{
	public static int diffPossible(int[] A, int B) {
        //Write your code here      
		int len = A.length;

		int i =0;
		int j = i+1;

		while(i<len && j<len){
			int check = A[j]-A[i];
	
			if(check>B){
				i++;
			}else if (check<B){
				j++;
			}else{
				if(i!=j){
					return 1; // returning true , target diff pair is {i,j}
				}else{
					j++;
				}
			}
		}
		return 0;
	
    }
}
public class Main {
	 public static void main (String[] args)
		{
			Scanner sc = new Scanner(System.in);		    
		    	int n = sc.nextInt();
				int[] A = new int[n];
				for(int i=0;i<n;i++)
				A[i] = sc.nextInt();
				int k= sc.nextInt();           
	    	Solution Obj= new Solution();	    	
            System.out.println(Obj.diffPossible(A, k));
	}
}