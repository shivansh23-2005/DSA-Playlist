// LeetCode Problem: Valid Parentheses
// Link: https://leetcode.com/problems/valid-parentheses/
// Difficulty: Easy
// Language: java

class Solution {
    public boolean isValid(String s) {
    
     Stack<Character>st=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='(' || ch=='{' || ch=='[')
            {
                st.push(ch);
            }
            else
            {
                if(st.isEmpty())
                {
                    return false;
                }
                char val=st.pop();
                if(val=='(' && ch=='}' || val=='(' && ch==']' || val=='{' && ch==')' || val=='{' && ch==']' || val=='[' && ch==')' || val=='[' && ch=='}')
                {
                    return false;
                }
            }
            if(st.isEmpty() && i==s.length()-1)
            {
                return true;
            }
        }
        return false;
    }
}