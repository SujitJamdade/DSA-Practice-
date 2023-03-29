/*
BFS Implementation
Given a directed graph. The task is to do Breadth First Search of this graph.

Note: Graph does not contain multiple edges and self loops.

Input Format
The First line of test case contains two integers N and E which denotes the no of vertices and no of edges respectively.

The Second line of test case contains E space separated pairs u and v denoting that there is a edge from u to v .

Output Format
In a new line, print the BFS of the graph starting from 0.

Example 1
Input

5 4
0 1 0 2 0 3 2 4
Output

0 1 2 3 4
Explanation

0 is connected to 1 , 2 , 3

2 is connected to 4 so starting from 0 , bfs will be 0 1 2 3 4.

Example 2
Input

3 2
0 1 0 2
Output

0 1 2
Explanation

0 is connected to 1 , 2 so starting from 0 , bfs will be 0 1 2.

Expected Time Complexity: O(V + E)

Expected Auxiliary Space: O(V)

Constraints
2 <= N <= 10^4

1 <= E <= (N*(N-1))/2

0 <= u, v <= N

Topic Tags
Queues
Graphs
BFS
*/

import java.util.*;
import java.io.*;
 
class Graph {
    public int vertices;
    public ArrayList<Integer>[] adjList;
 
    Graph(int v) {
        this.vertices = v+1;
        adjList = new ArrayList[v+1];
        
        for (int i = 0; i <= v; i++) adjList[i] = new ArrayList<Integer>();
    }
 
    void addEdge(int v, int w) {
        adjList[v].add(w);
     
    }
 
    void BFS(int x) {
        // your code here
		boolean [] visited = new boolean[vertices];
		Queue<Integer> que = new ArrayDeque<>();
		que.add(x);

		while(que.size()>0){

			int curr = que.remove();

			if(visited[curr]) continue;
			visited[curr] = true;

			System.out.print(curr + " ");

			for(int nbr : adjList[curr]){
				if(!visited[nbr]) que.add(nbr);
			}
		}
		
    }
}
 
public class Main {
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int e = sc.nextInt();
        Graph g = new Graph(110);
        for(int i =0;i<e;i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            g.addEdge(x,y);
        }
        g.BFS(0);
    }
}
