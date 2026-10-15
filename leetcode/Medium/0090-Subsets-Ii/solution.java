// LeetCode Problem: Subsets II
// Link: https://leetcode.com/problems/subsets-ii/
// Difficulty: Medium
// Language: java

class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<Integer>curr=new ArrayList<>();
        List<List<Integer>>result=new ArrayList<>();
         backtrack(nums,0,curr,result);
         return result;
        
    }
     void backtrack(int nums[],int index,List<Integer>curr,List<List<Integer>>result)
     {
        if(!result.contains(curr))
        {
           result.add(new ArrayList<>(curr));
        }
        for(int i=index;i<nums.length;i++)
        {
            curr.add(nums[i]);
            backtrack(nums,i+1,curr,result);
            curr.remove(curr.size()-1);
        }
     }
}