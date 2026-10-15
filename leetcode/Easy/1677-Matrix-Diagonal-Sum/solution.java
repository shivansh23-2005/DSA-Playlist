// LeetCode Problem: Matrix Diagonal Sum
// Link: https://leetcode.com/problems/matrix-diagonal-sum/
// Difficulty: Easy
// Language: java

class Solution {
    public int diagonalSum(int[][] mat) {
        int sum=0;
        int n=mat.length;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat.length;j++)
            {
                if(i==j || j==n-i-1)
                {
                    sum+=mat[i][j];
                }
            }
        }
        return sum;
        
    }
}