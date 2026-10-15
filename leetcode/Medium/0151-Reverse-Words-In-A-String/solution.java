// LeetCode Problem: Reverse Words in a String
// Link: https://leetcode.com/problems/reverse-words-in-a-string/
// Difficulty: Medium
// Language: java

class Solution {
    public String reverseWords(String s) {
        String s2=s.trim().replaceAll("\\s+"," ");
        String s1[]=s2.split(" ");
        int i=0;
        int j=s1.length-1;
        String newstr="";
        while(i<j)
        {
         String temp = s1[i];
            s1[i] = s1[j];
            s1[j] = temp;
            i++;
            j--;
        }

          for(int k=0;k<s1.length;k++)
          {
             newstr=newstr+s1[k];
            if(k!=s1.length-1)
            {
                newstr += " "; 
            }
          }
          return newstr;
        
    }
}