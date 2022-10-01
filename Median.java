/*

Find The Median
The median of a list of numbers is essentially its middle element after sorting. The same number of elements occur after it as before. Given a list of numbers with an odd number of elements, find the median.

Input
The first line inputs integer n, size of array a.
The second line inputs n space-seperated integers, i.e., a[i].

Constraints:
1 <= n <= 1000001
n is odd
-10000 <= a[i] <= 10000

Output
In a new line, print the median of the array.

Example
Input:
7
0 1 2 4 6 5 3
Output:
3
Explanation:
The sorted a=[0,1,2,3,4,5,6].
Its middle element is at a[3]=3.

*/

import java.util.*;
import java.lang.*;
import java.io.*;

public class Median
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();

                int arr[] = new int[n];

                for(int i =0; i<n; i++){
                        arr[i] = sc.nextInt();
                }

                // Selection sort 
                //  sorting upto n/2 element , as per the question we need median element from odd element array
                // so here we sorted upto the median element 
                for(int i = 0; i<=(n/2); i++){
                        int smallIndex = i;
                        for(int j = i+1; j<n; j++){
                                if(arr[smallIndex]>arr[j]){
                                        smallIndex = j;
                                }
                        }
                        int temp = arr[smallIndex];
                        arr[smallIndex] = arr[i]; 
                        arr[i] =  temp;
                         // System.out.println(Arrays.toString(arr)); // for checking 
                }
               
                System.out.println(arr[n/2]);
	}
}