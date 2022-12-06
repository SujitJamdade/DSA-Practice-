/*
Balanced Brackets
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is Balanced if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Input Format
The first line contains a single integer n(Length of the string)

The second line contains string s

Output Format
Print YES is brackets are balanced otherwise print NO

Example 1
Input

2
()
Output

YES
Explanation As ( was closed with ) therefore output isYES

Example 2
Input

2
(]
Output

NO
Explanation The bracket ( was not closed, Therefore output is NO

Constraints
1 <= s.length <= 104
s consists of parentheses only '()[]{}'

*/

import java.util.*;

class Solution{
    public void balancedBrackets(String s, int n) {
        // write code here

		Stack<Character> ch = new Stack<>();

		for(int i = 0; i<s.length();i++){

			if(ch.empty()){
				ch.push(s.charAt(i));
			}
			else{
				if(ch.peek()=='(' && s.charAt(i)==')'){
					ch.pop();
				}
				else if(ch.peek()=='{' && s.charAt(i)=='}'){
					ch.pop();
				}
				else if(ch.peek()=='[' && s.charAt(i)==']'){
					ch.pop();
				}
				else{
					ch.push(s.charAt(i));
				}
			}
		}
		
		if(ch.empty()){
			System.out.println("YES");
		}
		else{
			System.out.println("NO");
		}
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        Solution Obj = new Solution();
        Obj.balancedBrackets(s, n);
    }
}