/*

Print Number Pattern 1
Given a number n, print the following pattern with n rows.

1
23
345
4567
..and so on.
Complete the given function.

Input Format
First line of input contains the integer n.

Output Format
Print the pattern.

Example 1
Input

3
Output:

1
23
345

**Explanation:**

We print the pattern with `3` rows.

### Example 2

**Input**

2


**Output:**

1 23


**Explanation:**

This time, we print the pattern with `2` rows.

### Constraints

1 <= n <= 100

*/

import java.util.*;
import java.lang.*;
import java.io.*;

public class Print_Number_Pattern
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();

                for(int row =1; row<=n; row++){

                        int limit = row+row;
                        for(int num_start = row; num_start < limit; num_start++){
                                System.out.print(num_start);
                        }

                        System.out.println();
                }
                
    }
}