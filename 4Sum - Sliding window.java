/*
4Sum
Given an array nums of n integers, return an array of all the unique quadruplets [nums[a], nums[b], nums[c], nums[d]] such that:

0 <= a, b, c, d < n
a, b, c, and d are distinct.
nums[a] + nums[b] + nums[c] + nums[d] == target

You may return the answer in any order.

NOTE: You just have to complete the given function.

Expected time Complexity: O(N^3)

Input Format
First line contains the size of the array n.

second line will contain n space separated integers.

third line contains the target

Output Format
Return all the required unique quadruplets.

Example 1
Input

6
1 0 -1 0 -2 2 
0
Output

-2 -1 1 2
-2 0 0 2
-1 0 0 1
Explanation

There are three unique required quadruplets.

Example 2
Input

5
2 2 2 2 2
8
Output

2 2 2 2
Explanation

There is only one unique required quadruplets.

Constraints
1 <= nums.length <= 200

-10^9 <= nums[i] <= 10^9

-10^9 <= target <= 10^9

Topic Tags
2-Pointers
Sorting
Arrays
*/

import java.util.*;
import java.io.*;
class Solution {
   public List<List<Integer>> fourSum(int[] nums, int target) {
       // Write your code here

	   List<List<Integer>> res = new ArrayList<>();
	   Arrays.sort(nums);
	   int i = 0;
	   int n = nums.length;
	   while(i<n){
		   int j = i+1;

		   while(j<n){
			   long remainingTarget = (long)(target - (long)nums[i] - (long)nums[j]);
                int l = j+1;
                int r = n-1;

                while(l<r){
                    long currSum = (long)(nums[l] + nums[r]);

					if(currSum==remainingTarget){
						List<Integer> curr= new ArrayList<>();
						curr.add(nums[i]);
						curr.add(nums[j]);
						curr.add(nums[l]);
						curr.add(nums[r]);
						res.add(curr);

						int prevL = nums[l];
						while(l<r && prevL == nums[l]) l++;

						int prevR = nums[r];
						while(l<r && prevR == nums[r]) r--;
					}
					else if (currSum<remainingTarget){
						int prevL = nums[l];
						while(l<r && prevL == nums[l]) l++;
					}
					else if (currSum>remainingTarget){
						int prevR = nums[r];
						while(l<r && prevR == nums[r]) r--;
					}
				}

			   int prevJ = nums[j];
			   while(j<n && prevJ==nums[j]) j++;
		   }

		   int prevI = nums[i];
		   while(i<n && prevI==nums[i]) i++;		   
	   }

	   return res;
   }
}

public class Main
{
	    
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++)
            nums[i] = sc.nextInt();
        int k = sc.nextInt();
        Solution Obj = new Solution();
        List<List<Integer>> res = Obj.fourSum(nums, k);

      
        for(int i= 0; i<res.size(); i++){
           Collections.sort(res.get(i));
        }

     
        Collections.sort(res, new Comparator<List<Integer>>() {
               public int compare(List<Integer> frst, List<Integer> scnd) {
                    int i=0;
                    while(frst.get(i)==scnd.get(i)) i++;
                    return frst.get(i)-scnd.get(i);
                    }
                });

        for(int i=0; i<res.size(); i++){   
            for(int j=0; j<4; j++){
                System.out.print(res.get(i).get(j) + " ");
            } 
            System.out.println("");
        }
        sc.close();
	}
}