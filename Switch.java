/*

#Conditional Problem-4

Write a Java Program using switch case which will give the following outputs in different inputs: "I am the first letter" if input is 'A', "I am the second letter" if input is 'B', "I am the third letter" if input is 'C',"I am the fourth letter" if input is 'D', "I am the fifth letter if input is 'E' and "I don't belong here" for any other input character. Note that, Input characters will only be Capital Letters.

Input Format First line contains a character

output Format Print the sentence related to the character as per description.

Example ' Input 'A'

Output I am the first letter

Input 'K'

Output I don't belong here

*/

import java.util.*;
import java.lang.*;
import java.io.*;

public class Switch
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
                Scanner sc = new Scanner(System.in);

              char ch = sc.next().charAt(0);

                switch (ch){
                        case 'A': 
                                System.out.println("I am the first letter");
                                break;

                        case 'B': 
                                System.out.println("I am the second letter");
                                break;

                        case 'C': 
                                System.out.println("I am the third letter");
                                break;

                        case 'D': 
                                System.out.println("I am the fourth letter");
                                break;

                        case 'E': 
                                System.out.println("I am the fifth letter");
                                break;

                        default :
                                System.out.println("I don't belong here");
                                
                }
	}
}