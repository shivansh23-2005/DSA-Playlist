# Palindrome Linked List

**Difficulty:** Easy  
**Topics:** Linked List, Two Pointers, Stack, Recursion  
**LeetCode URL:** [Palindrome Linked List](https://leetcode.com/problems/palindrome-linked-list/)

## Problem Description

<p>Given the <code>head</code> of a singly linked list, return <code>true</code><em> if it is a </em><span data-keyword="palindrome-sequence"><em>palindrome</em></span><em> or </em><code>false</code><em> otherwise</em>.</p>

<p>&nbsp;</p>

## Examples

<p><strong class="example">Example 1:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2021/03/03/pal1linked-list.jpg" style="width: 422px; height: 62px;" />
<pre>
<strong>Input:</strong> head = [1,2,2,1]
<strong>Output:</strong> true
</pre>

<p><strong class="example">Example 2:</strong></p>
<img alt="" src="https://assets.leetcode.com/uploads/2021/03/03/pal2linked-list.jpg" style="width: 182px; height: 62px;" />
<pre>
<strong>Input:</strong> head = [1,2]
<strong>Output:</strong> false
</pre>

## Constraints

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li>The number of nodes in the list is in the range <code>[1, 10<sup>5</sup>]</code>.</li>
	<li><code>0 &lt;= Node.val &lt;= 9</code></li>
</ul>

<p>&nbsp;</p>
<strong>Follow up:</strong> Could you do it in <code>O(n)</code> time and <code>O(1)</code> space?

## Solution

```java
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
```

---
<div align="center">

**🔄 Synced with [CommitSync](https://www.google.com/search?q=CommitSync+extension)**

*Automatically organized and synced by CommitSync.*

</div>
