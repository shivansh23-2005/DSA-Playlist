// LeetCode Problem: Transpose Matrix
// Link: https://leetcode.com/problems/transpose-matrix/
// Difficulty: Easy
// Language: java

class Solution {
    public int[][] transpose(int[][] matrix) {
        int r=matrix.length;
        int c=matrix[0].length;
        int matrix1[][]=new int[c][r];
        for(int i=0;i<r;i++)
        {
         for(int j=0;j<c;j++)
         {
            matrix1[j][i]=matrix[i][j];
         }
        }
        return matrix1;
        
    }
}