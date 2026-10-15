// LeetCode Problem: Delete the Middle Node of a Linked List
// Link: https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list/
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
    public ListNode deleteMiddle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        ListNode ptr_1=null;
        ListNode ptr_2=null;
        if(head.next==null){
            return null;
        }
        while (fast!=null && fast.next!=null){
            ptr_1=slow;
            slow=slow.next;
            ptr_2=slow.next;
            fast=fast.next.next;

        }
        ptr_1.next=ptr_2;
        slow.next=null;
        return head;
    }
}