/*
Grid Games
You are given a 0-indexed 2D array grid of size 2 x n, where grid[r][c] represents the number of points at position (r, c) on the matrix. Two robots are playing a game on this matrix.

Both robots initially start at (0, 0) and want to reach (1, n-1). Each robot may only move to the right ((r, c) to (r, c + 1)) or down ((r, c) to (r + 1, c)).

At the start of the game, the first robot moves from (0, 0) to (1, n-1), collecting all the points from the cells on its path. For all cells (r, c) traversed on the path, grid[r][c] is set to 0. Then, the second robot moves from (0, 0) to (1, n-1), collecting the points on its path. Note that their paths may intersect with one another.

The first robot wants to minimize the number of points collected by the second robot. In contrast, the second robot wants to maximize the number of points it collects. If both robots play optimally, return the number of points collected by the second robot.

Input Format
The first line of input contains a single integer n.

The next 2 lines of input contains n space separated integers.

Output Format
Return the number of points obtained by the second robot, if both play optimally.

Example 1
Input

3
2 5 4
1 5 1
Output

4
Explanation

The optimal path taken by the first robot is shown in red, and the optimal path taken by the second robot is shown in blue.The cells visited by the first robot are set to 0.The second robot will collect 0 + 0 + 4 + 0 = 4 points.

Example 2
Input

4
1 2 1 15
1 3 3 1
Output

7
Explanation

The optimal path taken by the first robot is shown in red, and the optimal path taken by the second robot is shown in blue.The cells visited by the first robot are set to 0.The second robot will collect 0 + 1 + 3 + 3 + 0 = 7 points.

Constraints
1 <= n <= 5*104

1 <= grid[r][c] <= 105
*/

import java.util.*;

class Solution {

    public long solve(int grid[][]) {
        // Your code here

		int n = grid[0].length;
		int[] suffRow0 = new int[n];
		int[] prefRow1 = new int[n];
		
		prefRow1[0] = grid[1][0];
		for(int i = 1; i<n;i++){
			prefRow1[i] = prefRow1[i-1] + grid[1][i];
		}

		suffRow0[n-1] = grid[0][n-1];
		for(int i = n-2; i>=0; i--){
			suffRow0[i] = suffRow0[i+1] + grid[0][i];
		}

		//now we have to consider the minimum possible sum
		//robot 2 can make out of all of the choices robot 1 can make
		//if robot 2 chooses best choice
		int res = Integer.MAX_VALUE;

		for(int i = 0;i<n;i++){
			//robot 1 will be switching rows on the ith column
			//robot 2 is left with 2 choices

			int choice1 = i==n-1 ? 0 : suffRow0[i+1];
			int choice2 = i==0 ? 0 : prefRow1[i-1];

			int robot2 = Math.max(choice1, choice2);

			res = Math.min(res, robot2);
		}
		return res;
    }
}

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int grid[][]=new int[2][n];
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<n;j++)
                grid[i][j]=sc.nextInt();

        }
        
        Solution obj=new Solution();
        System.out.println(obj.solve(grid));
        sc.close();
    }
}