// LeetCode Problem: Split Array Largest Sum
// Link: https://leetcode.com/problems/split-array-largest-sum/
// Difficulty: Hard
// Language: java

class Solution {
    public int splitArray(int[] arr, int k) {
             if(arr.length<k)
        {
            return -1;
        }
        long low=arr[0];
        long high=0;
        for(int i=0;i<arr.length;i++)
        {
           high+=arr[i];
           low=Math.max(low,arr[i]);
        }
        long ans=0;
        while(low<=high)
        {
            long mid=(low+high)/2;
            if(IsPossible(arr,k,mid))
            {
                ans=mid;
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        return (int)ans;
    }
    boolean IsPossible(int []arr,int k,long mid)
    {
        int student=1;
        int readpage=0;
        for(int i=0;i<arr.length;i++)
        {
            if(readpage+arr[i]<=mid)
            {
                readpage+=arr[i];
            }
            else
            {
                student++;
                readpage=arr[i];
            }
            if(student>k)
            {
                return false;
            }
        }
        return true;
    }
}