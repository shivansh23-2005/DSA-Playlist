// LeetCode Problem: Rotate List
// Link: https://leetcode.com/problems/rotate-list/
// Difficulty: Medium
// Language: java

class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null)
            return head;

        int length = 0;
        ListNode curr = head;
        while (curr != null) {
            length++;
            curr = curr.next;
        }

        k = k % length;
        if (k == 0) return head;

        while (k-- > 0) {
            ListNode temp = head;
            ListNode prev = null;

            while (temp.next != null) {
                prev = temp;
                temp = temp.next;
            }

            temp.next = head;
            head = temp;
            prev.next = null;
        }
        return head;
    }
}
