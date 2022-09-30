/*
Sum and Product of maximum and minimum

You are given an array A of N integers. You need to find the sum and product of the maximum and minimum value present in the array.

**NOTE: ** You need to complete the given function. The input and printing of output will be handled by the driver code.

Input Format:
The first line contains the number of test cases.

For each test case: The first line has the value of N.

The next line contains N space-separated integers of array A.

Output Format:
For each test case return an array of size two having the sum at first position and product at second.

Example 1:

Input:

1
4
1 2 3 2

Output:

4 3

Explanation:

Minimum value is 1 and maximum is 3. 1 + 3 = 4 and 1 * 3 = 3.

Example 2:

Input:

1
5
3 2 2 4 6

Output:

8 12
Explanation:

Minimum value is 2 and maximum is 6. 2 + 6 = 8 and 2 * 6 = 12.

Constraints:
1 <= T <= 10

1 <= N <= 10000

1<= A[i] <= 1000000
*/

import java.util.*;
import java.lang.*;
import java.io.*;

public class Sum_and_Product_of_maximum_and_minimum
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
                Scanner sc = new Scanner(System.in);
                int t = sc.nextInt();

                while(t-- > 0){

                        int n = sc.nextInt();

                        int arr[] = new int[n];
        
                        for(int i =0; i<n; i++){
                                arr[i] = sc.nextInt();
                        }
        
                        Arrays.sort(arr);
        
                        long maxx = arr[n-1];
                        long minn = arr[0];
        
                        System.out.println((minn+maxx)+" "+(minn*maxx));
                        
                }
                
      }
}