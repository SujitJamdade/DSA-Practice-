/*
Balanced Expression
You are given a string exp representing an expression. You are required to check if the expression is balanced i.e. closing brackets and opening brackets match up well.

The string exp contains the characters '(', ')', '{', '}', '[', ']', operators i.e. '-', '+', '*', '/' and lowercase english alphabets.

Example:

[(a+b)+{(c+d)*(e/f)}] -> true
[(a+b)+{(c+d)*(e/f)]} -> false
[(a+b)+{(c+d)*(e/f)} -> false
([(a+b)+{(c+d)*(e/f)}] -> false
An input string is Balanced if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Your task is to complete the function expBalanced which receives the input expression exp as parameter and returns true or false depending on if the expression is balanced or not.

Input Format
The only line contains string exp

Output Format
Print true is the expression is balanced otherwise print false.

Example 1
Input

[(a+b)+{(c+d)*(e/f)}]
Output

true
Explanation As [ was closed with ], ( was closed with ) and { was closed with } therefore output istrue.

Example 2
Input

[(a+b)+{(c+d)*(e/f)]}
Output

false
Explanation The bracket { and [ was not closed, Therefore output is false.

Constraints
1 <= exp.length <= 10^4
*/

import java.io.*;
import java.util.*;

class Solution{

	char open(char ch){
		if(ch==')') return '(';
		else if (ch==']') return'[';
		else return '{';
	}
    boolean expBalanced(String str){
        // write code here
		int n = str.length();
		Stack <Character> st = new Stack<>();

		for(int i=0;i<n;i++){

			char ch = str.charAt(i);
			// if open brackets then push into the stacks
			if(ch=='(' || ch=='[' || ch=='{') st.push(ch);
			// if its closing bracket
			else if (ch==')' || ch==']' || ch=='}'){
				// checking if closing bracket and peek element having same type of open bracket
				// if its same type open and close bracket then pop from stack
				if(st.size()>0 && (st.peek()==open(ch))) st.pop();
				else{
					return false;
				}
			}
		}
		return st.size()==0;
    }
}

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        Solution Obj = new Solution();
        System.out.println(Obj.expBalanced(str));
    }
}