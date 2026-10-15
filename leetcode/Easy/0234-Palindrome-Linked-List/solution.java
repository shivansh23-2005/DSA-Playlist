// LeetCode Problem: Palindrome Linked List
// Link: https://leetcode.com/problems/palindrome-linked-list/
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
    public boolean isPalindrome(ListNode head) {
        ArrayList<Integer>a=new ArrayList<>();
        ListNode ptr=head;
        while(ptr!=null)
        {
           a.add(ptr.val);
           ptr=ptr.next;
        } 
        int i=0;
        int j=a.size()-1;
        while(i<j)
        {
            if(!a.get(i).equals(a.get(j)))
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}