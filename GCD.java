/*

FIND GCD
You are given two non-negative integers.

Your task is to calculate their GCD using the euclidian theorem.

Input Format
The first line of input contains two space-separated integers A and B.

Output Format
The only line of the output should contain the GCD of A and B.

Example 1
Input

12 8
Output

4
Explanation

GCD of 12 and 8 is 4.
Example 2
Input

5 7
Output

1
Explanation

GCD of 5 and 7 is 1.
Constraints
0 <= A <= 10^9

0 <= B <= 10^9

/*

import java.util.*;
import java.lang.*;
import java.io.*;

public class GCD
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
                Scanner sc = new Scanner(System.in);
                int a = sc.nextInt();
                int b = sc.nextInt();

                int minimun = Math.min(a,b);
                int ans = 1;

                for(int i = 1; i<= (minimun/2); i++){

                        if((a%i == 0) & (b%i == 0)){
                                ans = i;
                        }
                }
                System.out.println(ans);                
     }
}