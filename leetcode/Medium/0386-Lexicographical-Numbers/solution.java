// LeetCode Problem: Lexicographical Numbers
// Link: https://leetcode.com/problems/lexicographical-numbers/
// Difficulty: Medium
// Language: java

class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<Integer>list=new ArrayList<>();
        for(int i=1;i<=9;i++)
        {
            solve(n,i,list);
        }
        return list;
    }
    void solve(int n,int curr,List<Integer>list)
    {
        if(curr>n)
        {
            return;
        }
        list.add(curr);
        for(int i=0;i<=9;i++)
        {
            solve(n,curr*10+i,list);
        }

    }
}