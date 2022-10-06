/*

Good triplets from array
You are given an integer array arr of size n. Additionally, you are also given three integers a, b and c.

Your task is to write a program to find the number of good triplets in the given array arr.

A triplet (arr[i], arr[j], arr[k]) is good if the following conditions are true:

0 <= i < j < k < arr.length

|arr[i] - arr[j]| <= a

|arr[j] - arr[k]| <= b

|arr[i] - arr[k]| <= c

Input Format
First line contains an integer n denoting size of array

Second line contains n integers denoting the array elements separated by single space

Third line contains input of a b c respectively.

Output Format
Print the number of good triplets

Example 1
Input

6
3 0 1 1 9 7
7 2 3
Output

4
Explanation

There are 4 good triplets: [(3,0,1), (3,0,1), (3,1,1), (0,1,1)]

Constraints
1 <= n <= 100

-100000 <= arr[i] <= 10000

*/

import java.util.*;
import java.lang.*;
import java.io.*;

public class Good_triplets
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

                int a = sc.nextInt();
                int b = sc.nextInt();
                int c = sc.nextInt(); 

                int cnt = 0;

                for(int i = 0; i <= n-3; i++){

                        for(int j = i+1; j< n-2; j++){

                                for(int k = j+1; j< n-2; j++){

                                        if ( (Math.abs(arr[i] - arr[j]) <= a) &
                                                 (Math.abs(arr[j] - arr[k]) <= b) &
                                                 (Math.abs(arr[i] - arr[k]) <= c) ){
                                                cnt++;
                                                 }
                                        
                                }
                        }
                }

                System.out.println(cnt);
                                    
   }
}