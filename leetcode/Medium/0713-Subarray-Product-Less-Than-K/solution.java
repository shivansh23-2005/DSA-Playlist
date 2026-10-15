// LeetCode Problem: Subarray Product Less Than K
// Link: https://leetcode.com/problems/subarray-product-less-than-k/
// Difficulty: Medium
// Language: java

class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int si=0;
        int ei=0;
        int p=1;
        int count=0;
        while(ei<nums.length)
        {
            p=p*nums[ei];
            while(p>=k && si<=ei)
            {
                p=p/nums[si];
                si++;
            }
            count+=(ei-si)+1;
            ei++;
        }
        return count;
    }
}