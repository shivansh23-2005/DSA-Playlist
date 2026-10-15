class Solution {
    public int climbStairs(int n) {
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
       return solve(n,0,dp); 
    }
    public static int solve(int n,int csum,int dp[])
    {
        if(csum>n)
        {
            return 0;
        }
        if(dp[csum]!=-1)
        {
            return dp[csum];
        }
        if(csum==n)
        {
            return 1;

        }
        return dp[csum]=solve(n,csum+1,dp)+solve(n,csum+2,dp);
    }
}