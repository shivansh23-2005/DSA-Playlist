// LeetCode Problem: Valid Parenthesis String
// Link: https://leetcode.com/problems/valid-parenthesis-string/
// Difficulty: Medium
// Language: java

class Solution {
    public boolean checkValidString(String s) {
        Stack<Integer>open=new Stack();
        Stack<Integer>astrick=new Stack();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='(')
            {
                open.push(i);
            }
            else if(ch=='*')
            {
                astrick.push(i);
            }
            else
            {
                if(!open.isEmpty())
                {
                    open.pop();
                }
                else if(!astrick.isEmpty())
                {
                    astrick.pop();
                }
                else
                {
                    return false;
                }
            }
        }
        while(!open.isEmpty() && !astrick.isEmpty())
        {
            if(open.pop()>astrick.pop())
            {
                return false;
            }
        }
        return open.isEmpty();
        
    }
}