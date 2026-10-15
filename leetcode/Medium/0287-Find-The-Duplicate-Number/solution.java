// LeetCode Problem: Find the Duplicate Number
// Link: https://leetcode.com/problems/find-the-duplicate-number/
// Difficulty: Medium
// Language: java

class Solution {
    public int findDuplicate(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
         for(int i=0;i<nums.length;i++)
         {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
         }
         for(Map.Entry<Integer,Integer>entry:map.entrySet())
         {
            if(entry.getValue()>1)
            {
                return entry.getKey();
            }
         }
         return 0;
        
    }
}