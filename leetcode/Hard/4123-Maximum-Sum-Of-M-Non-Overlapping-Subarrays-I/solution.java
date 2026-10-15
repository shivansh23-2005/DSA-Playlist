// LeetCode Problem: Maximum Sum of M Non-Overlapping Subarrays I
// Link: https://leetcode.com/problems/maximum-sum-of-m-non-overlapping-subarrays-i/
// Difficulty: Hard
// Language: java

class Solution {
    public long maximumSum(int[] nums, int m, int l, int r) {
        int n=nums.length;
        long pref[]=new long[n+1];
        for(int i=0;i<n;i++)
            {
                pref[i+1]=pref[i]+nums[i];
            }
        long Neg=Long.MIN_VALUE/4;
        long dp[][]=new long[m+1][n+1];
        for(int i=0;i<=m;i++)
            {
                Arrays.fill(dp[i],Neg);
            }
        for(int j=0;j<=n;j++)
            {
                dp[0][j]=0;
            }
        for(int p=1;p<=m;p++)
            {
                Deque<Integer>dq=new ArrayDeque<>();
                for(int j=1;j<=n;j++)
                    {
                        dp[p][j]=dp[p][j-1];
                        int add=j-l;
                        if(add>=0)
                        {
                            long val=dp[p-1][add]-pref[add];
                            while(!dq.isEmpty())
                                {
                                    int last=dq.peekLast();
                                    if(dp[p-1][last]-pref[last]<=val)
                                        dq.pollLast();
                                    else
                                        break;
                                }
                            dq.offerLast(add);
                        }
                        int remove=j-r-1;
                        while(!dq.isEmpty() && dq.peekFirst()<=remove)
                            {
                                dq.pollFirst();
                            }
                        if(!dq.isEmpty())
                        {
                            int t=dq.peekFirst();
                            dp[p][j]=Math.max(dp[p][j],pref[j]+dp[p-1][t]-pref[t]);
                        }
                    }
            }
        long res=Long.MIN_VALUE;
        for(int k=1;k<=m;k++)
            {
            res=Math.max(res,dp[k][n]);
            }
        return res;
    }
}