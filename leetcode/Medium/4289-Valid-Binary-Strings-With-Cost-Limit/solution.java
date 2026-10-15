// LeetCode Problem: Valid Binary Strings With Cost Limit
// Link: https://leetcode.com/problems/valid-binary-strings-with-cost-limit/
// Difficulty: Medium
// Language: java

class Solution {
    public List<String> generateValidStrings(int n, int k) {
        ArrayList<String>result=new ArrayList<>();
        myfun(0,n,k,0,new StringBuilder(),result);
        return result; 
    }
    void myfun(int index,int n,int k,int cost,StringBuilder sb, ArrayList<String>result)
    {
        if(cost>k)
        {
            return;
        }
        if(index==n)
        {
            result.add(sb.toString());
            return;
        }
        sb.append('0');
        myfun(index+1,n,k,cost,sb,result);
        sb.deleteCharAt(sb.length()-1);
        if(sb.length()==0 || sb.charAt(sb.length()-1)!=('1'))
        {
            sb.append('1');
            myfun(index+1,n,k,cost+index,sb,result);
            sb.deleteCharAt(sb.length()-1);
            
        }
    }
}