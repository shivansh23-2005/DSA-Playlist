// LeetCode Problem: Most Frequent Even Element
// Link: https://leetcode.com/problems/most-frequent-even-element/
// Difficulty: Easy
// Language: java

class Solution {
    public int mostFrequentEven(int[] nums) {  
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int max=Integer.MIN_VALUE;
        int ans=-1;
        for(Map.Entry<Integer,Integer>entry:map.entrySet())
        {
            if(entry.getKey()%2==0)
            {
                if(entry.getValue()>max||(entry.getValue() == max && entry.getKey() < ans))
                {
                    max=entry.getValue();
                    ans=entry.getKey();
                }
            }
        }
        return ans;
        
    }
}