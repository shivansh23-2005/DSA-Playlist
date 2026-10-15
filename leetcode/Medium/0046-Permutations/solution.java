// LeetCode Problem: Permutations
// Link: https://leetcode.com/problems/permutations/
// Difficulty: Medium
// Language: java

class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<Integer>curr=new ArrayList<>();
        List<List<Integer>>result=new ArrayList<>();
          permutation(nums,0,curr,result);
          return result;
    }
    void permutation(int nums[],int index,List<Integer>curr,List<List<Integer>>result)
    {
       if (index == nums.length) {
    result.add(new ArrayList<>(curr));
    return;
}

        for(int i=index;i<nums.length;i++)
        {
             swap(nums, i, index);
            curr.add(nums[index]);
            permutation(nums, index + 1, curr, result);
            curr.remove(curr.size() - 1);
             swap(nums, i, index);
        }
    }
    void swap(int[] nums, int i, int j) {
    int temp = nums[i];
    nums[i] = nums[j];
    nums[j] = temp;
}


}