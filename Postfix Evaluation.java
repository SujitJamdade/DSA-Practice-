/*
Postfix Evaluation
You are given a postfix expression.

You are required to evaluate it and print its value. 

Input Format
The first line contains a string s, denoting the postfix expression.

Output Format
In the first line of Output print, the answer is evaluated.

Example 1
Input

264*8/+3-
Output
2

Explanation

The evaluated expression is printed in the first line.

Example 2
Input

12+34*5/6*7/+
Output
4

Explanation

The evaluated expression is printed in the first line.

Constraints
Expression is a valid prefix expression

The only operators used are +, -, *, /

All operands are single-digit numbers.

*/

import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String exp = br.readLine();
    Solution ob =new Solution();
    ob.evaluation(exp);	
  }
}

class Solution{
    public void evaluation(String exp){
        //Write code here

		int n = exp.length();
		Stack <Integer> st = new Stack<>();

		for(int i = 0; i<n; i++){

			char ch = exp.charAt(i);

			// checking is character is a digit number or not 
			if(Character.isDigit(ch)){
				// if its digit number then pushing it in stack
				st.push(ch - '0');				
			}
				
			else{

				// if character is a operator then popping last two peek as operand 1 and operand 2
				int operand1 = st.pop();
				int operand2 = st.pop();

				// pusing result of operand 2 operator operand 1 in stack
				if(ch == '+'){
					int res = operand2+operand1;
					st.push(res);
				}
				else if(ch == '-'){
					int res = operand2-operand1;
					st.push(res);
				}
				if(ch == '*'){
					int res = operand2*operand1;
					st.push(res);
				}
				if(ch=='/'){
					int res = operand2/operand1;
					st.push(res);
				}
			}
		}
		// last peek element is evaluation of postFix
		System.out.println(st.peek());
    }

}                         