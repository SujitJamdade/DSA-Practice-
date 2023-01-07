/*
Triangular Number
Given a number n. Check whether it is a triangular number or not.

Note: A number is termed as a triangular number if we can represent it in the form of a triangular grid of points such that the points form an equilateral triangle and each row contains as many points as the row number, i.e., the first row has one point, the second row has two points, the third row has three points and so on.
The starting triangular numbers are 1, 3 (1+2), 6 (1+2+3), 10 (1+2+3+4).

Input Format
The input contains an integer n, representing the number to be tested.

Output Format
Output 1 if the integer is a triangular number, else output 0.

Example 1
Input:

55
Output:

1
Explanation:

55 is a triangular number. It can be represented in 10 rows.

Example 2
Input:

56
Output:

0
Explanation:

56 is not a triangular number.

Constraints:
1<=n<=10^6
*/
import java.util.*;

class Accio{
    static boolean TriangularNumber(int N){
        //write code here
		long start = 1; 
		long end = N;

		while(start<=end){
			long mid= (start+end)/2;
			long num = (mid*(mid+1))/2;
			if(num==N) return true;
			else if(num>N) end = mid-1;
			else start = mid+1;
		}
		return false;
    }
}

public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Accio obj = new Accio();
        boolean ans = obj.TriangularNumber(n);
        if(ans){
            System.out.println("1");
        }else{
            System.out.println("0");
        }
    }
}
