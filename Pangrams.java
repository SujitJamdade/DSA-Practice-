/*

Pangrams
A pangram is a string that contains every letter of the alphabet. Given a sentence determine whether it is a pangram in the English alphabet. Ignore case. Return either pangram or not pangram as appropriate.

Input
The first line inputs a string, S.

Constraints:
0 < length of s <= 1000
Each character of s, s[i]∈{a-z,A-Z,space}

Output
In a new line, print "pangram" if string contains every letter of the alphabet else "not pangram".

Example
Input:
We promptly judged antique ivory buckles for the next prize
Output:
pangram
Explanation:
All of the letters of the alphabet are present in the string.

Input:
We promptly judged antique ivory buckles for the prize
Output:
not pangram
Explanation:
The string lacks an x.

*/

import java.util.*;
import java.lang.*;
import java.io.*;

public class Pangrams
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
                Scanner sc = new Scanner(System.in);
                String s = sc.nextLine();

                int charArray [] = new int[26];

                s = s.toLowerCase();


                for(int i = 0; i < s.length(); i++){

                        int ch = s.charAt(i)  - 'a'; // checking index value   

                        // excluding space value
                        if (ch !=(-65) ){                          
                        charArray[ch] = 1; 

                        }
                        
                }

                int sum = 0;
                for(int x: charArray){
                        sum +=x;
                }

                if(sum == 26){
                        System.out.println("pangram");
                }
                else{
                        System.out.println("not pangram");
                }
   }
}