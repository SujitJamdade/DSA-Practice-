/*

Keypad combination
You are given a string str. The string str will contains numbers only, where each number stands for a key pressed on a mobile phone.

The following list is the key to characters map

    0 -> .;
    1 -> abc
    2 -> def
    3 -> ghi
    4 -> jkl
    5 -> mno
    6 -> pqrs
    7 -> tu
    8 -> vwx
    9 -> yz
Complete the body of printKPC function - without changing signature - to print the list of all words that could be produced by the keys in str.

Use sample input and output to take idea about output

Input Format
Input consists of one line.

First line contains a string str.

Output Format
Words that can be produced by pressed keys indictated by str in order hinted by Sample output

Example 1
Input

78
Output

tv
tw
tx
uv
uw
ux
Explanation

These are the strings that can be formed.

tv, tw, tx, uv, uw, ux

Example 2
Input

1
Output

a
b
c
Explanation

These are the strings that can be formed.

a, b, c

Constraints
0 <= str.length <= 10

str contains numbers only

*/

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str;
        str = sc.nextLine();
        Solution obj = new Solution();
        obj.printKPC(str);
    }
}

class Solution {

	static String[] sarr = {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

	public static ArrayList<String> getKPC(String ques){

		if(ques.length()==0){
			ArrayList <String> ba = new ArrayList<>();
			ba.add(" ");
			return ba;
		}

		char first = ques.charAt(0);
		String ss = ques.substring(1);
		ArrayList <String> sans = getKPC(ss);

		int idx = first - '0';
		String  str = sarr[idx];

		ArrayList <String> ans = new ArrayList<>();

		for(int i =0; i<str.length(); i++){
			char ch = str.charAt(i);

			for(int j = 0; j<sans.size();j++){
				String sss = sans.get(j);
				String ansss = ch+sss;
				ans.add(ansss);
			}
		}
		return ans;
	}

	
	public static void printKPC(String ques) {
		// Your code here, Print output

		ArrayList <String> ans = getKPC(ques);

		for(int i =0; i<ans.size();i++){
			String anss = ans.get(i);
			System.out.println(anss);
		}

			
    }
}     