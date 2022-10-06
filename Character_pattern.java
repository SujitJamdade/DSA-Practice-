/*

Print character pattern 2
Given an integer n that denotes the number of rows to be printed.

Print the pattern in which each row starts with it's corresponding alphabet and has length equal to the row number.

Example:

A
BC
CDE
DEFG
EFGHI
and so on...
Input Format:
First line contains the value n representing the number of rows.

Output Format
Print the pattern.

Example 1
Input

5
Output

A
BC
CDE
DEFG
EFGHI
Explanation

Each row starts with it's corresponding alphabet and has length equal to row number.

Example 2
Input

8
Output

A
BC
CDE
DEFG
EFGHI
FGHIJK
GHIJKLM
HIJKLMNO
Explanation

Each row starts with it's corresponding alphabet and has length equal to row number.

Constraints
1 <= n <= 26

*/

character pattern

import java.util.*;
import java.lang.*;
import java.io.*;

public class Character_pattern
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();

                for(int i = 1; i<=n; i++){
                        
                          int c = 65+i-1;
                        
                        for(int ch = 1; ch<=i; ch++){

                                System.out.print((char) c);
                                c++;
                                if (c==91)
                                {
                                        c=65;
                                }
                        }
                        
                        System.out.println();
                }
   }
}