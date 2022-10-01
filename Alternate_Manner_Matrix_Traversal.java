/*

Alternate Manner Matrix Traversal
Given a 2D array, the task is to print the 2D in alternate manner (First row from left to right, then from right to left, and so on).

The first two integers, M and N, represent the number of rows and columns respectively.

The next M lines contain N space separated integers, denoting the matrix

Examples:
Input :
2 2
1 2
2 3
Output :
1  2  
3  2 
Input :
3 3
7 2 3
2 3 4
5 6 1
Output :
7 2 3
4 3 2
5 6 1

*/

import java.util.*;
import java.lang.*;
import java.io.*;

public class Alternate_Manner_Matrix_Traversal
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
                Scanner sc = new Scanner(System.in);
                int r = sc.nextInt();
                int c = sc.nextInt();

                int arr[][] = new int[r][c];

                for(int i =0; i<r; i++)
                {
                        for(int j =0; j<c; j++)
                        {
                                arr[i][j] = sc.nextInt();
                        }
                }

                int a[][] = new int[r][c];

                for(int i =0; i<r; i++)
                {
                               if (i%2 == 0)
                               {
                                       for(int j = 0; j <c; j++){
                                        System.out.print(arr[i][j]+" ");                    
                                        }                                      
                               }
                                else{
                                        for(int j = c-1; j >=0; j--){
                                        System.out.print(arr[i][j]+" ");        
                                        }
                                }
                        System.out.println();
                }
            
                
    }
}