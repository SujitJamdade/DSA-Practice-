/*

Sum of Array elements using recursion
Given an array of integers, find sum of array elements using recursion.

Input Format
Input consists of a 2 lines.

First line contains n.

Second line contains n spaced integers.

Output Format
Print the sum of array elements.

EXAMPLE 1
Input:

4
1 2 3 4
Output::

10
EXPLANATION:

1 + 2 + 3 + 4 = 10

EXAMPLE 2
Input:

3
1 3 3
Output::

7
EXPLANATION:

1 + 3 + 3 = 7.

CONSTRAINTS
1 <= n <= 10^5

-10^4 <= arr[i] <= 10^4

*/

import java.util.*;
import java.lang.*;
import java.io.*;

public class Sum_of_Array_elements
{

        // Function for finding sum of array elements

        public static int ArrSum(int n, int [] arr){
               
                if(n<=0){
                        return 0;
                }
                 return ArrSum((n-1),arr)+ arr[n-1];
                
        }

	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();

                int arr[] = new int[n];

                for(int i = 0; i <n; i++){
                        arr[i] = sc.nextInt();
                }

                int ans = ArrSum(n,arr);
                System.out.println(ans);
     }
}