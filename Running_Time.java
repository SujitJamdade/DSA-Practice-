/*
Running Time
The running time of an algorithm for a specific input depends on the number of operations executed.The greater the number of operations, the longer the running time of an algorithm. We usually want to know how many operations an algorithm will execute in proportion to the size of its input, which we will call N.

In case of Insertion Sort, For each element V in an array of N numbers, Insertion Sort compares the number to those to its left until it reaches a lower value element or the start. At that point it shifts everything to the right up one and inserts V into the array.

How long does all that shifting take? In the best case, where the array was already sorted, no element will need to be moved, so the algorithm will just run through the array once and return the sorted array. The running time would be directly proportional to the size of the input, so we can say it will take N time. However, we usually focus on the worst-case running time (computer scientists are pretty pessimistic). The worst case for Insertion Sort occurs when the array is in reverse order. To insert each number, the algorithm will have to shift over that number to the beginning of the array. Sorting the entire array of N numbers will therefore take 1+2+3+....+(N-1) operations, which is N(N-1)/2 (almost (N^2)/2 ). Computer scientists just round that up (pick the dominant term) to (N^2) and say that Insertion Sort is an "(N^2) time" algorithm.

The only thing we should print is the number of shifts made by the algorithm to completely sort the array. A shift occurs when an element position changes in the array. Do not shift an element if it is not necessary.

Input
The first line inputs n, size of integer array.
The second line inputs n space-seperated integers, i.e., a[i].

Constraints:
1 <= n <= 1001
-10000 <= a[i] <= 10000

Output
In a new line, print the number of shifts it will take to sort the array.

Example
Input:
5
2 1 3 1 2
Output:
4
Explanation:
Iteration   Array         Shifts
0                2 1 3 1 2		
1                1 2 3 1 2     1
2                1 2 3 1 2     0
3                1 1 2 3 2     2
4                1 1 2 2 3     1

Total                             4

*/

import java.util.*;
import java.lang.*;
import java.io.*;

public class Running_Time
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

                int shift = 0; 

                for(int i=1; i<n; i++){

                        int current = arr[i];
                        int j = i-1;

                        while (j>=0 && current <arr[j]){
                                arr[j+1] = arr[j];
                                j--;
                                shift ++;
                        }
                        arr[j+1] = current;
                        
                }
                
                System.out.println(shift);
                
	}
}