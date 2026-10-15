# Non-overlapping Intervals

**Difficulty:** Medium  
**Topics:** Array, Dynamic Programming, Greedy, Sorting  
**LeetCode URL:** [Non-overlapping Intervals](https://leetcode.com/problems/non-overlapping-intervals/)

## Problem Description

<p>Given an array of intervals <code>intervals</code> where <code>intervals[i] = [start<sub>i</sub>, end<sub>i</sub>]</code>, return <em>the minimum number of intervals you need to remove to make the rest of the intervals non-overlapping</em>.</p>

<p><strong>Note</strong> that intervals which only touch at a point are <strong>non-overlapping</strong>. For example, <code>[1, 2]</code> and <code>[2, 3]</code> are non-overlapping.</p>

<p>&nbsp;</p>

## Examples

<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> intervals = [[1,2],[2,3],[3,4],[1,3]]
<strong>Output:</strong> 1
<strong>Explanation:</strong> [1,3] can be removed and the rest of the intervals are non-overlapping.
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> intervals = [[1,2],[1,2],[1,2]]
<strong>Output:</strong> 2
<strong>Explanation:</strong> You need to remove two [1,2] to make the rest of the intervals non-overlapping.
</pre>

<p><strong class="example">Example 3:</strong></p>

<pre>
<strong>Input:</strong> intervals = [[1,2],[2,3]]
<strong>Output:</strong> 0
<strong>Explanation:</strong> You don&#39;t need to remove any of the intervals since they&#39;re already non-overlapping.
</pre>

## Constraints

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= intervals.length &lt;= 10<sup>5</sup></code></li>
	<li><code>intervals[i].length == 2</code></li>
	<li><code>-5 * 10<sup>4</sup> &lt;= start<sub>i</sub> &lt; end<sub>i</sub> &lt;= 5 * 10<sup>4</sup></code></li>
</ul>

## Solution

```java
// LeetCode Problem: Non-overlapping Intervals
// Link: https://leetcode.com/problems/non-overlapping-intervals/
// Difficulty: Medium
// Language: java

class Solution {

    public int eraseOverlapIntervals(int[][] intervals) {

        ArrayList<int[]> list = new ArrayList<>();

        int count = 0;

        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        list.add(intervals[0]);

        for (int i = 1; i < intervals.length; i++) {

            int element[] = list.get(list.size() - 1);
            if (element[1] > intervals[i][0]) {

                count++;
                if (intervals[i][1] < element[1]) {
                    list.set(list.size() - 1, intervals[i]);
                }
            }

            else {
                list.add(intervals[i]);
            }
        }

        return count;
    }
}
```

---
<div align="center">

**🔄 Synced with [CommitSync](https://www.google.com/search?q=CommitSync+extension)**

*Automatically organized and synced by CommitSync.*

</div>
