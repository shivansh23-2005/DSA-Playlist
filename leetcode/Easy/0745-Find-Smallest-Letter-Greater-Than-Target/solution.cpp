// LeetCode Problem: Find Smallest Letter Greater Than Target
// Link: https://leetcode.com/problems/find-smallest-letter-greater-than-target/
// Difficulty: Easy
// Language: cpp

class Solution {
public:
    char nextGreatestLetter(vector<char>& letters, char target) {
        int i;
        int size=letters.size();
        for( i=0;i<size;i++)
        {
            if(letters[i]>target)
            {
                return letters[i];
            }
        }
        return letters[0];
    }
};