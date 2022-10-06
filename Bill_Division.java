/*

Bill Division
Two friends Anna and Brian, are deciding how to split the bill at a dinner. Each will only pay for the items they consume. Brian gets the check and calculates Anna portion. You must determine if his calculation is correct.

For example, assume the bill has the following prices: bill = [2, 4, 6], Anna declines to eat item k = bill[2] which costs 6. If Brian calculates the bill correctly, Anna will pay (2+4)/2 = 3. If he includes the cost of bill[2], he will calculate (2 + 4 + 6)/2 = 6. In the second case, he should refund 3 to Anna.

If the bill is fairly split between then our code should print "Bon Appetit" without quotes, Otherwise, it should print the integer amount of money that Brian owes Anna.

Input
The first line contains two space-separated integers n and k , the number of items ordered and the 0-based index of the item that Anna did not eat respectively. The second line contains n space-separated integers bill[i] where 0 <= i < n. The third line contains an integer, b , the amount of money that Brian charged Anna for her share of the bill.

Output
If Brian did not overcharge Anna, print "Bon Appetit" (without quotes) on a new line; otherwise, print the difference (i.e., b(charged) - b(actual)) that Brian must refund to Anna. This will always be an integer.

Constraints:
2 <= n < 10^5 0 <= k < n 0 <= bill[i] <= 10^4 0 <= b <= Sum of all bills The amount of money due Anna will always be an integer

Sample Input:
4 1
3 10 2 9
12
Sample Output:
5
Explaination
Anna did not eat item bill[1] = 10, but she shared the rest of the items with Brian. The total cost of the shared items is 3 + 9 + 2 = 14 and, split in half, the cost per person is b(actual) = 7 . Brian charged her b(charged) = 12 for her portion of the bill. We print the amount Anna was overcharged, So we print, b(charged) - b(actual) = 12 - 7 = 5, on a new line.

*/

import java.util.*;
import java.lang.*;
import java.io.*;

public class Bill_Division
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                int k = sc.nextInt();
                int arr [] = new int[n];

                for(int i = 0; i<n; i++){
                        arr[i] = sc.nextInt();
                }

                int anna = sc.nextInt();

                int summ = 0;

                for(int i =0; i<n; i++){

                        if(i != k){
                                summ += arr[i];
                        }
                }

                int fair = summ/2;

                if(anna >fair){
                        System.out.println(anna-fair);
                }
                else{
                        System.out.println("Bon Appetit");
                }

                
     }
}