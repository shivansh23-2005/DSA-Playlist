// LeetCode Problem: Search a 2D Matrix
// Link: https://leetcode.com/problems/search-a-2d-matrix/
// Difficulty: Medium
// Language: java

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int low=0;
        int m=matrix.length;
        int n=matrix[0].length;
        int high=(m*n)-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            int row=mid/n;
            int col=mid%n;
            if(matrix[row][col]==target)
            {
                return true;
            }
            else if(matrix[row][col]<target)
            {
                low++;
            }
            else
            {
                high--;
            }
        }
        return false;
        
    }
}