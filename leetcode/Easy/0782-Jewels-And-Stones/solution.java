// LeetCode Problem: Jewels and Stones
// Link: https://leetcode.com/problems/jewels-and-stones/
// Difficulty: Easy
// Language: java

class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int k=0;
        int count=0;
        while(k<jewels.length())
        {
        for(int i=0;i<stones.length();i++)
        {
            char ch=jewels.charAt(k);
            char chstones=stones.charAt(i);
            if(ch==chstones)
            {
                count++;
            }
        }
        k++;
        }
        return count;
        
    }
}