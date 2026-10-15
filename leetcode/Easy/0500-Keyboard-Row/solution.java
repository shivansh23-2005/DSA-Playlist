// LeetCode Problem: Keyboard Row
// Link: https://leetcode.com/problems/keyboard-row/
// Difficulty: Easy
// Language: java

class Solution {
    public String[] findWords(String[] words) {

        String row1 = "qwertyuiop";
        String row2 = "asdfghjkl";
        String row3 = "zxcvbnm";

        ArrayList<String> ans = new ArrayList<>();

        for (String word : words) {

            String w = word.toLowerCase();

            String row;

            if (row1.indexOf(w.charAt(0)) != -1) {
                row = row1;
            } 
            else if (row2.indexOf(w.charAt(0)) != -1) {
                row = row2;
            } 
            else {
                row = row3;
            }

            boolean valid = true;

            for (int i = 1; i < w.length(); i++) {

                if (row.indexOf(w.charAt(i)) == -1) {
                    valid = false;
                    break;
                }
            }

            if (valid) {
                ans.add(word);
            }
        }

        return ans.toArray(new String[0]);
    }
}