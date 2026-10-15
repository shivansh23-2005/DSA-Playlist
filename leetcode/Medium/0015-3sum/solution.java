// LeetCode Problem: 3Sum
// Link: https://leetcode.com/problems/3sum/
// Difficulty: Medium
// Language: java

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        HashSet<List<Integer>>set=new HashSet<>();
        for(int i=0;i<nums.length-1;i++)
        {
                HashMap<Integer,Integer>map=new HashMap<>();
            for(int j=i+1;j<nums.length;j++)
            {
                
                int third=-(nums[i]+nums[j]);
                if(map.containsKey(third))
                {
                ArrayList<Integer>list=new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(third);
                    set.add(list);
                }
                    map.put(nums[j],j);
            }
        }
        return new ArrayList<>(set);
        
    }
}