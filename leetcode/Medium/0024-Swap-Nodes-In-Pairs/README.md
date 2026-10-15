# Swap Nodes in Pairs

**Difficulty:** Medium  
**Topics:** Linked List, Recursion  
**LeetCode URL:** [Swap Nodes in Pairs](https://leetcode.com/problems/swap-nodes-in-pairs/)

## Problem Description

<p>Given a&nbsp;linked list, swap every two adjacent nodes and return its head. You must solve the problem without&nbsp;modifying the values in the list&#39;s nodes (i.e., only nodes themselves may be changed.)</p>

<p>&nbsp;</p>

## Examples

<p><strong class="example">Example 1:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">head = [1,2,3,4]</span></p>

<p><strong>Output:</strong> <span class="example-io">[2,1,4,3]</span></p>

<p><strong>Explanation:</strong></p>

<p><img alt="" src="https://assets.leetcode.com/uploads/2020/10/03/swap_ex1.jpg" style="width: 422px; height: 222px;" /></p>
</div>

<p><strong class="example">Example 2:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">head = []</span></p>

<p><strong>Output:</strong> <span class="example-io">[]</span></p>
</div>

<p><strong class="example">Example 3:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">head = [1]</span></p>

<p><strong>Output:</strong> <span class="example-io">[1]</span></p>
</div>

<p><strong class="example">Example 4:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">head = [1,2,3]</span></p>

<p><strong>Output:</strong> <span class="example-io">[2,1,3]</span></p>
</div>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li>The number of nodes in the&nbsp;list&nbsp;is in the range <code>[0, 100]</code>.</li>
	<li><code>0 &lt;= Node.val &lt;= 100</code></li>
</ul>

## Constraints



## Solution

```java
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
```

---
<div align="center">

**🔄 Synced with [CommitSync](https://www.google.com/search?q=CommitSync+extension)**

*Automatically organized and synced by CommitSync.*

</div>
