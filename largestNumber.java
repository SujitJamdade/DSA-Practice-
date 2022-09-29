/*
Largest number from given list

Given an array of N integers, your task is to calculate the largest number that can be formed by appending the numbers from the given array. For eg:- If the numbers are { 10, 3, 31} then the largest number will be 33110

Input
First line of input contains a single integer N, next line contains N space separated integers depicting values of array.

Output
Print the largest number that can be formed using the array elements.

Constraints:
1 < = N < = 100000 1 < = Arr[i] < = 100000

Sample Input:
3
10 3 31
Sample Output:
33110

*/

import java.util.*;
import java.lang.*;
import java.io.*;

public class largestNumber
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();

                int arr [] = new int[n];
                for(int i = 0; i<n; i++)
                        arr[i] = sc.nextInt();

                String num [] = new String[n];

                for(int i =0; i<n; i++){
                        num[i] = String.valueOf(arr[i]);
                }

                Arrays.sort(num,(a,b) -> (b+a).compareTo(a+b));

                StringBuilder sb = new StringBuilder();

                for(int i = 0; i<n; i++){
                        sb.append(num[i]);
                }

                String ans = sb.toString();
                System.out.println(ans);
	}
}