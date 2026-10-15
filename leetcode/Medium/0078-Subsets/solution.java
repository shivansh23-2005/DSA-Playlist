// LeetCode Problem: Subsets
// Link: https://leetcode.com/problems/subsets/
// Difficulty: Medium
// Language: java

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>curr= new ArrayList<>();
        solve(nums,0,ans,curr);
        return ans;  
    }
    public void solve(int nums[],int i,List<List<Integer>>list, List<Integer>ll)
    {
        //not pick 
        if(i==nums.length)
        {
            list.add(ll);
            return;
        }
        solve(nums,i+1,list,new ArrayList<>(ll));
        int ele=nums[i];
        ll.add(ele);
        solve(nums,i+1,list,new ArrayList<>(ll));

    }
}