/*
Text Editor
Alice computer science teacher gave her a task to implement some of the functionality of the text editor.

The functions to implement are as follows:

WRITE(char x) : Write a character x in the document.

UNDO() : Erases the last change made to the document.

REDO() : Restores the most recent UNDO operation performed on the document.

READ() : Reads and prints the contents of the documents.

Alice has been given q queries.

Input Format
The first line of input contain a single integer q.

The next q line contain different functions to be performed.

Output Format
Return the contents when you encouter READ command.

Example 1
Input

7
WRITE A
WRITE B
WRITE C
UNDO
READ
REDO
READ
Output

AB ABC
Explanation

Perform “WRITE A” on the document. Therefore, the document contains only “A”.
Perform “WRITE B” on the document. Therefore, the document contains “AB”.
Perform “WRITE C” on the document. Therefore, the document contains “ABC”.
Perform “UNDO” on the document. Therefore, the document contains “AB”.
Print the contents of the document, i.e. “AB”
Perform “REDO” on the document. Therefore, the document contains “ABC”.
Print the contents of the document, i.e. “ABC”
Example 2
Input

5
WRITE A
WRITE B
WRITE C
UNDO
READ
Output

AB 
Explanation

Perform “WRITE A” on the document. Therefore, the document contains only “A”.
Perform “WRITE B” on the document. Therefore, the document contains “AB”.
Perform “WRITE C” on the document. Therefore, the document contains “ABC”.
Perform “UNDO” on the document. Therefore, the document contains “AB”.
Print the contents of the document, i.e. “AB”
Constraints
1 <= q <= 104

Topic Tags
Design
Stacks
*/

import java.io.*;
import java.util.*;
class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        int q=sc.nextInt();
        sc.nextLine();
        TextEditor obj=new TextEditor();
        for(int i=0;i<q;i++)
        {
            // String[] s = sc.nextLine().split(" "); 
            String s=sc.nextLine();
            if(s.equals("UNDO"))
            {
                obj.UNDO();
            }
            else if(s.equals("REDO"))
            {
                obj.REDO();
            }
            else if(s.equals("READ"))
            {
               obj.READ();

            }
            else
            {
                char ch=s.charAt(6);
                obj.WRITE(ch);
            }
        }
    }
}

class TextEditor{
    // your code here

	static Stack<Character> curr = new Stack<>();
	static Stack<Character> undo = new Stack<>();

    static void WRITE(char X)
    {
		curr.push(X);
    }
  
    static void UNDO()
    {
        if(curr.size()==0) return; 
		undo.push(curr.pop());
    }

    static void REDO()
    {
	    if(undo.size()==0) return; 
		curr.push(undo.pop());
    }

    static void READ()
    {
		Stack<Character> temp = new Stack<>();
		while(curr.size()>0){  // moving everything into temp stack
			temp.push(curr.pop());
		}

		while(temp.size()>0){
			System.out.print(temp.peek());
			curr.push(temp.pop());
			
		}
	     System.out.print(" ");
    }

}