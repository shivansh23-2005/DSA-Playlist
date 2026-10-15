// LeetCode Problem: Find All Duplicates in an Array
// Link: https://leetcode.com/problems/find-all-duplicates-in-an-array/
// Difficulty: Medium
// Language: java

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        ArrayList<Integer>result=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer,Integer>entry:map.entrySet())
        {
            if(entry.getValue()>1)
            {
                result.add(entry.getKey());
            }
        }
        return result;

        
    }
}