/*
Range Sum Query
Given an integer array nums, handle multiple queries of the following type:

Calculate the sum of the elements of nums between indices left and right inclusive where left <= right.

Input Format
Input consists of 4 lines.

First line contains an integer n.

Next line contains n spaced integers that denote the array

Next line contains integer m which is the number of queries for to calculate range sum.

Next m lines contains 2 integers each which denotes left and right.

Example 1
Input

6
-2 0 3 -5 2 -1
3
0 2 
2 5
0 5
Output

1 -1 -3
Explanation

NumArray numArray = new NumArray([-2, 0, 3, -5, 2, -1]);

numArray.sumRange(0, 2); // return (-2) + 0 + 3 = 1

numArray.sumRange(2, 5); // return 3 + (-5) + 2 + (-1) = -1

numArray.sumRange(0, 5); // return (-2) + 0 + 3 + (-5) + 2 + (-1) = -3

Constraints
1 <= nums.length <= 104

-105 <= nums[i] <= 105

0 <= left <= right < nums.length

At most 104 calls will be made to sumRange.

Topic Tags
Arrays
*/
import java.util.*;

class Solution {

	public int rangeSum(int[] pref, int sp, int ep){
		if(sp==0){
			return pref[ep];
		}
		else{
			return pref[ep]-pref[sp-1];
		}
	}
        public int[] sumQuery(int[] arr, int[][] ranges) {
            // Your code here.

			int n = arr.length;
			int q = ranges.length;
			int[] res = new int[q];

			for(int i = 1; i<n; i++){
				arr[i] += arr[i-1];
			}

			// answering every range sum
			for(int i = 0; i<q;i++){
				res[i] = rangeSum(arr,ranges[i][0],ranges[i][1]);
			}

			return res;
        }
}

public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        int m;
        m = sc.nextInt();
        int[][] ranges = new int[m][2];
        for(int i = 0; i < m; i++) {
            ranges[i][0] = sc.nextInt();
            ranges[i][1] = sc.nextInt();
        }
        Solution Obj = new Solution();
        int[] ans = Obj.sumQuery(arr, ranges);
        for(int i =0; i< ans.length; i++)
            System.out.print(ans[i] + " ");
    }
}