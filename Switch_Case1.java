/*

Switch Case Problem 1
You are given a positive integer N. Write a program using switch case to print the following output such that :

If the case is 55 , print "Study is important" ,

Otherwise , print "No value" .

Input Format
First line contains an integer N.

Output Format
Print the sentence related to the integer as per description.

Example 1
Input

55
Output

Study is important
Example 2
Input

24
Output

No value
Constraints
1 <= N <= 10^6

*/

import java.util.*;
import java.lang.*;
import java.io.*;

public class Switch_Case1
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();

                switch (n){
                     
                        case 55 : 
                                System.out.print("Study is important");
                                break;

                        default:
                                System.out.print("No value");                     
                }
   }
}