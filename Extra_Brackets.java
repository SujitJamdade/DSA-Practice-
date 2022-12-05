/*

Extra Brackets
You are given a string exp representing an expression. Assume that the expression is balanced i.e. the opening and closing brackets match with each other.

But, some pair of brackets maybe extra/needless. You are required to find out if there are extra brackets or not.

Input Format
First line contains the string exp

Output Format
Complete the function ExtraBrackets() and return true or false according to the question.

Example 1
Input

((a + b) + (c + d))
Output

false
Example 2
Input

(a + b) + ((c + d))
Output

true
Constraints
1 <= exp.size() <= 10000
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Solution {
    public boolean ExtraBrackets(String exp) {
        // Write your code here

		int n = exp.length();
		Stack <Character> st = new Stack<>();
		for(int i = 0; i<n;i++){
			char ch = exp.charAt(i);
			// ch is bot closing character
			if(ch!=')'){
				st.push(ch);
			}
			// ch is closing bracket
			else{
				// check if nothing is between opening and closing 
				if(st.size()>0 && st.peek() == '('){
					return true;
				}
				else{
					while(st.size()>0 && st.peek()!='('){
						st.pop();
					}
					st.pop();// to remove open bracket
				}
			}
		}
       return false;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String exp = br.readLine();
	    Solution Obj = new Solution();
        if(Obj.ExtraBrackets(exp))
            System.out.println("true");
        else
            System.out.println("false");
    }
}