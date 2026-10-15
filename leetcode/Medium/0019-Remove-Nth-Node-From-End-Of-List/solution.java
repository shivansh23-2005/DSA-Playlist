// LeetCode Problem: Remove Nth Node From End of List
// Link: https://leetcode.com/problems/remove-nth-node-from-end-of-list/
// Difficulty: Medium
// Language: java

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
    public ListNode removeNthFromEnd(ListNode head, int n) {
           ListNode temp=head;
        int length=0;
        while(temp!=null)
        {
            length++;
            temp=temp.next;
        }
        if(length==n) return head.next;
        temp=head;
        for(int i=1;i<length-n;i++)
        {
            temp=temp.next;
        }  
        temp.next=temp.next.next;
        return head;
    }    
}