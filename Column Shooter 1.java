/*
Column Shooter 1
Raj has been invited to participate in a column shooting competition. In this competition, you are taken to a field with n columns of heights a1 a2 a3 ... an.

You must stand at any one of the columns and you have to shoot a single bullet to your left. The bullet will travel in a straight line and will hit the first column it encounters that has a height greater than the height of the column you are standing on. It is possible that the bullet does not hit any column as well.

The score you obtain for your bullet is the height of the column above the point the bullet hits, multiplied by the distance between the two columns. If the bullet does not hit any column, your score is 0.

Raj wants to maximize his score. Help him find the maximum score he can obtain.

Input Format
The first line contains a single integer n denoting the number of columns.

The second line contains n space-separated integers a1 a2 a3 ... an denoting the heights of the columns.

Output Format
Print a single integer denoting the maximum score Raj can obtain.

Example 1
Input

6
4 2 1 5 2 3
Output

4
Explanation

If Raj stands on the first column, his bullet would not hit any column on his left. Here, his score would be 0.

If Raj stands on the second column, his bullet would hit the first column. Here, his score would be height of column above point of impact(2) * distance(1), i.e. 2.

If Raj stands on the third column, his bullet would hit the second column. Here, his score would be height of column above point of impact(1) * distance(1), i.e. 1.

If Raj stands on the fourth column, his bullet would not hit any column on his left. Here, his score would be 0.

If Raj stands on the fifth column, his bullet would hit the fourth column. Here, his score would be height of column above point of impact(3) * distance(1), i.e. 3.

If Raj stands on the sixth column, his bullet would hit the fourth column. Here, his score would be height of column above point of impact(2) * distance(2), i.e. 4.

Thus, the maximum score Raj can obtain is 4.

Example 2
Input

9
3 7 8 2 9 1 4 6 5
Output

10
Constraints
1 <= n <= 10^5

1 <= ai <= 10^9
*/

import java.io.*;
import java.util.*;

class Main {
    
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] heights = new int[n];
        for (int i = 0; i < n; i++) {
            heights[i] = input.nextInt();
        }
        System.out.println(maxScore(heights));
    }

    public static int maxScore(int[] heights) {

		int leftMax = 0;
		int MaxIndx = 0;
		int Maxscore = 0;
		for(int i = 0;i<heights.length; i++){

			for(int j = i; j>=0;j--){
				if(heights[j] >heights[i]){
					leftMax = heights[j];
					MaxIndx = j;
					break;
				}
			}
			
			int score = (leftMax - heights[i]) * (i-MaxIndx);
			
			Maxscore = Math.max(Maxscore, score);
			// System.out.println("Score at column "+ (i+1) +" : "+ Maxscore); // This if for debugging the code
		}
		return Maxscore;
    }

}
