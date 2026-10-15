// LeetCode Problem: Pascal's Triangle
// Link: https://leetcode.com/problems/pascals-triangle/
// Difficulty: Easy
// Language: java

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>>list=new ArrayList<>();
        for(int row=0;row<numRows;row++)
        {
            List<Integer>l1=new ArrayList<>();
            int val=1;
            for(int star=0;star<=row;star++)
            {
                l1.add(val);
                val=val*(row-star)/(star+1);

            }
            list.add(l1);
        }
        return list;
    }
}