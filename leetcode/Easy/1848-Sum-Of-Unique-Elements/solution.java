// LeetCode Problem: Sum of Unique Elements
// Link: https://leetcode.com/problems/sum-of-unique-elements/
// Difficulty: Easy
// Language: java

class Solution {
    public int sumOfUnique(int[] nums) {
        int sum=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
                map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        for(Map.Entry<Integer,Integer>entry:map.entrySet())
        { 
            if(entry.getValue()==1)
            {
                sum+=entry.getKey();
            }

        }
        return sum;
    }
}