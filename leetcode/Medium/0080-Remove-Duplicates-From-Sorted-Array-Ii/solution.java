// LeetCode Problem: Remove Duplicates from Sorted Array II
// Link: https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/
// Difficulty: Medium
// Language: java

class Solution {
    public int removeDuplicates(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
       for(Map.Entry<Integer,Integer>entry:map.entrySet())
        {
            int freq=entry.getValue();
            if (freq <= 2) {
                for (int i = 0; i < freq; i++) {
                    nums[count] = entry.getKey();
                    count++;
                }
            } else {
                nums[count++] = entry.getKey();  
                nums[count++] = entry.getKey(); ////// kyu ki 2 value allowed hai
            }
        }
          Arrays.sort(nums, 0, count);
        return count; 
    }
}