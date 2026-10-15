// LeetCode Problem: Reorder List
// Link: https://leetcode.com/problems/reorder-list/
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
    public void reorderList(ListNode head) {
        if(head == null || head.next == null)
            return;
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        if(fast!=null)
            slow=slow.next;

        ListNode temp=head;
        while(temp.next!=slow)
        {
            temp=temp.next;
        }
        temp.next=null;
        ListNode prev=null;
        ListNode next=null;
        ListNode curr=slow;
        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        ListNode ptr=null;
        ListNode ptr1=null;
        while(head!=null && prev!=null)
        {
            ptr=head.next;
            head.next=prev;
            ptr1=prev.next;
            prev.next=ptr;
            head=ptr;
            prev=ptr1;

        }
    }
}