/*
Problem With Given Difference
Given an one-dimensional unsorted array A containing N integers.

You are also given an integer B. Find if there exists a pair of elements in the array whose difference is B.

Print 1 if any such pair exists else print 0.

Input Format
First line contains n (size of the array)

Second line contains n elements of the array

Third line contains integer B.

Output Format
Print 1 if any such pair exists else print 0.

Example 1
Input

6
5 10 3 2 50 80
78
Output

1
Explanation

Pair (80, 2) gives a difference of 78.

Example 2
Input

2
20 -10
30
Output

1
Explanation

Pair (20, -10) gives a difference of 30 i.e 20 - (-10) => 20 + 10 => 30

Constraints
1 <= N <= 100000
-10000 <= A[i] <= 10000
-20000 <= B <= 20000
*/

import java.io.*;
import java.util.*;

class Solution {
    public int givenDifference(int []arr, int n, int k) {
        // write your code here
		Map<Integer, Integer> hm = new HashMap<>();
		for(int i = 0; i<n; i++){
			if(hm.containsKey(arr[i]+k) || hm.containsKey(arr[i]-k)){
				return 1;
			}

			int oldval = hm.getOrDefault(arr[i],0);
			hm.put(arr[i], oldval+1);
		}

		return 0;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,B;
        n = sc.nextInt();
        int []mat=new int[n];
        for(int i=0;i<n;++i){
            mat[i]=sc.nextInt();
        }
        B = sc.nextInt();
        Solution Obj = new Solution();
        System.out.println(Obj.givenDifference(mat,n,B));
        System.out.println('\n');
    }
}
