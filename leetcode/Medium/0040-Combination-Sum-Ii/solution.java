// LeetCode Problem: Combination Sum II
// Link: https://leetcode.com/problems/combination-sum-ii/
// Difficulty: Medium
// Language: java

class Solution {
    public List<List<Integer>> combinationSum2(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);

        solve(nums, 0, target, new ArrayList<>(), ans);

        return ans;
    }

    void solve(int[] nums, int index, int target, List<Integer> list,
               List<List<Integer>> ans) {

        if(target == 0) {
            ans.add(new ArrayList<>(list));
            return;
        }

        for(int i = index; i < nums.length; i++) {

            if(i > index && nums[i] == nums[i - 1]) continue;

            if(nums[i] > target) break;

            list.add(nums[i]);

            solve(nums, i + 1, target - nums[i], list, ans);

            list.remove(list.size() - 1);
        }
    }
}