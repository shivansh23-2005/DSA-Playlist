// LeetCode Problem: Valid Anagram
// Link: https://leetcode.com/problems/valid-anagram/
// Difficulty: Easy
// Language: java

class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer>m1=new HashMap<>();
        HashMap<Character,Integer>m2=new HashMap<>();
        int i=0;
        if(s.length()!=t.length())
        {
            return false;
        }
        while(i<s.length() && i<t.length())
        {
            char ch1=s.charAt(i);
            char ch2=t.charAt(i);
            m1.put(ch1,m1.getOrDefault(ch1,0)+1);
            m2.put(ch2,m2.getOrDefault(ch2,0)+1);
            i++;
        }
        if(m1.equals(m2))
        {
            return true;
        }
        else
        {
            return false;
        }

    }
}