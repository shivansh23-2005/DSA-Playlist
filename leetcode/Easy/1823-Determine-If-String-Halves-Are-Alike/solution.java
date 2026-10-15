// LeetCode Problem: Determine if String Halves Are Alike
// Link: https://leetcode.com/problems/determine-if-string-halves-are-alike/
// Difficulty: Easy
// Language: java

class Solution {
    public boolean halvesAreAlike(String s) {
        int count=0;
        for(int i=0;i<(s.length()/2);i++)
        {
            char ch=Character.toLowerCase(s.charAt(i));
            if(ch=='a'||ch=='i'||ch=='o'||ch=='u'||ch=='e')
            {
                count++;
            }
        }
        for(int i=(s.length()/2);i<s.length();i++)
        {
            char ch=Character.toLowerCase(s.charAt(i));
              if(ch=='a'||ch=='i'||ch=='o'||ch=='u'||ch=='e')
            {
                count--;
            }
        }
        if(count==0)
        {
            return true;
        }
        return false;
    }
}