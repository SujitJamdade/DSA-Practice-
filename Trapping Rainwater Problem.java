/*
Trapping Rainwater Problem
Given n non-negative integers representing an elevation map where the width of each bar is 1. Compute how much water it can trap after rain.

Input Format:
The first line contains one integer input n, the size of the array.

The second line contains n space-separated integers (arr[i]) that describe the width of each bar.

Output Format:
Prints a single integer value, which represents the amount of water it can hold.

Example 1:


Input:

12
0 1 0 2 1 0 1 3 2 1 2 1
Output:

6
Explanation: The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section) are being trapped.

Example 2:
Input:

6
4 2 0 3 2 5
Output:

9
Explanation: In this case, 9 units of rainwater will be trapped.

Constraints:
n == height.length

1 <= n <= 2 * 10^4

0 <= arr[i] <= 10^5
*/
import java.io.*;
import java.util.*;

class Solution {
    public void TappingWater(int[] arr, int n) {
        //Write code here and print output

		int leftMax [] = new int[n];
		int rightMax [] = new int[n];

		leftMax[0] = Integer.MIN_VALUE;
		for(int i = 1; i<n; i++){
			leftMax[i] = Math.max(arr[i-1],leftMax[i-1]);
		}

		rightMax[n-1] = Integer.MIN_VALUE;
		for(int i = n-2; i>=0; i--){
			rightMax[i] = Math.max(arr[i+1],rightMax[i+1]);
		}

		int water = 0;
		for(int i = 1;i<n-1;i++){
			int unit = Math.min(leftMax[i],rightMax[i])-arr[i];
			if(unit>0) {
				water +=unit;
			}
		}
		System.out.println(water);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
            int n= sc.nextInt();
      	    int[] arr= new int[n];

      	    for(int i=0;i<n;i++)
                arr[i]=sc.nextInt();
            
        
            Solution Obj = new Solution();
            Obj.TappingWater(arr, n);
            
        
        sc.close();
        
    }
}