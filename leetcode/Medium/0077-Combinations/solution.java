// LeetCode Problem: Combinations
// Link: https://leetcode.com/problems/combinations/
// Difficulty: Medium
// Language: java

class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>list=new ArrayList<>();
        solve(n,1,k,list,ans);
        return ans;
    }
    void solve(int n,int index,int k,List<Integer>list,List<List<Integer>>ans)
    {
           if(list.size()==k)
            {
                ans.add(list);
                return;
            }
        for(int i=index;i<=n;i++)
        {
            //pick 
            list.add(i);
            solve(n,i+1,k,new ArrayList<>(list),ans);
            //not pick 
            list.remove(list.size()-1);
        }
    }
}