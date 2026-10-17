# Reverse Linked List II

**Difficulty:** Medium  
**Topics:** Linked List  
**LeetCode URL:** [Reverse Linked List II](https://leetcode.com/problems/reverse-linked-list-ii/)

## Problem Description

<p>Given the <code>head</code> of a singly linked list and two integers <code>left</code> and <code>right</code> where <code>left &lt;= right</code>, reverse the nodes of the list from position <code>left</code> to position <code>right</code>, and return <em>the reversed list</em>.</p>

<p>&nbsp;</p>

## Examples

<p><strong class="example">Example 1:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2021/02/19/rev2ex2.jpg" style="width: 542px; height: 222px;" />
<pre>
<strong>Input:</strong> head = [1,2,3,4,5], left = 2, right = 4
<strong>Output:</strong> [1,4,3,2,5]
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> head = [5], left = 1, right = 1
<strong>Output:</strong> [5]
</pre>

## Constraints

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li>The number of nodes in the list is <code>n</code>.</li>
	<li><code>1 &lt;= n &lt;= 500</code></li>
	<li><code>-500 &lt;= Node.val &lt;= 500</code></li>
	<li><code>1 &lt;= left &lt;= right &lt;= n</code></li>
</ul>

<p>&nbsp;</p>
<strong>Follow up:</strong> Could you do it in one pass?

## Solution

```java
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

```

---
<div align="center">

**🔄 Synced with [CommitSync](https://www.google.com/search?q=CommitSync+extension)**

*Automatically organized and synced by CommitSync.*

</div>
