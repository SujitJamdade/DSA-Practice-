/*

Recursive Digit Sum
Given an integer, we need to find the super digit of the integer n which is concatenated k times.

We define super digit of an integer n using the following rules:

If n has only 1 digit, then its super digit is n.

Otherwise, the super digit of n is equal to the super digit of the sum of the digits of n.

Input Format
The first line contains two space separated integers, n and k.

Output Format
In a new line, print the the super digit of n repeated k times.

Example 1
Input:

148 1
Output:

4
Explanation:

Here n=148 and k=1 , so p=148

super_digit(p) = super_digit(148) 
               = super_digit(1+4+8)
               = super_digit(13)
               = super_digit(1+3)
               = super_digit(4)
               = 4
Example 2
Input:

148 3
Output:

3
Explanation:

Here n=148 and k=3 , so p=148148148.

super_digit(p) = super_digit(148148148) 
               = super_digit(1+4+8+1+4+8+1+4+8)
               = super_digit(39)
               = super_digit(3+9)
               = super_digit(12)
               = super_digit(1+2)
               = super_digit(3)
               = 3
Constraints:
1 <= |digits in n| <= 25

1 <= k <= 50

*/

import java.util.*;
import java.lang.*;
import java.io.*;

public class Recursive_Digit_Sum
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
                Scanner sc = new Scanner(System.in);
                String m = sc.next();

                int k = sc.nextInt();

                String s ="";

                for(int i = 1; i<=k; i++){
                        s += m;
                }

                int ans = super_digit(s);
                System.out.println(ans);                
	}

        public static int super_digit(String s){
                int n = s.length();

                if (n==1){
                        return Integer.parseInt(s);
                }

                int sum = 0;
                for(int i = 0; i<n; i++){
                        sum += (s.charAt(i) - '0');
                }

                return super_digit(sum+"");
        }
}