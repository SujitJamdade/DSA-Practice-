/*

Climbing Stairs
You are climbing a staircase. It takes n steps to reach the top.

Each time you can either climb 1 or 2 steps. Your task is to print the number of distinct ways you can climb to the top.

Input Format
The only line of input contains an integer n.

Output Format
The only line of output contains an integer denoting the distinct ways can you climb to the top.

Example 1
Input

2
Output

2
Explanation

There are two ways to climb to the top.

1 step + 1 step

2 steps

Example 2
Input

3
Output

3
Explanation

There are three ways to climb to the top.

1 step + 1 step + 1 step
1 step + 2 steps
2 steps + 1 step
Constraints
1 <= n <= 45

*/

import java.util.*;
import java.lang.*;
import java.io.*;

public class Climbing_Stairs
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
        // as per the logic pattern is going on like below 
        /*
        n = 1   - 1
        n = 2   - 2
        n = 3   - 3
        n = 4   - 5
        n = 5   - 8
        n = 6   - 13
        n = 7   - 21
        n = 8   - 34
        n = 9   - 55
        n =10   - 89

        
        f(n-2) + f(n-1)
     */

      /*
        n = 2   return 2
        ----------------------------------
        n = 3   return 3
        ----------------------------------
        n = 4   f(2) + f(3)    ans = 2 + 3  return ans 
        ----------------------------------
        n = 5   step = f(3) + f(4)  ans = 3 + 5  return ans 
    */

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int step = climbSteps(n);
        System.out.println(step);
	}

    public static int climbSteps(int n){

        if(n==2){
            return 2;
        }

        if (n==3){
            return 3;
        }

        int ans = climbSteps(n-2) + climbSteps(n-1);

        return ans;
    }

    
}