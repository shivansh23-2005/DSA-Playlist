// LeetCode Problem: Two Sum II - Input Array Is Sorted
// Link: https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
// Difficulty: Medium
// Language: java

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer,Integer>map=new HashMap<>();
        ArrayList<Integer>list=new ArrayList<>();
        int result[]=new int[2];
        for(int i=0;i<numbers.length;i++)
        {
             int second=target-numbers[i];
            if(map.containsKey(second))
            {
                list.add(map.get(second)+1);
                list.add(i+1);
            }
            map.put(numbers[i],i);
        }
        for(int i=0;i<list.size();i++){
            result[i]=list.get(i);
        }
        return result;
    }
}