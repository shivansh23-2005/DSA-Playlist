// LeetCode Problem: Koko Eating Bananas
// Link: https://leetcode.com/problems/koko-eating-bananas/
// Difficulty: Medium
// Language: java

class Solution {
        Boolean ishours(long mid,int[]piles,int h){
        long hours=0;
        for(int i=0;i<piles.length;i++)
        {
            hours +=(int)Math.ceil((double)piles[i] / mid);
        }
        if(hours<=h)
        {
                return true;
        }
        else
        {
            return false;
        }

    }
    public int minEatingSpeed(int[] piles, int h) {
        long high=Integer.MIN_VALUE;
        int ans=0;
        for(int i=0;i<piles.length;i++)
        {
                    high=Math.max(high,piles[i]);
        }
        long low=1;
        while(low<=high)
        {
            long mid=(low+high)/2;
            if(ishours(mid,piles,h))
            {
                ans=(int)mid;
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        return ans;
    }
}