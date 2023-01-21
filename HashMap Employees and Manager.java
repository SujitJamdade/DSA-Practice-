/*
Employees and Manager
Given a dictionary of employee:manager where they are represented by characters,

Print manager number_of employees_under_the_manager where managers sorted in lexical order

Number of employees also include indirect reports not only direct reports.

It may be assumed that an employee directly reports to only one manager.

In the above dictionary the root node/ceo is listed as reporting to himself.

Note You are given a dictionary named emp containing employee:manager as key:value so you only need to complete the function and print output

Input Format
First line of input denotes the number of pairs

followed by n space seperated pairs denoting employee and manager

Output Format
Print manager number_of_employees space seperated where each pair is in new line in lexically sorted order

Example
Input

6
A C
B C
C F
D E
E F
F F
Output

A 0  
B 0
C 2
D 0
E 1
F 5 
Explanation

Each denotes number of employees directly and indirectly under the manager. F is the CEO therefore all other employees are under him

Constraints
1<=Total number of employees<=100
*/

import java.io.*;
import java.util.*;

class Solution {

	int rec(String ceo, HashMap<String, ArrayList<String>> mngrAndDirect, TreeMap<String, Integer> ans){


		if(mngrAndDirect.containsKey(ceo) == false){
			ans.put(ceo,0);
			return 1;
		}

		int cnt = 0;

		for(String emp: mngrAndDirect.get(ceo)){
			cnt += rec(emp, mngrAndDirect, ans);
		}

		ans.put(ceo,cnt);

		return cnt+1;
	}

    public void EmpUnderManager(Map<String, String> emp)
	{

		HashMap<String, ArrayList<String>> mngrAndDirect = new HashMap();
		String ceo = "";

		for(String employee: emp.keySet()){

			String manager = emp.get(employee);

			if(manager.equals(employee)){
				ceo = employee;
				continue;
			}

			if(mngrAndDirect.containsKey(manager)){
				ArrayList<String> temp = mngrAndDirect.get(manager);
				temp.add(employee);
				mngrAndDirect.put(manager, temp);
			}
			else{
				ArrayList<String> arr = new ArrayList();
				arr.add(employee);
				mngrAndDirect.put(manager, arr);
			}
		}

		TreeMap<String, Integer> ans = new TreeMap();

		rec(ceo, mngrAndDirect,ans);

		for(String key : ans.keySet()){
			System.out.println(key+" "+ans.get(key));
		}
		
	}
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        Map<String,String> emp = new HashMap<String, String>();
        for(int i=0;i<n;++i){
			emp.put(sc.next(),sc.next());
        }
        Solution Obj = new Solution();
        Obj.EmpUnderManager(emp); 
    }
}