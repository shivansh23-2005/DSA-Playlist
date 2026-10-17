// LeetCode Problem: Reverse Linked List II
// Link: https://leetcode.com/problems/reverse-linked-list-ii/
// Difficulty: Medium
// Language: java

class Solution {
public ListNode reverseBetween(ListNode head, int left, int right) {
if (left == right) return head;


    int p = 1;
    ListNode curr = head;
    ListNode temp = null;

    while (p != left) {
        temp = curr;
        curr = curr.next;
        p++;
    }

    ListNode start = curr;
    ListNode prev = null;
    ListNode next = null;

    while (p <= right) {
        next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
        p++;
    }

    if (temp != null) {
        temp.next = prev;
    } else {
        head = prev;
    }

    start.next = curr;

    return head;
}


}
