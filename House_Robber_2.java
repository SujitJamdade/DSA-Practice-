/*
House Robber 2
You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed. All houses at this place are arranged in a circle. That means the first house is the neighbor of the last one. Meanwhile, adjacent houses have a security system connected, and it will automatically contact the police if two adjacent houses were broken into on the same night.

Take an integer array nums input that will represent the amount of money for each house, and print the maximum amount of money you can rob tonight without alerting the police.

Input Format
The first line contains integer N

The second line contains n integers arr[i].

Output Format
Print the maximum money you can rob.

EXAMPLE 1
Input

3
2 3 2
Output

3
EXPLANATION

You cannot rob house 1 (money = 2) and then rob house 3 (money = 2), because they are adjacent houses.

EXAMPLE 2
Input

4
1 2 3 1
Output:

4
EXPLANATION

Rob house 1 (money = 1) and then rob house 3 (money = 3).

The total amount you can rob = 1 + 3 = 4.

CONSTRAINTS
0 <= nums.length <= 15

0 <= nums[i] <= 1000
*/

import java.util.*;
import java.lang.*;
import java.io.*;

public class House_Robber_2
{

    public static int robHouse(int idx, int end, int[] arr){

        if(idx>end){
            return 0;
        }

        int rob = robHouse(idx+2,end,arr) + arr[idx];

        int skip = robHouse(idx+1,end,arr);

        int ans = Math.max(rob,skip);

        return ans;
    }

    
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();

                int arr[] = new int[n];

                for(int i = 0; i<n; i++){
                        arr[i] = sc.nextInt();
                }

                if(n==1){
                    System.out.println(arr[0]);
                    return;
                }

            int starFrom0 = robHouse(0,n-2,arr);
            int starFrom1 = robHouse(1,n-1,arr);

            int robbary = Math.max(starFrom0,starFrom1);
    
            System.out.println(robbary);          
	}
}