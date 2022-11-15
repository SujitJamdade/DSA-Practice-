/*

Sum of natural numbers
Write a recursive program to find out the sum of all natural numbers till N. Take input of N from the user and make a recursive function that returns the sum of all the natural numbers upto N.

Input Format
First line is an integer N

Output Format
Print the sum of first N natural numbers.

Example 1
Input

5
Output

15
Explanation

Here, n = 5, so 1 + 2 + 3 + 4 + 5 = 15

Example 2
Input

1
Output

1
Explanation

Here n = 1, so 1 = 1

Constraints
1 <= N < = 10^6
*/

import java.util.*;
import java.lang.*;
import java.io.*;

public class Sum_of_natural_numbers
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
                		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

         		int ans = SumOfNaturalNo(n);
          		System.out.println(ans);
	}

        // Finding the sum of all the natural numbers upto N.

        public static  int SumOfNaturalNo(int n){

                if (n == 0){
                        return 0;
                }

                return n + SumOfNaturalNo(n-1);
        }
}
