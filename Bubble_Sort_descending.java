/*

Bubble Sort
Write a program to sort an array (arr[]) of integers in descending (decreasing) order using Bubble sort algorithm. First take input of size of the array i.e. N, followed by N numbers which represent the array elements.

Note: Use of inbuilt sort function is not permitted.

Time complexity: There are N elements in the array and for every element we make N interations , hence N*N iterations which gives us a Time complexity of O(N^2) in the worst case.

Space Complexity: Since this algorithm works without the use of any additional storage space apart from the input, we can say that the Space Complexity will be O(1)

Input Format
First line contains integer N denoting the size of array arr[]

Second line contains N array integers each separated by a space denoting elements of arr[]

Output Format
Output N integers of the sorted array separated by a space in a single line

Example 1
Input

5
1 4 3 7 2
Output

7 4 3 2 1
Explanation

7>4>3>2>1

Example 2
Input

6
1 2 3 4 5 6
Output

6 5 4 3 2 1
Explanation

6>5>4>3>2>1

Constraints
1 <= n <= 1000

1 <= arr[i] <= 1000

*/

import java.util.*;
import java.lang.*;
import java.io.*;

public class Bubble_Sort_descending
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();

                int arr[] = new int [n];

                for(int i = 0;i<n;i++){
                        arr[i] = sc.nextInt();
                }

                for(int i =0;i<n-1;i++){

                        for(int j =0; j<n-1-i;j++){

                                if(arr[j]< arr[j+1]){
                                        int temp = arr[j];
                                        arr[j] = arr[j+1];
                                        arr[j+1]=temp;
                                }
                        }
                }

                for(int x:arr){
                        System.out.print(x+" ");
                } 
    }
}