/*
Print Bracket Number
Given a string s, your task is to find the bracket numbers. The bracket numbers are the same numbers given to corresponding opening and closing brackets.

Input Format
The first line of input conatains string s.

Output Format
Your task is to find the bracket number.

Example 1
Input

(aa(bdc))p(dee)â€
Output

1 2 2 1 3 3
Explanation

The brackets have been assigned 1 2 2 1 3 3.

Example 2
Input

(((()(
Output

1 2 3 4 4 5
Explanation

The highlighted brackets in the given string (((()( has been assigned the numbers as: 1 2 3 4 4 5

Constraints
1 <= |s| <= 10^5

Note
The ArrayList class is a resizable array, which can be found in the java.util package.

Initialization of ArrayList

ArrayList<Type> Name_of_arraylist = new ArrayList<>();    // you get a empty arraylist -> []
For example, initializing an ArrayList of Integer:

ArrayList<Integer> list = new ArrayList<>();    // you get a empty arraylist -> []
Adding elements to ArrayList:

list.add(10);

list.add(30);

list.add(50);
now arraylist will be

[10,30,50]
To get elements from ArrayList:

Code           Output
list.get(0)   -> 10

list.get(2)   -> 50

list.get(3)   -> error(index out of bound)
*/

import java.io.*;
import java.util.*;

class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        
            String S = read.readLine();
            Solution ob = new Solution();
            ArrayList<Integer> result = ob.barcketNumbers(S);
            for(int value :  result)
            System.out.print(value + " ");
            System.out.println();
        
    }
}


class Solution {
     ArrayList<Integer> barcketNumbers(String S) {
        // code here
		ArrayList<Integer> ans = new ArrayList<>();
		Stack<Integer> st = new Stack<>();
		int count = 0;
		for(int i = 0; i < S.length(); i++) {
			if(S.charAt(i) == '(') {
				count++;
				st.push(count);
				ans.add(count);
			}else if(S.charAt(i) == ')') {
				ans.add(st.pop());
			}
		}
		return ans;
    }
};