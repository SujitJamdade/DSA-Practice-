/*
Infix Evaluation And Conversions
You are given an infix expression.

You are required to evaluate it and print it's value. You are also required to convert it to postfix and prefix print both of them.

Input Format
The first line contains a string s, denoting the infix expression.

Output Format
In the first line of Output print, the answer is evaluated.

In the second line, print the postfix expression.

In the last line, print the prefix expression.

Example 1
Input

((2+((6*4)/8))-3)
Output

2
264*8/+3-
-+2/*6483
Explanation

The evaluated expression is printed in the first line.

The infix to postfix expression is printed in the second line.

The infix-to-prefix expression is printed in the third line.

Example 2
Input

((1+2)+((((3*4)/5)*6)/7))
Output

4
12+34*5/6*7/+
++12/*/*34567
Explanation

The evaluated expression is printed in the first line.

The infix to postfix expression is printed in the second line.

The infix-to-prefix expression is printed in the third line.

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
    ob.evaluate(exp);
  }
}

class Solution{

	int prec(char ch ){
		if(ch == '^')return 3;
		else if(ch =='*' || ch =='/') return 2;
		else if(ch =='-' || ch =='+') return 1;
		else return -1;
	}

	String InfixToPostFix(String exp){

		int len = exp.length();
		Stack<Character> st = new Stack<>();
		String op = "";
		
		for(int i = 0;i<len; i++){

			char ch = exp.charAt(i);
			//1. if ch is operand add into output string
			if(Character.isLetterOrDigit(ch)){
				op = op + ch;
			}
			//2. if ch is open bracket then push into the stack
			else if(ch == '('){
				st.push(ch);
			}
			//3. if ch is close bracket then pop and add into op string until open brakcet encounter and then pop open bracket as well
			else if(ch == ')'){
				while(st.size()>0 && st.peek()!='('){
					op = op + st.peek();
					st.pop();
				}
				st.pop(); // for popping the open bracket 
			}
			else{ //  operator case
				
				/* if ch is operator then add into the string and pop from  stack 
					until a character whose precedence is less than scanned character encounter 
					after that push the operator back to stack */
				
				while(st.size()>0 && prec(ch) <= prec(st.peek())){
					op = op + st.peek();
					st.pop();
				}
				st.push(ch); // operator pushing back to stack
			}		
		}
		while(st.size()>0){
			op= op+st.peek();
			st.pop();
		}
		return op;
	}

	// post fix evalution
	int PostFixEvaluate(String exp){
		int len = exp.length();
		Stack<Integer> st = new Stack<>();

		for(int i = 0; i<len; i++){

			char ch = exp.charAt(i);
			if(Character.isDigit(ch)) st.push(ch - '0');
			else{
				int op1 = st.pop();
				int op2 = st.pop();
				if(ch=='+') st.push(op2+op1);
				else if(ch=='-') st.push(op2-op1);
				else if(ch=='/') st.push(op2/op1);
				else if(ch=='*') st.push(op2*op1);
			}
		}
		return st.peek();
	}


	// post fix to prefix
	String postFixToPreFix(String exp){

		int len = exp.length();
		Stack<String> st = new Stack<>();

		for(int i = 0; i<len; i++){

			char ch = exp.charAt(i);
			if(ch == '+' || ch == '-' || ch == '*' || ch == '/'){
				String op1 = st.pop();
				String op2 = st.pop();
				
				String op = ch + op2 + op1;
				st.push(op);
			}
			else{
				st.push(ch + "");
			}
		}
		return st.peek();
		
	}
	
    public void evaluate(String exp){
        //Write code here
		String postFix = InfixToPostFix(exp);
		int evaluation = PostFixEvaluate(postFix);
		String postFixToPreFix = postFixToPreFix(postFix);
		System.out.println(evaluation);
		System.out.println(postFix);
		System.out.println(postFixToPreFix);
		
    }
}               