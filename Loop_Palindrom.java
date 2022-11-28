/*

AS Loops Problem 4
Write a program to print all the palindrome number in the range of a to b in increasing order.

Complete the function countPal which takes two arguments a and b and finds all numbers which are palindromes in range a to b.

Input Format
Only line contain two space separated integers a and b

Output Format
Print space separated integers between a and b(both inclusive) which are palindrome in sorted increasing order. There always exist at least one number between a and b.

Example 1
Input

1 50
Output

1 2 3 4 5 6 7 8 9 11 22 33 44 
Example 2
Input

50 100
Output

55 66 77 88 99
Constraints
1 <= a <= b <= 10^4

*/

import java.util.*;

class Loop_Palindrom{
     
    public static void countPal(int min, int max)
    {
                // write code here
		for(int i = min; i<=max; i++){

			int temp = i;
			int check = 0;

			while (temp>0){
				int rem = temp%10;
				check = check*10 + rem;
				temp/=10;
			}
			if(check==i){
				System.out.print(i+" ");
			}
		}
    }
}

public class Main {

    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();   
        Solution Obj = new Solution();
        Obj.countPal(start, end);
    }
}
