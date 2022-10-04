/*  

Array Operations
Given an array arr of size N, your task is to apply the following operations.

Sum of all the elements in the array.

Average of all the element in the array, give the floor value.

Find the maximum number in the array.

Input Format:

The first line of input contains N representing the number of elements.

The second line of input contains N space separated integers, representing elements of the array Arr.

Output Format:

In a single line print 3 space separated integers representing Sum, Average and Maximum among all the array elements.

Example 1:

Input

6
1 2 3 4 5 6
Output:

21 3 6
Explanation:

sum of all the elements of the array is 1+2+3+4+5+6 is 21, average is 3 and maximum among all of them is 6.

Example 2:

Input

5
1 0 -1 0 0
Output:

0 0 1
Explanation:

sum of all the elements of the array is 1+0+(-1)+0+0 is 0, average is 0 and maximum among all of them is 1.

Constraints:

1 <= N <= 2*10^5

-10^8 <= arr[i] <= 10^8

*/

import java.util.*;
import java.lang.*;
import java.io.*;

public class Array_Operations
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();

                int arr [] = new int[n];

                for(int i = 0; i<n; i++){
                        arr[i] = sc.nextInt();
                }

                int m = Integer.MIN_VALUE;
                int s = 0;

                for(int i = 0; i<n; i++){
                        s += arr[i];
                        if (arr[i]>m){
                                m = arr[i];
                        }
                }

                System.out.println(s+" "+ (s/n)+" "+m );
    }
}