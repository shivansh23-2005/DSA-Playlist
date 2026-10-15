// LeetCode Problem: Single Number III
// Link: https://leetcode.com/problems/single-number-iii/
// Difficulty: Medium
// Language: java

class Solution {
    public int[] singleNumber(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        ArrayList<Integer>result=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer,Integer>entry:map.entrySet())
        {
            if(entry.getValue()==1)
            {
                result.add(entry.getKey());
            }
        }
        int arr[]=new int[result.size()];
        for(int k=0;k<result.size();k++)
        {
            arr[k]=result.get(k);
        }
        return arr;
        
    }
}