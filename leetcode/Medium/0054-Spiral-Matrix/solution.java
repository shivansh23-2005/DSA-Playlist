// LeetCode Problem: Spiral Matrix
// Link: https://leetcode.com/problems/spiral-matrix/
// Difficulty: Medium
// Language: java

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer>result=new ArrayList<>();
        int top=0;
        int right=matrix[0].length-1;
        int left=0;
        int buttom=matrix.length-1;
        while(top <= buttom && left <= right){
        for(int i=left;i<=right;i++)
        {
            result.add(matrix[top][i]);
        }
        top++;
        for(int i=top;i<=buttom;i++)
        {
            result.add(matrix[i][right]);
        }
        right--;
        if(top<=buttom){
        for(int i=right;i>=left;i--)
        {
            result.add(matrix[buttom][i]);
        }
        buttom--;
        }
        if(left<=right){
        for(int i=buttom;i>=top;i--)
        {
            result.add(matrix[i][left]);
        }
        left++;
        }
    }
    return result;
    }
}