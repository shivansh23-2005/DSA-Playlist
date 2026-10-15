// LeetCode Problem: Permutations II
// Link: https://leetcode.com/problems/permutations-ii/
// Difficulty: Medium
// Language: java

class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {

        HashSet<List<Integer>> unique = new HashSet<>();

        permutation(nums, 0, new ArrayList<>(), unique);

        return new ArrayList<>(unique);
    }

    void permutation(int[] nums, int index,
                     List<Integer> curr,
                     HashSet<List<Integer>> unique) {

        if (index == nums.length) {
            unique.add(new ArrayList<>(curr));
            return;
        }

        for (int i = index; i < nums.length; i++) {

            swap(nums, index, i);

            curr.add(nums[index]);      // add inside loop
             permutation(nums, index + 1, curr, unique);
            curr.remove(curr.size() - 1); // remove inside loop
            swap(nums, index, i); // backtrack
        }
    }

    void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}