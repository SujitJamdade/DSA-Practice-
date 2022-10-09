/*

Max Sum Subarray of size K
Given an array of integers Arr of size N and a number K. Return the maximum sum of a subarray of size K

Input
First line contains 2 integers N and K Second line contains N integers denoting elements of array

Output
Print maximum sum subarray of size K

Constraints:
1 <= N <= 1000000 1 <= K <= N -10000 <= Arr[i] <= 10000

Sample Input:
4 2
100 200 300 400
Sample Output:
700

*/

import java.util.*;
import java.lang.*;
import java.io.*;

public class Max_Sum_Subarray_of_size_K
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                int k = sc.nextInt();

                int arr[] = new int[n];

                for(int i = 0; i<n; i++){
                        arr[i] = sc.nextInt();
                }

                int maxx = Integer.MIN_VALUE;
                for(int i = 0; i<=(n-k); i++){
                        int arr_sum = 0;
                        for(int j = i; j<(i+k); j++){
                                arr_sum += arr[j];
                        }
                        if (arr_sum > maxx){
                                maxx = arr_sum;
                        }
                }

                System.out.print(maxx);
   }
}