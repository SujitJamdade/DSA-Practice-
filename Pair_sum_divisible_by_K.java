/*

Pair sum divisible by K
Given an array of N integers and an integer K, your task is to calculate the count of pairs whose sum is divisible by K.

Input The first line of input contains two integers N and K, the next line contains N space-separated integers depicting values of an array.

Constraints:-

1 < = N < = 100000

1 < = Arr[i] <= 100000

1 <= K <= 100000

Output

Print the count of required pairs.

Example

Sample Input 5 4 1 2 3 4 5

Sample Output 2

Sample Input 5 3 1 2 3 4 5

Sample Output 4

Explanation:- In Sample 2, (1 5), (1 2), (2 4), and (4 5) are the required pairs

*/

import java.util.*;
import java.lang.*;
import java.io.*;

public class Pair_sum_divisible_by_K
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                int k = sc.nextInt();

                int arr[] = new int[n];
                for(int i=0; i<arr.length; i++)
                {
                        arr[i] = sc.nextInt();                
                }

                int count =0;
                for(int i =0; i < (arr.length-1) ; i++)
                {
                        for(int j =i+1; j < arr.length; j++)
                        {
                                if ( (arr[i]+arr[j]) % k == 0)
                                {
                                        count ++;
                                }
                        }
                }

                System.out.println(count);

                
	}
}