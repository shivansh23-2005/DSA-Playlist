// LeetCode Problem: Combination Sum
// Link: https://leetcode.com/problems/combination-sum/
// Difficulty: Medium
// Language: java

class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
         List<List<Integer>>ans=new ArrayList<>();
         List<Integer>list=new ArrayList<>();
         solve(candidates,0,0,target,list,ans);
         return ans;
        
    }
    void solve(int[]candidates,int index,int sum,int target, List<Integer>list,List<List<Integer>>ans)
    {
        if(sum==target)
        {
            ans.add(list);
            return;
        }
        if(sum>target)
        {
            return;
        }
        if(index==candidates.length)
        {
            return;
        }
        list.add(candidates[index]);
        solve(candidates,index,sum+candidates[index],target,new ArrayList<>(list),ans);
        list.remove(list.size()-1);
       solve(candidates,index+1,sum,target,new ArrayList<>(list),ans);

    }
}