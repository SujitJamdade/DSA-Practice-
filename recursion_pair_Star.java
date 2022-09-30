/*
Given a string, compute recursively a new string where identical chars that are adjacent in the original string are separated from each other by a "*".

pairStar("hello") → "hello" pairStar("xxyy") → "xxyy" pairStar("aaaa") → "aaaa"

** Input format** The first line contains the string.

Output format Print the desired output where there is a * between consecutive same characters.

Example hello Output hel*lo

Constraints 1 <= Len(str) <= 1000
*/

import java.util.*;
import java.lang.*;
import java.io.*;

public class recursion_pair_Star
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
                Scanner sc = new Scanner(System.in);
                String s = sc.next();

                String ans = pairStar(s);
                System.out.println(ans);
	}

        public static String pairStar(String s){

                if(s.length() < 2){
                        return s;
                }

                if(s.charAt(0) == s.charAt(1)){
                        return s.charAt(0)+"*"+ pairStar(s.substring(1));
                }

                return s.charAt(0) + pairStar(s.substring(1));
        }
}