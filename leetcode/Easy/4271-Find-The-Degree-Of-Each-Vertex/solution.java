// LeetCode Problem: Find the Degree of Each Vertex
// Link: https://leetcode.com/problems/find-the-degree-of-each-vertex/
// Difficulty: Easy
// Language: java

class Solution {
    public int[] findDegrees(int[][] matrix) {
        int n=matrix.length;
        int result[]=new int[n];
        for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                    {
                        if(matrix[i][j]==1)
                        {
                            result[i]++;
                        }
                    }
            }
        return result;
        
        
    }
}