// LeetCode Problem: Pascal's Triangle II
// Link: https://leetcode.com/problems/pascals-triangle-ii/
// Difficulty: Easy
// Language: java

class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer>list=new ArrayList<>();
        long val=1;
        for(int i=0;i<=rowIndex;i++)
        {
            list.add((int)val);
            val=val*(rowIndex-i)/(i+1);

        }
        return list;
    }
}