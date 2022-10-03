/*

Toeplitz Matrix

Given an m x n matrix, return true if the matrix is Toeplitz. Otherwise, return false.

A matrix is Toeplitz if every diagonal from top-left to bottom-right has the same elements.

Input Format
Input consists of three lines.

First line contains two integers, m and n which define the row and column size of the matrix respectively.

Next line m lines contain n spaced integers that denote the matrix element.

Output Format
Return true if a matrix is Toeplitz Matrix, else return false.

Example 1
Input

3 4
1 2 3 4
5 1 2 3
9 5 1 4
Output

false
Explanation

Every diagonal from top-left to bottom-right doesn't have the same value. (2,2,4) diagonal is where it becomes false.

Example 2
Input

3 4
1 2 3 4
5 1 2 3
9 5 1 4
Output

true
Explanation

Matrix is a Toeplitz Matrix

Constraints
m == matrix.length

n == matrix[i].length

1 <= m, n <= 20

0 <= matrix[i][j] <= 99

*/

import java.util.*;
import java.lang.*;
import java.io.*;

public class Toeplitz_Matrix
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code 

                Scanner sc = new Scanner(System.in);
                int a = sc.nextInt();
                int b = sc.nextInt();
                
                int [][]matrix = new int [a][b];

                for(int i =0; i<a; i++){
                        for(int j = 0; j<b; j++){
                                matrix[i][j]=sc.nextInt();
                        }
                }

                boolean ans = toeplitzMatrix(matrix);
                System.out.println(ans);   
        }
        
            public static boolean toeplitzMatrix(int[][] matrix) {
                
                int m = matrix.length;
                int n = matrix[0].length;
                
                
                for(int i = 0; i<m-1; i++){
                    for(int j = 0; j<n-1; j++){
                        if ((matrix[i][j]) != (matrix[i+1][j+1])){
                            // System.out.println(false);
                                return false;
                        }   
                    }
                    
                }
                 // System.out.println(true);   
                return true;              
            }
}