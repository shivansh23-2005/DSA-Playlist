// LeetCode Problem: Top K Frequent Elements
// Link: https://leetcode.com/problems/top-k-frequent-elements/
// Difficulty: Medium
// Language: java

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int result[]=new int[k];
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
       PriorityQueue<Integer> pq =
    new PriorityQueue<>((a,b) -> map.get(b)-map.get(a));
              
        pq.addAll(map.keySet());
        for (int i = 0; i < k; i++) {
            result[i] = pq.poll();
        }
        return result;
    }
}