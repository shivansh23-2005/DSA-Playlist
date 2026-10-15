// LeetCode Problem: Swap Nodes in Pairs
// Link: https://leetcode.com/problems/swap-nodes-in-pairs/
// Difficulty: Medium
// Language: java

class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        ListNode nextptr = null;

        if (curr == null || curr.next == null) return curr;

        head = curr.next;

        while (curr != null && curr.next != null)
        {
            nextptr = curr.next;
            ListNode nextPair = nextptr.next;

            nextptr.next = curr;
            curr.next = nextPair;

            if (prev != null) {
                prev.next = nextptr;
            }

            prev = curr;
            curr = nextPair;
        }

        return head;
    }
}