// LeetCode Problem: 4Sum
// Link: https://leetcode.com/problems/4sum/
// Difficulty: Medium
// Language: java

class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        HashSet<List<Integer>>set=new HashSet<>();
        for(int i=0;i<nums.length-2;i++)
        {
            HashMap<Long,Integer>map=new HashMap<>();
            for(int j=i+1;j<nums.length-1;j++)
            {
                for(int k=j+1;k<nums.length;k++)
                {
                    long fourth=(target-((long)nums[i]+(long)nums[j]+(long)nums[k]));
                    if(map.containsKey(fourth))
                    {
                        List<Integer>list=new ArrayList<>();
                        list.add((int)nums[i]);
                        list.add((int)nums[j]);
                        list.add((int)nums[k]);
                        list.add((int)fourth);
                        Collections.sort(list);
                        set.add(list);
                    } 
                }
                map.put((long)nums[j],j);

            }
        }
        return new ArrayList<>(set); 
    }
}