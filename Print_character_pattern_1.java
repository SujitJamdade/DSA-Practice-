/*

Print character pattern 1
You are given N representing the number of rows, you have to print the given pattern.

Input Format
First line of inout contains N, the number of rows for the pattern

Output Format
You need to print the pattern.

Example 1
Input

4
Output:

A
BB
CCC
DDDD
Explanation:

For number of rows to be 4 we get this output.

Example 2
Input

5
Output:

A
BB
CCC
DDDD
EEEEE
Explanation:

For number of rows to be 5 we get this output.

Constraints:

1 <= N <= 26

*/

import java.util.*;
import java.lang.*;
import java.io.*;

public class Print_character_pattern_1
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();

                for(int i = 0; i<n;i++){

                        char c = (char) (65+i);
                        for(int j = 1; j<=i+1; j++){
                                System.out.print(c);
                        }
                        System.out.println();
                }
   }
}