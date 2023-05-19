/*

Maximum Contiguous Subarray Sum
Given an array, A of length n.

Your task is to find the contiguous subarray within A which has the largest sum.

Input Format
The first line of each test case contains an integer n, the length of the array A.

The next line contains n integers.

Output Format
Output an integer representing the maximum possible sum of the contiguous subarray.

Example 1
Input

5
1 2 3 4 -10
Output

10
Explanation

1 + 2 + 3 + 4 = 10

Example 2
Input

6
2 -1 0 1 2 1
Output

5
Explanation

The sum of the entire array i.e 5.

Constraints
1 <= N <= 10^5

-10^6 <= A[i] <= 10^6

Topic Tags
Arrays
*/
import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i] = input.nextInt();
        }
        Solution ob =new Solution();
        long ans = ob.maxSubarraySum(a,n);
        System.out.println(ans);
    }
}
class Solution{
    public long maxSubarraySum(int a[],int n){
        //Write code here
		long train = 0;
		long res = Integer.MIN_VALUE;

		for(int i =0; i<n; i++){
			long prev = train + a[i];
			long startNew = a[i];

			train = Math.max(prev,startNew);
			res = Math.max(res,train);
		}

		return res;
    }
}