/*

Count X in a string
Count recursively the total number of character x that appear in the given string.

Input Format
Only line contains the string in which we have to count character x.

Output Format
Print the number of x in string in a single line.

Example 1
Input

abcxxabc
Output

2 
Explanation

2 'x' are there in the given string.

Example 2
Input

addthe
Output

0
Explanation

No x is there in the given string.

Constraints
1 <= Len(str) <= 1000
string contains lowercase letter only.

*/

import java.util.*;
import java.lang.*;
import java.io.*;

public class Count_X_in_a_string
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
                Scanner sc = new Scanner(System.in);
                String s = sc.nextLine();

                int n = s.length();
                int count = countChars(s,'x');
                System.out.println(count);
	}

        public static int countChars(String s, char x){

                // int c = 0;
                // for(int i = 0; i<n; i++){

                //         char x = s.charAt(i);
                //         if(x == 'x'){
                //                 c++;
                //         }
                // }
                // return c;
                        
                  if (s.length() == 0)
                    return 0;
                  else if (s.charAt(0) == x)
                    return 1 + countChars(s.substring(1), x);
                  else
                    return countChars(s.substring(1), x);
                }      
}