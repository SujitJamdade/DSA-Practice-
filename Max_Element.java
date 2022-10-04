/*

Max Element
Given an array of integers, you need to find its maximum value element.

Input
The input contains N spaced integers. There is no size of the array given beforehand. You will have to use some other way of reading input values.

Constraints
1 < = N < = 1000
1 < = Arr[i] < = 10000
Output
Print the largest element present in the array.

Example
Sample Input

8 1 2 3 4 
Sample Output

8 
Sample Input

8 2 4 6 8
Sample Output

8

*/

import java.util.*;
import java.lang.*;
import java.io.*;

public class Max_Element
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
                Scanner sc = new Scanner(System.in);
                String s = sc.nextLine();

                String arr[] = s.split(" ");

                int m = Integer.MIN_VALUE;

                for(String x: arr){
                        int temp = Integer.parseInt(x);
                        
                        if (temp>m){
                                m = temp;
                        }
                }

                        System.out.print( m);
          
     }
}