// LeetCode Problem: Length of Last Word
// Link: https://leetcode.com/problems/length-of-last-word/
// Difficulty: Easy
// Language: java

class Solution {
    public int lengthOfLastWord(String s) {
        int count=0;
        String str=s.trim();
         int size=str.length()-1;
        while(size>=0){
            if(str.charAt(size)==' ')
            {
                        break;
            } 
            count++;
            size--;
        }
        return count;
    }
}