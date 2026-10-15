// LeetCode Problem: Remove Duplicates from Sorted List II
// Link: https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/
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
    public ListNode deleteDuplicates(ListNode head) {
        ArrayList<Integer>list=new ArrayList<>();
        ArrayList<Integer>result=new ArrayList<>();
        ListNode ptr=head;
        while(ptr!=null)
        {
          list.add(ptr.val);
          ptr=ptr.next;
        }
        for(int i=0;i<list.size();i++)
        {
                if (Collections.frequency(list,list.get(i)) == 1) {
                result.add(list.get(i));
        }
        }
        ListNode dummy=new ListNode(0);
        ListNode curr=dummy;
        for(int i=0;i<result.size();i++)
        {
            curr.next= new ListNode(result.get(i));
            curr=curr.next;
        }
         return dummy.next;   
    }
}