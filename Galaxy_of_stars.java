/*

Galaxy of stars
Ninja wants to build a star pattern for a given odd number.

The pattern for ‘N’ = 7 will look like this:

*
**
***
****
***
**
*
Your task is that for a given odd integer 'N', print the pattern.

Input Format:
The first line contains an integer ‘N’, denoting the number of rows.

Output Format:
Print 'N' strings denoting the pattern.

Example 1:
Input:
3
Sample Output 1:
*
**
*
Explanation
We need to print a triangle-like pattern wherein each line, the number of stars will be increasing till the central row and then it starts decreasing. So for n=3, till 2nd-row stars increase and then start decreasing.

Constraints:
1 <= N <= 99

N is odd.

*/

import java.util.*;
import java.lang.*;
import java.io.*;

public class Galaxy_of_stars
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();

                for(int i = 1; i<=n;i++){

                        if (i <= ((n+1)/2)){                                
                                for(int j = 1; j<=i;j++){
                                        System.out.print("*");
                                }
                                System.out.println();
                        }
                        else{
                                for(int j = 1; j<=((n+1)-i);j++){
                                        System.out.print("*");
                                }
                                System.out.println();
                        }
                }
    }
}