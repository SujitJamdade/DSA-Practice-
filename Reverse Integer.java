/*
Reverse Integer
Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-2^31, 2^31 - 1], then return 0.

Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

Input Format
The first line of input contains the integer n.

Output Format
Print the integer n in reverse if it lies within the range, else print 0.

Example 1
Input

321
Output

123
Example 2
Input

-321
Output

-123
Example 3
Input

120
Output

21
Constraints
-2^31 <= x <= 2^31 - 1
*/

import java.util.*;
import java.lang.*;
import java.io.*;
class Solution{
    public long reverseInteger(int x) {
        // write code here

		// long temp = 0;
		// if (x>0){
		// 	while(x>0){
		// 		int rem = x%10;
		// 		temp = temp *10 + rem;
		// 		x/=10;
		// 	}
		// 	return temp;
			
		// }else{
		// 	x = x*(-1);
		// 	while(x>0){
		// 		int rem = x%10;
		// 		temp = temp *10 + rem;
		// 		x/=10;
		// 	}
		// 	return temp*(-1);
			
		// }

// optimal solution taken from instructor 
		int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
            rev = rev * 10 + pop;
        }
        return rev;
	
    }
}

public class Main {
	
  public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
	    	int x = sc.nextInt();
            Solution obj = new Solution();
			System.out.println(obj.reverseInteger(x));
	    	
		
	}
}