/*
Most Frequent Word in Array
Given an array arr containing N words consisting of lowercase characters. Your task is to find the most frequent word in the array. If multiple words have same frequency, then print the word whose first occurence occurs last in the array as compared to the other strings with same frequency.

Input Format
Input consist of two lines. The first line contains a number N representing the size of the array. Next line consists of N words separated by space.

Output Format
Print a single word which is the most frequent word in the array.

Example 1
Input

3
geeks for geeks
Output

geeks
Explanation

"geeks" comes 2 times.

Example 2
Input

2
hello world
Output

world
Explanation

"hello" and "world" both have 1 frequency. We print "world" as its first occurrence comes last in the input array.

Constraints
1 <= N <= 50000

1 <= |each string| <= 50

Note: Sum of length of all strings does not exceed 5*10^5
*/

import java.io.*;
import java.util.*;

class Solution {
    public void mostFrequent(String []arr, int n) {
        // write your code here

		HashMap<String,Integer> map = new HashMap<>();

		for(int i = 0; i<n;i++){
			map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
		}

		int count = 0;
		ArrayList<String> ans = new ArrayList<>();
		for(int i = 0; i<n;i++){
			
			if(map.get(arr[i])>1){
				ans.add(arr[i]);
				count++;
			}
		}

		if(count==0){
			System.out.print(arr[n-1]);
		}
		else{
			System.out.print(ans.get(ans.size()-1));
		}
		
		
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        String []arr = new String[n];
        for(int i=0;i<n;++i){
                arr[i] = sc.next();
        }
        Solution Obj = new Solution();
        Obj.mostFrequent(arr,n);  
        System.out.println('\n');
    }
}
