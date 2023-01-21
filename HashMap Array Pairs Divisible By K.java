/*
Array Pairs Divisible By K
Given an array of integers arr of even length n (always even) and an integer k.

We want to divide the array into exactly n / 2 pairs such that the sum of each pair is divisible by k.

Return true If you can find a way to do that or false otherwise.

Input Format
First line of input denotes the size n of array and value of k

followed by n space seperated integers denoting arr

Output Format
You just have to return true or false based on above condition

Example 1
Input

10 5
1 2 3 4 5 10 6 7 8 9
Output

true
Explanation

Pairs are (1,9),(2,8),(3,7),(4,6) and (5,10).

Example 2
Input

5 10
1 2 3 4 5 6
Output

false
Explanation

there is no way to divide arr into 3 pairs each with sum divisible by 10.

Constraints
1 <= n,k <= 10^5
n is even
1 <= arr[i] <= 10^6
*/

import java.io.*;
import java.util.*;

class Solution {
    public boolean arrayPairs(int[] arr, int k) {
		// write code here
		HashMap<Integer,Integer> map = new HashMap<>();

		for(int i = 0; i<arr.length;i++){
			int rem = arr[i]%k;
			map.put(rem, map.getOrDefault(rem, 0)+1);
		}

		for(Integer rem : map.keySet()){

			int remPair = k-rem;

			if(rem==0){
				continue;
			}

			if(map.containsKey(remPair)==false){
				return false;
			}else if( map.get(remPair) != map.get(rem)){
				return false;
			}
		}
		return true;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,k;
        n = sc.nextInt();
		k = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        Solution Obj = new Solution();
        if(Obj.arrayPairs(arr,k)){
			System.out.println("true");
		}else{
			System.out.println("false");
		}
    }
}