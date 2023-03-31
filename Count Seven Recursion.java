/*
Count Seven
Given a non-negative int n, return the count of the occurrences of 7 as a digit, so for example 717 yields 2. (no loops). Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).

Example: count7(717) → 2

count7(7) → 1

count7(123) → 0

Input Format
First line contains n representing the input.

Output Format
Return the number of occurrences of 7 in the integer.

Example 1
Input

717
Output

2
Explanation

Number of occurrences of 7 is 2
Example 2
Input

213
Output

0
Explanation

0 occurrences of 7 in the input integer.
Constraints
1 <= n <= 10^6

Topic Tags
Recursion
*/
    import java.util.Scanner;

    class Solution{
        public static int count7(int n) {
            // Your code here

			int cnt =0;
			if(n==0){
				return 0;
			}
			
			int digit = n%10;
			if(digit==7){
				cnt++;
				return cnt + count7(n/10);
			}
			else{
				return cnt + count7(n/10);
			}
        }   
    }
    public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt(); 
            System.out.println(Solution.count7(n));
        }
    }