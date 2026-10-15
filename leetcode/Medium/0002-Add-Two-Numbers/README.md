# Add Two Numbers

**Difficulty:** Medium  
**Topics:** Linked List, Math, Recursion  
**LeetCode URL:** [Add Two Numbers](https://leetcode.com/problems/add-two-numbers/)

## Problem Description

<p>You are given two <strong>non-empty</strong> linked lists representing two non-negative integers. The digits are stored in <strong>reverse order</strong>, and each of their nodes contains a single digit. Add the two numbers and return the sum&nbsp;as a linked list.</p>

<p>You may assume the two numbers do not contain any leading zero, except the number 0 itself.</p>

<p>&nbsp;</p>

## Examples

<p><strong class="example">Example 1:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2020/10/02/addtwonumber1.jpg" style="width: 483px; height: 342px;" />
<pre>
<strong>Input:</strong> l1 = [2,4,3], l2 = [5,6,4]
<strong>Output:</strong> [7,0,8]
<strong>Explanation:</strong> 342 + 465 = 807.
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> l1 = [0], l2 = [0]
<strong>Output:</strong> [0]
</pre>

<p><strong class="example">Example 3:</strong></p>

<pre>
<strong>Input:</strong> l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
<strong>Output:</strong> [8,9,9,9,0,0,0,1]
</pre>

## Constraints

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li>The number of nodes in each linked list is in the range <code>[1, 100]</code>.</li>
	<li><code>0 &lt;= Node.val &lt;= 9</code></li>
	<li>It is guaranteed that the list represents a number that does not have leading zeros.</li>
</ul>

## Solution

```java
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













```

---
<div align="center">

**🔄 Synced with [CommitSync](https://www.google.com/search?q=CommitSync+extension)**

*Automatically organized and synced by CommitSync.*

</div>
