/*
Postfix to Infix
You are given a postfix expression.

You are required to convert it to infix and print.

Note

Use brackets in infix expressions to indicate precedence. For a better understanding, check the example.

Input Format
The first line contains a string s, denoting the postfix expression.

Output Format
In the second line, print the infix expression.

Example 1
Input
264*8/+3-
Output
((2+((6*4)/8))-3)

Explanation
The postfix to the infix expression is printed in the second line.

Example 2
Input

12+34*5/6*7/+
Output

4
((1+2)+((((3*4)/5)*6)/7))
++12/*/*34567

Explanation
The postfix to the infix expression is printed in the second line.

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
	ob.postFixToInfix(exp);
	ob.postFixToPrefix(exp);
	
  }
}

class Solution{
	public static void postFixToInfix(String exp){
       
		int n = exp.length();
		Stack <String> st = new Stack<>();

		for(int i = 0; i<n; i++){
			char ch = exp.charAt(i);

			if(ch =='+' || ch =='-' || ch =='*' || ch =='/' ){
		
				String operand1 = st.pop();
				String operand2 = st.pop();

				String res = "(" + operand2 + ch + operand1 +")";
				st.push(res);
			}
			else{
				st.push(ch+"");
			}
		}
		// last peek element is InFix Expression
		System.out.println(st.peek());
    }

}                         