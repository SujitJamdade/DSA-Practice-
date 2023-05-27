/*

Monster Battle 1
You are the sole protector of the kingdom Accio. One fine day, the neighboring kingdom Oicca attacks you. They have a large army, but they are not very smart. One monster hits you once, and then goes to the end of the line. The next monster hits you after that, and also joins the end of the line.

However, the army has a Captain Monster. You are given the index of this monster. As soon as the Captain Monster dies, the army is defeated.

You have n monsters to face, each with a certain amount of health. You have to fight the monsters in the order they attack you. If a monster has x health, and you hit it, it will have x - 1 health left. If it has 0 or less health, it dies. If it has more than 0 health, it goes to the end of the line.

You must find out the minimum number of attacks it will take you to take down the Captain Monster and win the battle.

The leftmost monster attacks you first and goes to the right end, the second monster attacks you second and goes to the right end, and so on.

Input Format
The first line contains two integers, n and k, the number of monsters and the index of the Captain Monster, respectively.

The second line contains n integers, the health of each monster.

Output Format
Output a single integer, the minimum number of attacks it will take you to win the battle.

Example 1
Input

3 2
2 3 1
Output

3
Explanation

You attack all monsters once, leading to the enemy army having healths [1 2 0]

At this stage the Captain Monster has health 0, and thus dies. You win the battle in 3 attacks.

Example 2
Input

4 0
3 1 1 1
Output

6
Explanation

You attack all monsters once, leading to the enemy army having healths [2 0 0 0]

At this stage the Captain Monster has health 2, and thus takes 2 more attacks to be taken down. You win the battle in 6 attacks.

Constraints
1 <= n <= 100
1 <= health[i] <= 100
0 <= k < n
Topic Tags
Queues
Arrays

*/

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" ");
        int n = Integer.parseInt(line[0]);
        int k = Integer.parseInt(line[1]);
        int[] health = new int[n];
        line = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            health[i] = Integer.parseInt(line[i]);
        }
        Solution ob = new Solution();
        System.out.println(ob.minAttacksNeeded(health, k));
    }
}

class Solution {
    public static int minAttacksNeeded(int[] health, int k) {

		int attack = 0;

		while(health[k]>0){

			for(int i = 0; i<health.length; i++){

				if(health[i]>0){
					health[i] --;
					attack++;
				}

				if(health[k]==0) return attack;
			}
		}
		return 0;
    }
}