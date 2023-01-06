/*
Circular tour
Suppose there is a circle. There are N petrol pumps in that circle. You will be given two sets of data.

The amount of petrol that every petrol pump has.

Distance from that petrol pump to the next petrol pump.

Find a starting point where the truck can start to get through the complete circle without exhausting its petrol in between.

Note Assume for 1 litre of petrol, the truck can go 1 unit of distance.

Input Format
The first line contains a single integer N denoting the number of petrol pumps.

The next line contains N integers denoting petrol in each petrol pump.

Next line contains N integers denoting distance from petrol pump to next petrol pump.

Output Format
Print the starting point where the truck can start to get through the complete circle without exhausting its petrol in between.

Print -1 if no solution exist

Example 1
Input

4
4 6 7 4
6 5 3 5
Output

1
Explanation

There are 4 petrol pumps with amount of petrol and distance to next

petrol pump value pairs as {4, 6}, {6, 5}, {7, 3} and {4, 5}. The first point from

where truck can make a circular tour is 2nd petrol pump. Output in this case is 1

(index of 2nd petrol pump).

Example 2
Input

2
1 1 2 3
Output

-1
Explanation

No solution exists.

Constraints
2 <= N <= 10000

1 ≤ petrol, distance ≤ 1000

Topic Tags
*/

import java.util.*;
class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			sc.nextLine();
			int p []= new int[n];
			int d []= new int[n];
			for(int i = 0;i<n;i++) p[i] = sc.nextInt();
			for(int i = 0;i<n;i++) d[i] = sc.nextInt();
			System.out.println(new Solution().tour(p,d));
	}
}
class Solution
{  

	boolean check(int start, int petrol[], int distance[]){

		int n = petrol.length;

		if (start==n) return false;
		
		int idx= start;
		int currentPetrol = 0;
		int bunk=0;

		while(bunk<n){
			currentPetrol += (petrol[idx] - distance[idx]);
			idx = (idx+1)%n;
			bunk++;
		}

		return (currentPetrol>=0);
	}
	
	int tour(int petrol[], int distance[])
	{
		int start = 0;
		int end = 0;
		int currentPetrol = 0;
		int n = petrol.length;

		while(end<n){
			currentPetrol += (petrol[end]-distance[end]);
			end++;

			while(currentPetrol<0){
				currentPetrol -= (petrol[start]-distance[start]);
				start++;
			}
		}

		boolean ans = check(start, petrol, distance);
		if(ans==true){
			return start;
		}
		else return -1;
		
	}
}