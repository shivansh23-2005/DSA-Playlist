// LeetCode Problem: Generate Parentheses
// Link: https://leetcode.com/problems/generate-parentheses/
// Difficulty: Medium
// Language: java

class Solution {
    public List<String> generateParenthesis(int n) {
        List<String>list=new ArrayList<>();
        solve(n,0,0,"",list);
        return list;
        
    }
    public void solve(int n,int open,int close,String ans,List<String>list)
    {
        // base case
        if(open==n && close==n)
        {
            list.add(ans);
            return;
        }
        //open 
        if(open<n){
        solve(n,open+1,close,ans+"(",list);
        }
        //close
        if(close<open){
        solve(n,open,close+1,ans+")",list);
        }
    }
}