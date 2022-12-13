/*
First Element to Occur K Times
Given an array of 'n' integers. Print the first element that occurs k number of times. If there is no element that occurs for at least k number of times print -1.

Input Format
Line 1: contains two integers n and k.

Line 2: contains n-spaced integers denoting elements of the array.

Output Format
Print a single integer denoting the first element in the array which occurs at least k times. If no such element exists, print -1.

Example 1
Input

7 2
1 7 4 3 4 8 7
Output

4
Explanation

As we traverse the array the first number whose frequency becomes greater than or equal to k(2) is 4. Hence, the answer is 4.

Example 2
Input

7 4
2 4 1 2 2 19 3
Output

-1
Explanation

As no element in array has a frequency greater than or equal to k(4), the output will be -1.

Constraints
1 <= n <= 10^6

1 <= arr[i] <= 10^6
*/

import java.io.*;
import java.util.*;

class Solution {
    public void firstElementToOccurKTimes(int[] nums, int n, int k) {
        // Your code here

		// this question can be solve with haspmap and as well as with frequency array
		// since its not containing any negative value so its good to go with frequecny array
		// instead of using complex data type

		// 1. By using frequecny array

		int freqArray[] = new int[1000001];

		for(int i = 0; i<n; i++){
			freqArray[nums[i]] = freqArray[nums[i]] +1;
			if(freqArray[nums[i]]==k){
				System.out.println(nums[i]);
				return;
			}
		}
		System.out.println(-1);
		return;

		// 2. By using hashmap

		Map<Integer, Integer> hm = new HashMap<>();
		for(int i = 0; i<n; i++){
			// adding to hashMap
			if(hm.containsKey(nums[i])){
				int oldValue = hm.get(nums[i]);
				hm.put(nums[i], oldValue+1);
	
			}
			else{
				hm.put(nums[i],1);
			}
			// checking frequency 
			if(hm.get(nums[i])==k){
					System.out.println(nums[i]);
					return;
				}
		}
		System.out.println(-1);
		return;
     
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,k;
        n=sc.nextInt();
        k=sc.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        Solution Obj = new Solution();
        Obj.firstElementToOccurKTimes(nums,n,k);  
        System.out.println();
    }
}