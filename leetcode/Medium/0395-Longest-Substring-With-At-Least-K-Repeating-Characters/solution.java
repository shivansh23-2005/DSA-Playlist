// LeetCode Problem: Longest Substring with At Least K Repeating Characters
// Link: https://leetcode.com/problems/longest-substring-with-at-least-k-repeating-characters/
// Difficulty: Medium
// Language: java

class Solution {
    public int longestSubstring(String s, int k) {
        int ans = 0;

        for (int i = 0; i < s.length(); i++) {

            HashMap<Character, Integer> map = new HashMap<>();

            for (int j = i; j < s.length(); j++) {

                char ch = s.charAt(j);

                if (map.containsKey(ch)) {
                    map.put(ch, map.get(ch) + 1);
                } else {
                    map.put(ch, 1);
                }

                boolean flag = true;

                for (char c : map.keySet()) {
                    if (map.get(c) < k) {
                        flag = false;
                        break;
                    }
                }

                if (flag) {
                    ans = Math.max(ans, j - i + 1);
                }
            }
        }

        return ans;
    }
}