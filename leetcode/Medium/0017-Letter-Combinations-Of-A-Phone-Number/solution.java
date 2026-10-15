// LeetCode Problem: Letter Combinations of a Phone Number
// Link: https://leetcode.com/problems/letter-combinations-of-a-phone-number/
// Difficulty: Medium
// Language: java

class Solution {
     static String map[]={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public List<String> letterCombinations(String digits) {
        List<String>list=new ArrayList<>();
        solve(digits,"",list);  
        return list; 
    }
    public void solve(String digits,String ans,List<String>list)
    {
        if(digits.length()==0)
        {
            list.add(ans);
            return;
        }
        char ch=digits.charAt(0);
        int num=ch-'0';   //2
        String press=map[num]; 
        for(int i=0;i<press.length();i++)
        {
        solve(digits.substring(1),ans+press.charAt(i),list);
        }


    }
}