/*
Row-Column Difference in a 2-D Array
Given a N x N Matrix, we have to print

Col1sum - Row1sum

Col2sum - Row2sum

Col3sum - Row3sum

Col4sum - Row4sum

....

Colnsum - Rownsum

Input Format:

Input consists of a single integer N followed by N lines each containing N elements

Output Format:

Print N lines corresponding to the col-row difference

EXAMPLE 1:

Input:

5
1 2 3 4 5
6 7 8 9 10
1 2 3 4 5
6 7 8 9 10
1 2 3 4 5
Output::

0
-20
10
-10
20
EXPLANATION:

We have N = 5.

Calculate the sum corresponding to the rows and columns

EXAMPLE 2:

Input:

2
1 2
3 4
Output::

1
-1
EXPLANATION:

We have N = 2.

Calculate the sum corresponding to the rows and columns

CONSTRAINTS:

1 <= N <= 1000
*/

import java.util.*;
import java.lang.*;
import java.io.*;

public class Row_Column_Difference
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();

                int arr[][] = new int[n][n];

                for(int i =0; i<n; i++){
                        for(int j = 0; j<n; j++){
                                arr[i][j] = sc.nextInt();
                        }
                }

                int cnt= 0;

                while(cnt<n){

                       
                                int ans=0;
                                int c_sum = 0;
                                int r_sum = 0;
                                        
                        for(int r = 0; r<n; r++){
                                c_sum += arr[r][cnt];                                        
                        }

                        for(int c = 0; c<n; c++){
                                r_sum += arr[cnt][c];                                        
                        }

                        ans = c_sum - r_sum;
                        System.out.println(ans);

                        cnt++;
                }
                
      }
}