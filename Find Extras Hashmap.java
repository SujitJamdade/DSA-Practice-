/*

Find Extras 2
You are given a list of ids of n books in a book array.

As a library manager's assistant you need to find the books that are duplicates and return their ids.

Note

You need to write an algorithm that works in O(n) time.

Input Format
First line contains an integer n denoting size of array book.

Second line contains n integers denoting the ids of books in the book array.

Output Format
Return a list of ids that are duplicates.

Example 1
Input

8
4 3 2 7 8 2 3 1
Output

2 3
Explanation

2 and 3 are duplicates here

Example 2
Input

4
1 2 3 4
Output

Explanation

No book is a duplicate here

Constraints
1 <= N <= 10^5

-10^6 <= arr[i] <= 10^6

*/

import java.util.*;

class Solution {
    public ArrayList<Integer> duplicateBookIDS(int[] book) {
        //Write code here
		
		HashMap<Integer,Integer>map = new HashMap<>();

		for(int id:book){
			map.put(id, map.getOrDefault(id,0)+1);
		}

		ArrayList<Integer> arr = new ArrayList<>();
		for(int id:map.keySet()){
			if(map.get(id)>1){
				arr.add(id);
			}
		}
		return arr;
	}
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        Solution Obj = new Solution();
        ArrayList<Integer> res = Obj.duplicateBookIDS(arr);
        Collections.sort(res);
        for (int i = 0; i < res.size(); i++) {
            System.out.print(res.get(i) + " ");
        }
        System.out.println();
        sc.close();
    }
}