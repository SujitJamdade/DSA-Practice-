/*

Staircase
In this question you need to write a program that prints a staircase of size ‘n’.

This is a staircase of size n=4:

    #
   ##
  ###
 ####
Its base and height are both equal to n. It is drawn using # symbols and spaces. The last line is not preceded by any spaces.

Write a program that prints a staircase of size n.

Input
A single integer, n, denoting the size of the staircase.

Output
Print a staircase of size n using # symbols and spaces.

Note: The last line must not have spaces in it.

Sample Input
6

Sample Output
     #
    ##
   ###
  ####
 #####
######
Explanation
The staircase is right-aligned, composed of # symbols and spaces, and has a height and width of n=6. You might notice, first line has 5 spaces (n-1) followed by 1 # and the last line has 0 spaces (n-n) and 6 # (n)

*/

import java.util.*;
import java.lang.*;
import java.io.*;

public class Staircase
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

                // height means n rows
            for (int i = 1; i<=n; i++){

                    for(int space = n-i; space>0; space--){
                                System.out.print(" ");
                      }
                    
                      for(int hash = 1; hash <= i ;hash++){
                                System.out.print("#");
                      }
              System.out.println();
            }
       }
}