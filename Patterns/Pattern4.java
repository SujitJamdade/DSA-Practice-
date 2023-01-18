/*

AS Pattern 4
Take input of N from the user and write a program to print the Full Pyramid Number pattern as follows (N=4) :

Pattern Image

Input Format
Input consists of the integer N.

Output Format
Print the pattern for value N.

Example 1
Input

4
Output

   1   
  333  
 55555 
7777777
Example 2
Input

3
Output

  1   
 333  
55555 
Constraints
1 <= N <= 100

*/

import java.util.*;
import java.lang.*;
import java.io.*;

public class Pattern4
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();

                int digit = -1;
                for(int i = 1; i <=n; i++){

                        int space = n-i;
                        digit= digit+2;

                        for(int j = 1; j<=space;j++){
                                System.out.print(" ");
                        }

                        for(int j = 1; j<=digit;j++){
                                System.out.print(digit);
                        }

                        System.out.println();
                        
                }
     }
}
