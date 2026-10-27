// LeetCode Problem: Daily Temperatures
// Link: https://leetcode.com/problems/daily-temperatures/
// Difficulty: Medium
// Language: java

class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n=temperatures.length;
        int ans[]=new int[n];
        Stack<Integer>st=new Stack();
        for(int i=0;i<n;i++)
        {
            while(!st.isEmpty() && temperatures[i]>temperatures[st.peek()])
            {
                int rv=st.pop();
                int diff=i-rv;
                ans[rv]=diff;
            }
            st.push(i);
        }
        return ans;
    }
}