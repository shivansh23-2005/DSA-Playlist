// LeetCode Problem: Permutations
// Link: https://leetcode.com/problems/permutations/
// Difficulty: Medium
// Language: java

class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>list=new ArrayList<>();
        solve(nums,0,list,ans);
        return ans;
        
    }
    public static void solve(int nums[],int index, List<Integer>list,List<List<Integer>>ans)
    {
         if(list.size()==nums.length)
            {
                ans.add(list);
                return;
            }
        for(int i=0;i<nums.length;i++)
        {
            if(!list.contains(nums[i]))
            {
            list.add(nums[i]);
            solve(nums,index+1,new ArrayList<>(list),ans);
            list.remove(list.size()-1);
            }
        }                                                                                                                                                                                             
    }
}