/*

Maximum Integer
Given three integers your task is to calculate the maximum integer among the given integers.

Input User Task: Take three integers a,b and c as a parameter.

Constraint: 1<=integers<=10000

Output Return the maximum integer among the given integers.

Example

Input: 1 2 3

Output: 3

Input: 5656 3224 211

Output: 5656

*/

import java.util.*;
import java.lang.*;
import java.io.*;

public class Maximum_Integer
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
                Scanner sc = new Scanner(System.in);
                int a =  sc.nextInt();
                int b =  sc.nextInt();
                int c =  sc.nextInt();

                int maxx = a;

                if(b>maxx){
                        maxx = b;
                }

                if (c>maxx){
                        maxx = c;
                }

                System.out.println(maxx);
   }
}
