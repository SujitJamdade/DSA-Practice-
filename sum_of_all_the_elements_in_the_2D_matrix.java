/*

Problem 2
Given a matrix of size n x m. Your task is to find sum of all the elements in the matrix.

Input Format
First line contains two space seprated integers n and m.

Next n lines contains m space seprated integers denoting the elements in the matrix.

Output Format
Print an integer denoting the sum of all the elements in the matrix.

Example 1
Input

3 4
1 4 5 0
2 5 1 8
3 4 9 8
Output

50
Example 2
Input

3 3
1 1 1
1 1 1
1 1 1
Output

9
Constraints
1<=n,m<=100
-10^4<=matrix[i][j]<=10^4

*/

import java.util.*;

class Accio{
    static int Problem2(int n,int m,int[][] mat){
        //write code here
		int sum = 0;
		for(int i = 0;i<n;i++){
			for(int j=0;j<m;j++){
				sum+= mat[i][j];
			}
		}
		return sum;
    }
}

public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] mat = new int[n][m];
        for(int i=0;i<n;++i){
            for(int j=0;j<m;++j){
                mat[i][j] = sc.nextInt();
            }
        }
        Accio obj = new Accio();
        int ans = obj.Problem2(n,m,mat);
        System.out.println(ans);
    }
}