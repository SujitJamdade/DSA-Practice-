/*
Valid Parenthesis String
Given a string s containing only three types of characters: '(', ')' and '*', print true if s is valid.

The following rules define a valid string:
Any left parenthesis '(' must have a corresponding right parenthesis ')'.
Any right parenthesis ')' must have a corresponding left parenthesis '('.
Left parenthesis '(' must go before the corresponding right parenthesis ')'.
'*' could be treated as a single right parenthesis ')' or a single left parenthesis '(' or an empty string "".

Input Format
First line contains a single integer n(length of string).
Second line contains the string s of size n.

Output Format
Print true if the given string is valid else print false.

Example 1
Input

2
()
Output

true
Example 2
Input

4
((*)
Output

true
Explanation

Here '*' will treat as ')' , so output is true.

Constraints
1 <= s.length <= 100
s[i] is '(', ')' or '*'.
*/

import java.util.*;

class Solution{
    public static boolean checkValidString(int n, String s){
        //write code here

		// help taken from : https://www.youtube.com/watch?v=KuE_Cn3xhxI
		// still question not solve getting error in code
		// need to discuss
		Stack <Integer> star = new Stack<>();
		Stack <Integer> open = new Stack<>();

		for(int i = 0; i<n;i++){  
			char ch = s.charAt(i);

			if(ch=='*'){
				star.push(i);
			}
			else if(ch=='('){
				open.push(i);
			}
			else{
				// for closing bracket
				if(!open.empty()){
					open.pop();
				}
				else if(!star.empty()){
					star.pop();
				}
				else{
					return false;
				}
			}
		}

		while(!open.empty()){
			if(star.empty()){
				return false;
			}
			else if(open.peek()<star.peek()){
				open.pop();
				star.pop();
			}
			else{
				return false;
			}
		}

		return true;
    }
}

public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        String s = sc.next();
        Solution obj = new Solution();
        boolean ans = obj.checkValidString(n,s);
        if(ans==true){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}