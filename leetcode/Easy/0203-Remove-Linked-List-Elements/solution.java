// LeetCode Problem: Remove Linked List Elements
// Link: https://leetcode.com/problems/remove-linked-list-elements/
// Difficulty: Easy
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
    public ListNode removeElements(ListNode head, int val) {
          while(head != null && head.val == val) {
            head = head.next;
        }
        ListNode ptr=head;
        ListNode prev=null;
        while(ptr!=null)
        {
            if(ptr.val==val)
            {
                prev.next=ptr.next;
            }
            else{
                prev=ptr;

            }
            ptr=ptr.next;
        } 
        return head; 
    }
}