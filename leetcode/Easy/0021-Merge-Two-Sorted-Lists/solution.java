// LeetCode Problem: Merge Two Sorted Lists
// Link: https://leetcode.com/problems/merge-two-sorted-lists/
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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ArrayList<Integer>q=new ArrayList<>();
        ListNode ptr1=list1;
        ListNode ptr2=list2;
        while(ptr1!=null)
        {
             q.add(ptr1.val);
             ptr1=ptr1.next;
        }
        while(ptr2!=null)
        { 
            q.add(ptr2.val);
             ptr2=ptr2.next;
        }
        Collections.sort(q);

        ListNode newlist = new ListNode();
        ListNode ptr= newlist;

        for (int val : q) {
            ptr.next = new ListNode(val);
            ptr= ptr.next;
        }

        return newlist.next;
    }
}