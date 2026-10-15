// LeetCode Problem: Sort List
// Link: https://leetcode.com/problems/sort-list/
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
    public ListNode sortList(ListNode head) {
        ArrayList<Integer>a1=new ArrayList<>();
        ListNode ptr=head;
        while(ptr!=null)
        {
            a1.add(ptr.val);
            ptr=ptr.next;
        }
        Collections.sort(a1);
        ListNode dummy=new ListNode(0);
        ListNode curr=dummy;
        for(int i=0;i<a1.size();i++)
        {
            curr.next = new ListNode(a1.get(i));
             curr= curr.next;

        }
       return dummy.next;
    }
}