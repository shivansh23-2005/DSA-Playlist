// LeetCode Problem: Continuous Subarray Sum
// Link: https://leetcode.com/problems/continuous-subarray-sum/
// Difficulty: Medium
// Language: java

class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer,Integer>map=new HashMap<>();
        map.put(0,-1);
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
            int rem=sum%k;
            if(!map.containsKey(rem))
            {
                map.put(rem,i);
            }
            else
            {
                if(i-map.get(rem)>=2)
                {
                    return true;
                }
            }
        }
        return false;
        
    }
}