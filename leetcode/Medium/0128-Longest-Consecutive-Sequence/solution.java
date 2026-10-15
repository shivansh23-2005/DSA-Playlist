// LeetCode Problem: Longest Consecutive Sequence
// Link: https://leetcode.com/problems/longest-consecutive-sequence/
// Difficulty: Medium
// Language: java

class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer>set=new HashSet<>();
        for(int i:nums)
        {
           set.add(i);
        }
        int maxlen=0;
        for(int num:set)
        {
            if(!set.contains(num-1))
            {
                int curr=num;
                int len=1;
                while(set.contains(curr+1))
                {
                    curr++;
                    len++;
                }
                 maxlen=Math.max(maxlen,len);
            }
        }
        return maxlen;
    }
}