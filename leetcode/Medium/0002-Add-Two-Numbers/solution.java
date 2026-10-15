// LeetCode Problem: Add Two Numbers
// Link: https://leetcode.com/problems/add-two-numbers/
// Difficulty: Medium
// Language: java

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        LinkedList<Integer> result = new LinkedList<>();
        ListNode ptr1 = l1;
        ListNode ptr2 = l2;

        int carry = 0;
        int data;

        while (ptr1 != null && ptr2 != null) {
            data = ptr1.val + ptr2.val + carry;
            carry = data / 10;
            result.add(data % 10);
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }

        while (ptr1 != null) {
            data = ptr1.val + carry;
            carry = data / 10;
            result.add(data % 10);
            ptr1 = ptr1.next;
        }

        while (ptr2 != null) {
            data = ptr2.val + carry;
            carry = data / 10;
            result.add(data % 10);
            ptr2 = ptr2.next;
        }

        if (carry > 0) {
            result.add(carry);
        }

        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;

        for (int i = 0; i < result.size(); i++) {
            curr.next = new ListNode(result.get(i));
            curr = curr.next;
        }

        return dummy.next;
    }
}












