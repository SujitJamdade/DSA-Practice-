/*
Given an array of ints, compute recursively the number of times that the value 11 appears in the array. We'll use the convention of considering only the part of the array that begins at the given index. In this way, a recursive call can pass index+1 to move down the array. The initial call will pass in index as 0.

array11([1, 2, 11], 0) → 1 array11([11, 11], 0) → 2 array11([1, 2, 3, 4], 0) → 0

Input Format The first line contains the number n the size of array The second line contains N integers

Output Format Print the number of 11 in the array.

** Example ** 5 1 3 11 11 2 ** Output ** 2 **Constraints ** 2 <= N <= 3000 0 <= A[i] <= 5000
*/

import java.util.*;
import java.lang.*;
import java.io.*;

public class recursion_array11
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

                int ans = array11(arr,0);
                System.out.println(ans);
	}

        public static int array11(int [] arr, int index){

                if (arr.length ==  index){
                        return 0;
                }

                if (arr[index] == 11){
                        return 1 + array11(arr, index+1);
                }

                return array11(arr, index+1);
        }
}