/*
Print Decreasing

1. You are given a positive number n. 
2. You are required to print the counting from n to 1.
3. You are required to not use any loops. Complete the body of print Decreasing function to achieve it.

Input Format
A number n
Output Format
n
n - 1
n - 2
.. 
1

Constraints
1 <= n <= 1000
Sample Input
5
Sample Output
5
4
3
2
1
*/
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printDecreasing(n);
    }

    public static void printDecreasing(int n){
        
        if(n ==0){
            return;
        }
        
        System.out.println(n);
        printDecreasing(n-1);
    }

}