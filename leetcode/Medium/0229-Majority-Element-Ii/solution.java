// LeetCode Problem: Majority Element II
// Link: https://leetcode.com/problems/majority-element-ii/
// Difficulty: Medium
// Language: java

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        double d=Math.floor(nums.length/3);
        ArrayList<Integer>result=new ArrayList<>();
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {

       
        map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer,Integer>entry:map.entrySet())
        {
           if(entry.getValue()>d)
           {
              result.add(entry.getKey());
           }
        }
 return result;
    }
}