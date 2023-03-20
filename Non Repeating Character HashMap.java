/*
Non Repeating Character
Given a string S consisting of lowercase Latin Letters. Find the first non-repeating character in S.

Input Format
The first line will contain the string S.

Output Format
You need to print the first non-repeating character. If there is no non-repeating character then print -1 .

Example 1
Input

hello
Output

h 
Explanation

In the given string, the first character which is non-repeating is h, as it appears first and there is no other h in the string.

Example 2
Input

zxvczbtxyzvy
Output

c
Explanation

In the given string, c is the first character which is non-repeating.

Constraints:
1 <= S.length() <= 1000
*/

import java.io.*;
import java.util.*;

class Solution {
    public void nonRepeatingCharacter(String s) {
        // Your code here
		HashMap<Character,Integer>map = new HashMap<>();

		for(int i =0;i<s.length();i++){

			char ch = s.charAt(i);

			map.put(ch, map.getOrDefault(ch,0)+1);
		}

		for(int i =0;i<s.length();i++){

			char ch = s.charAt(i);

			if(map.get(ch)==1){
				System.out.print(ch);
				return;
			}
		}
		
		System.out.print(-1);
		return;

    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        s=sc.next();
        Solution Obj = new Solution();
        Obj.nonRepeatingCharacter(s);  
        System.out.println();
    }
}