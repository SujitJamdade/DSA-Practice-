/*
Reverse Linked List
Given the head of a singly linked list, reverse the list, and return the reversed list.

Example 1:

Input: head = [1,2,3,4,5]
Output: [5,4,3,2,1]

Example 2:

Input: head = [1,2]
Output: [2,1]

Example 3:

Input: head = []
Output: []
 
Constraints:

The number of nodes in the list is the range [0, 5000].
-5000 <= Node.val <= 5000

*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    
    public static int getSize(ListNode head){
        int length = 0;
        ListNode curr = head;
        while(curr != null){
            curr = curr.next;
            length++;
        }
        return length;
            
    }
    
    public static ListNode getAt(ListNode head,int idx){
        ListNode curr = head;
        for(int i =0;i<idx;i++){
            curr = curr.next;
        }
        return curr;
    }
    
    public ListNode reverseList(ListNode head) {
        
        int n = getSize(head);
        
        int i = 0;
        int j = n-1;
        
        while(i<j){
            ListNode nodeAtI = getAt(head,i);
            ListNode nodeAtJ = getAt(head,j);
            
            int valI = nodeAtI.val;
            int valJ = nodeAtJ.val;
            
            nodeAtI.val = valJ;
            nodeAtJ.val = valI;
            
            i++;
            j--;
        }
        return head;
    }
}