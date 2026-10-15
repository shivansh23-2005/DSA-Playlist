// LeetCode Problem: Search a 2D Matrix II
// Link: https://leetcode.com/problems/search-a-2d-matrix-ii/
// Difficulty: Medium
// Language: cpp

class Solution {
public:
    bool searchMatrix(vector<vector<int>>& matrix, int target) {
        int i=0;
        int j=matrix[0].size()-1;
        while(i<matrix.size()&&j>=0){
            if(matrix[i][j]==target)
            return 1;

            else if(matrix[i][j]<target)
            i++;
            else
            j--;
        }
        return 0;
    }
};