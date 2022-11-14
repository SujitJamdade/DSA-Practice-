/*
Reverse Array Recusively
You are given an array arr of length n. You have to print the reversed array.

Note: You have to use Recursion.

Input Format
The first line of input contains an integer n, size of the array.

The next line contains n space separated integers denoting the elements of the array.

You need to complete reverseArray function which returns the reverse array recursively and it contains arr array of size N and start & end pointer.

Output Format
Print n space separated integers denoting the reverse of the input array.

EXAMPLE 1
Input

3
2 3 2
Output

2 3 2
EXPLANATION

After reversing 2 3 2, we will get 2 3 2

EXAMPLE 2
Input

4
1 3 5 7
Output:

7 5 3 1
EXPLANATION

After reversing 2 3 2, we will get 2 3 2

CONSTRAINTS
0 <= nums.length <= 100

0 <= nums[i] <= 100000

*/

import java.util.*;
import java.lang.*;
import java.io.*;

public class Reverse_Array_Recusively
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here

                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();

                int arr[] = new int[n];

                for(int i = 0; i<n; i++){
                        arr[i] = sc.nextInt();
                }

                revArr(n,arr);
	}

        public static void revArr(int n, int[] arr){

                if(n==0){
	       return ;
                }

                System.out.print(arr[n-1]+" ");
                 revArr(n-1,arr);
        }
}