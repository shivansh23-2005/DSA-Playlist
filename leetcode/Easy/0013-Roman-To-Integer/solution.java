// LeetCode Problem: Roman to Integer
// Link: https://leetcode.com/problems/roman-to-integer/
// Difficulty: Easy
// Language: java

class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> m1 = new HashMap<>();
        m1.put('I',1);
        m1.put('V',5);
        m1.put('X',10);
        m1.put('L',50);
        m1.put('C',100);
        m1.put('D',500);
        m1.put('M',1000);
        int sum=0;
        for(int i=0;i<s.length();i++)
        { 
            int curr=m1.get(s.charAt(i));
            if(i<s.length()-1 && curr<m1.get(s.charAt(i+1)))
            {
                sum=sum-curr;
            }
            else
            {
               sum=sum+curr;

            }
        }
            return sum;





        
    }
}